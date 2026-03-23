package refactoring;

/**
 * Demo entry point for the geometry collection.
 * <p>
 * Refactored to demonstrate the new ID uniqueness rule enforced by {@link GeometryCollection}.
 * </p>
 */
public class DrawIt {

    public static void main(String[] args) {

        GeometryCollection<Geometry> construction = new GeometryCollection<>();

        try {
            Geometry filledGreyRect = new Rectangle(1, 2, 6, true, "grey");
            Geometry unfilledBlueRect = new Rectangle(2, 8, 9, false, "blue");
            Geometry filledGreyCircle = new Circle(3, 3, true, "grey");
            Geometry unfilledRedCircle = new Circle(4, 3, false, "red");

            construction.add(filledGreyRect);
            construction.add(unfilledBlueRect);
            construction.add(filledGreyCircle);
            construction.add(unfilledRedCircle);

            System.out.println("The area of object 4 is: " + construction.getById(4).calculateArea());
            System.out.println("Contains red circle? " + construction.contains(unfilledRedCircle));

            construction.remove(unfilledRedCircle);

            System.out.println("Contains red circle after removal? " + construction.contains(unfilledRedCircle));

            // This now correctly throws:
            System.out.println(construction.getById(4).calculateArea());

        } catch (IdException e) {
            System.out.println("ID error: " + e.getMessage());
        } catch (InvalidAccessException e) {
            System.out.println("Access error: " + e.getMessage());
        } catch (IllegalArgumentException e) {
            System.out.println("Invalid geometry: " + e.getMessage());
        }
    }
}