package refactoring;

/**
 * Thrown when a geometry ID constraint is violated (e.g. duplicate IDs).
 * <p>
 * Kept as a checked exception because the assignment explicitly models ID errors
 * and callers should handle them deliberately.
 * </p>
 */
public class IdException extends Exception {

    private static final long serialVersionUID = 1L;

    public IdException(String message) {
        super(message);
    }
}