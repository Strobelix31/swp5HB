package refactoring;

/**
 * A square is a special rectangle with equal side lengths.
 * This class exists to model the domain explicitly and to avoid passing width/height separately.
 */
public class Square extends Rectangle {

    private final double side;

    /**
     * Creates a square.
     *
     * @param id unique ID
     * @param side must be >= 0
     * @param filled filled flag
     * @param color color name
     */
    public Square(int id, double side, boolean filled, String color) {
        super(id, side, side, filled, color);
        this.side = side;
    }

    public double getSide() {
        return side;
    }
}