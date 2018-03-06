package by.epam.pretraining.chertok.tasks.task6.model;

public class ContainerIsFullException extends Exception {

    public ContainerIsFullException() {
        super();
    }

    public ContainerIsFullException(String msg) {
        super(msg);
    }

    public ContainerIsFullException(Exception e) {
        super(e);
    }

    public ContainerIsFullException(String msg, Exception e) {
        super(msg, e);
    }
}
