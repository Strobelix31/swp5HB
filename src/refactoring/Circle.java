package refactoring;

/**
 * A circle defined by its radius.
 */
public class Circle extends Geometry {

    private double radius;

    /**
     * Creates a circle.
     *
     * @param id     unique ID (checked by {@link GeometryCollection})
     * @param radius radius, must be >= 0
     * @param filled filled flag
     * @param color  color name
     * @throws IllegalArgumentException if radius is negative
     */
    public Circle(int id, double radius, boolean filled, String color) {
        super(id, filled, color);
        setRadius(radius);
    }

    public double getRadius() {
        return radius;
    }

    /**
     * Sets the radius.
     * <p>
     * Validation is done here to keep the object always in a valid state.
     * </p>
     *
     * @param radius must be >= 0
     * @throws IllegalArgumentException if radius is negative
     */
    public void setRadius(double radius) {
        if (radius < 0) {
            throw new IllegalArgumentException("radius must be >= 0");
        }
        this.radius = radius;
    }

    public double getDiameter() {
        return 2 * radius;
    }

    @Override
    public double calculateArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public double getPerimeter() {
        return 2 * Math.PI * radius;
    }
}