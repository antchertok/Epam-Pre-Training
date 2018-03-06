package by.epam.pretraining.chertok.tasks.task6.model.queue;

import by.epam.pretraining.chertok.tasks.task6.model.AbstractDataType;
import by.epam.pretraining.chertok.tasks.task6.model.ContainerIsEmptyException;
import by.epam.pretraining.chertok.tasks.task6.model.ContainerIsFullException;

public abstract class Queue<T> extends AbstractDataType<T> {
    public abstract void enequeue(T element) throws ContainerIsFullException;

    @Override
    public T peek() throws ContainerIsEmptyException {
        if (isEmpty()) {
            throw new ContainerIsEmptyException();
        }
        return (T) array[array.length - numberOfElements];
    }

    public T dequeue() throws ContainerIsEmptyException {
        if (isEmpty()) {
            throw new ContainerIsEmptyException();
        }

        Object dequeued = array[array.length - numberOfElements];
        array[array.length - numberOfElements--] = null;

        return (T) dequeued;
    }

    public boolean isFull() {
        return array[array.length - 1] != null;
    }
}
