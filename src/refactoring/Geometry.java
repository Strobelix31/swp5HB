package refactoring;

/**
 * Base class for all geometric objects.
 * The class is abstract because each concrete geometry defines its own area and perimeter.
 */
public abstract class Geometry implements Comparable<Geometry> {

    private final int id;
    private final boolean filled;
    private final String color;

    /**
     * Creates a geometry with identity and styling information.
     *
     * @param id     unique identifier
     * @param filled whether the geometry is filled
     * @param color  color name, must not be null/blank
     * @throws IllegalArgumentException if color is null/blank or id is negative
     */
    protected Geometry(int id, boolean filled, String color) {
        if (id < 0) {
            throw new IllegalArgumentException("id must be >= 0");
        }
        if (color == null || color.isBlank()) {
            throw new IllegalArgumentException("color must not be null/blank");
        }
        this.id = id;
        this.filled = filled;
        this.color = color;
    }

    /** @return the area of the geometry */
    public abstract double calculateArea();

    /** @return the perimeter of the geometry */
    public abstract double getPerimeter();

    public final int getId() {
        return id;
    }

    public final boolean isFilled() {
        return filled;
    }

    public final String getColor() {
        return color;
    }

    /**
     * Compares geometries by area.
     *
     * @param other geometry to compare to
     * @return negative if smaller, 0 if equal, positive if larger
     */
    @Override
    public final int compareTo(Geometry other) {
        return Double.compare(this.calculateArea(), other.calculateArea());
    }

    @Override
    public String toString() {
        return getClass().getSimpleName()
                + "{id=" + id
                + ", filled=" + filled
                + ", color='" + color + '\''
                + '}';
    }
}