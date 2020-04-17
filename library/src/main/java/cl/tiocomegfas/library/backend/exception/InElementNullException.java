package cl.tiocomegfas.library.backend.exception;

public class InElementNullException extends RuntimeException {

    public InElementNullException() {
    }

    public InElementNullException(String message) {
        super(message);
    }

    public InElementNullException(String message, Throwable cause) {
        super(message, cause);
    }

    public InElementNullException(Throwable cause) {
        super(cause);
    }
}
