package by.epam.pretraining.chertok.tasks.task6.model.exceptions;

public class ContainerIsEmptyException extends Exception {

    public ContainerIsEmptyException() {
        super();
    }

    public ContainerIsEmptyException(String msg) {
        super(msg);
    }

    public ContainerIsEmptyException(Exception e) {
        super(e);
    }

    public ContainerIsEmptyException(String msg, Exception e) {
        super(msg, e);
    }
}
