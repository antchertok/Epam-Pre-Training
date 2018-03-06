package by.epam.pretraining.chertok.tasks.task6.model.stack;

import by.epam.pretraining.chertok.tasks.task6.model.ContainerIsFullException;

public class StaticStack<T> extends Stack<T> {

    public void push(T element) throws ContainerIsFullException {
        if (isFull()) {
            throw new ContainerIsFullException();
        }

        array[numberOfElements++] = element;
    }

}
