package by.epam.pretraining.chertok.tasks.task6.model.queue;

import by.epam.pretraining.chertok.tasks.task6.model.ContainerIsFullException;

public class StaticQueue<T> extends Queue<T> {

    public void enequeue(T element) throws ContainerIsFullException {
        if (isFull()) {
            throw new ContainerIsFullException();
        }
        array[numberOfElements++] = element;
    }


}
