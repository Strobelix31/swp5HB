package refactoring;

/**
 * Axis-aligned rectangle defined by width and height.
 */
public class Rectangle extends Geometry {

    private final double width;
    private final double height;

    /**
     * Creates a rectangle.
     *
     * @param id     unique ID 
     * @param width  must be >= 0
     * @param height must be >= 0
     * @param filled filled flag
     * @param color  color name
     * @throws IllegalArgumentException if width/height is negative
     */
    public Rectangle(int id, double width, double height, boolean filled, String color) {
        super(id, filled, color);
        if (width < 0 || height < 0) {
            throw new IllegalArgumentException("width/height must be >= 0");
        }
        this.width = width;
        this.height = height;
    }

    public double getWidth() {
        return width;
    }

    public double getHeight() {
        return height;
    }

    @Override
    public double calculateArea() {
        return width * height;
    }

    @Override
    public double getPerimeter() {
        return 2 * (width + height);
    }
}