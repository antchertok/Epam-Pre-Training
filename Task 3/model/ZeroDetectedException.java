package third.model;

public class ZeroDetectedException extends Exception {
    public ZeroDetectedException() {
    }

    public ZeroDetectedException(String message, Throwable cause) {
        super(message, cause);
    }

    public ZeroDetectedException(String message) {
        super(message);
    }

    public ZeroDetectedException(Throwable cause) {
        super(cause);
    }
}
