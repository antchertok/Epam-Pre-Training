package by.epam.pretraining.chertok.tasks.task6.model;

import by.epam.pretraining.chertok.tasks.task6.model.exceptions.ContainerIsEmptyException;

public interface AbstractDataType<T> {
    int size();

    T peek() throws ContainerIsEmptyException;

    boolean isEmpty();
}
