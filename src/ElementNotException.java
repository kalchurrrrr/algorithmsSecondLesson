public class ElementNotException extends RuntimeException {
    public ElementNotException() {
    }

    public ElementNotException(String message) {
        super(message);
    }

    public ElementNotException(String message, Throwable cause) {
        super(message, cause);
    }

    public ElementNotException(Throwable cause) {
        super(cause);
    }

    public ElementNotException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
