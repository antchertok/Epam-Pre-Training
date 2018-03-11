package by.epam.pretraining.chertok.tasks.task9.model.exceptions;

public class FileNotOpenedException extends Exception {
    public FileNotOpenedException() {
    }

    public FileNotOpenedException(String message, Throwable cause) {
        super(message, cause);
    }

    public FileNotOpenedException(String message) {
        super(message);
    }

    public FileNotOpenedException(Throwable cause) {
        super(cause);
    }
}
