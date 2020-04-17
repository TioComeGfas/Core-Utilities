package cl.tiocomegfas.library.backend.parser;

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

    public InElementNullException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
