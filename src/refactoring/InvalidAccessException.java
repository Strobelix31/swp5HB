package refactoring;

/**
 * Thrown when an element is requested from a collection but cannot be found.
 */
public class InvalidAccessException extends Exception {

    private static final long serialVersionUID = 1L;

    public InvalidAccessException(String message) {
        super(message);
    }
}