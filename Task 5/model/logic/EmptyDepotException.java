package by.epam.pretraining.chertok.tasks.task5.model.logic;

public class EmptyDepotException extends Exception {
    public EmptyDepotException() {
    }

    public EmptyDepotException(String message, Throwable cause) {
        super(message, cause);
    }

    public EmptyDepotException(String message) {
        super(message);
    }

    public EmptyDepotException(Throwable cause) {
        super(cause);
    }
}
