package second.model;

public class UnsupportedAmountOfMoodsException extends Exception {
    public UnsupportedAmountOfMoodsException() {
    }

    public UnsupportedAmountOfMoodsException(String message, Throwable cause) {
        super(message, cause);
    }

    public UnsupportedAmountOfMoodsException(String message) {
        super(message);
    }

    public UnsupportedAmountOfMoodsException(Throwable cause) {
        super(cause);
    }
}
