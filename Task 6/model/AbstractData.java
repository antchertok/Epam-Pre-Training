package by.epam.pretraining.chertok.tasks.task6.model;

public interface AbstractData<T> {
    int size();

    T peek() throws ContainerIsEmptyException;

    boolean isEmpty();
}
