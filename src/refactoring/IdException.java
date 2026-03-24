package refactoring;

/**
 * Thrown when a geometry ID constraint is violated (e.g. duplicate IDs).
 */
public class IdException extends Exception {

    private static final long serialVersionUID = 1L;

    public IdException(String message) {
        super(message);
    }
}