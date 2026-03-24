package refactoring;

import java.util.*;

/**
 * Collection for {@link Geometry} objects with ID-based access.
 * @param <T> geometry subtype
 */
public class GeometryCollection<T extends Geometry> {

    private final Map<Integer, T> byId = new LinkedHashMap<>();

    /**
     * Adds a geometry to the collection.
     *
     * @param geometry element to add
     * @throws IdException if the ID already exists
     * @throws IllegalArgumentException if geometry is null
     */
    public void add(T geometry) throws IdException {
        if (geometry == null) {
            throw new IllegalArgumentException("geometry must not be null");
        }
        int id = geometry.getId();
        if (byId.containsKey(id)) {
            throw new IdException("Id must be unique! Duplicate id: " + id);
        }
        byId.put(id, geometry);
    }

    /**
     * Removes a geometry from the collection.
     *
     * @param geometry element to remove
     * @return true if removed, false otherwise
     */
    public boolean remove(T geometry) {
        if (geometry == null) {
            return false;
        }
        return byId.remove(geometry.getId(), geometry);
    }

    public boolean contains(T geometry) {
        return geometry != null && byId.get(geometry.getId()) == geometry;
    }

    /**
     * Returns a geometry by its ID.
     *
     * @param id the geometry ID
     * @return the geometry
     * @throws InvalidAccessException if no element with this ID exists
     */
    public T getById(int id) throws InvalidAccessException {
        T element = byId.get(id);
        if (element == null) {
            throw new InvalidAccessException("No such element with id: " + id);
        }
        return element;
    }

    /** @return an unmodifiable view of all elements */
    public Collection<T> values() {
        return Collections.unmodifiableCollection(byId.values());
    }
}