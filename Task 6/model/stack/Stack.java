package by.epam.pretraining.chertok.tasks.task6.model.stack;

import by.epam.pretraining.chertok.tasks.task6.model.AbstractDataType;
import by.epam.pretraining.chertok.tasks.task6.model.exceptions.ContainerIsEmptyException;

public interface Stack<T> extends AbstractDataType<T> {

    void push(T element);

    T pop() throws ContainerIsEmptyException;
}
