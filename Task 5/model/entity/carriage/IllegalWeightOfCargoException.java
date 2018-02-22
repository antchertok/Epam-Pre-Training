package by.epam.pretraining.chertok.tasks.task5.model.entity.carriage;

public class IllegalWeightOfCargoException extends Exception {
    public IllegalWeightOfCargoException() {
    }

    public IllegalWeightOfCargoException(String message, Throwable cause) {
        super(message, cause);
    }

    public IllegalWeightOfCargoException(String message) {
        super(message);
    }

    public IllegalWeightOfCargoException(Throwable cause) {
        super(cause);
    }
}
