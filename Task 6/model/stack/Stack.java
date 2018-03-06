package by.epam.pretraining.chertok.tasks.task6.model.stack;

import by.epam.pretraining.chertok.tasks.task6.model.AbstractDataType;
import by.epam.pretraining.chertok.tasks.task6.model.ContainerIsEmptyException;
import by.epam.pretraining.chertok.tasks.task6.model.ContainerIsFullException;

public abstract class Stack<T> extends AbstractDataType {

    public abstract void push(T element) throws ContainerIsFullException;

    @Override
    public T peek() throws ContainerIsEmptyException {
        if (numberOfElements == 0) {
            throw new ContainerIsEmptyException();
        }
        return (T) array[numberOfElements - 1];
    }

    public T pop() throws ContainerIsEmptyException {
        if (numberOfElements == 0) {
            throw new ContainerIsEmptyException();
        }

        Object popped = array[numberOfElements - 1];
        array[numberOfElements--] = null;

        return (T) popped;
    }

    public boolean isFull() {
        return array.length == numberOfElements;
    }
}
