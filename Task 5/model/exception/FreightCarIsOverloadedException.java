package by.epam.pretraining.chertok.tasks.task5.model.exception;

public class FreightCarIsOverloadedException extends Exception {
    public FreightCarIsOverloadedException() {
    }

    public FreightCarIsOverloadedException(String message, Throwable cause) {
        super(message, cause);
    }

    public FreightCarIsOverloadedException(String message) {
        super(message);
    }

    public FreightCarIsOverloadedException(Throwable cause) {
        super(cause);
    }
}
