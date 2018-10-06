package by.epam.pretraining.chertok.tasks.task6.model.queue;

import by.epam.pretraining.chertok.tasks.task6.model.AbstractDataType;
import by.epam.pretraining.chertok.tasks.task6.model.exceptions.ContainerIsEmptyException;

public interface Queue<T> extends AbstractDataType<T> {

    void enequeue(T element);

    T dequeue() throws ContainerIsEmptyException;
}
