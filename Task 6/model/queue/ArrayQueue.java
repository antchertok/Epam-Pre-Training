package by.epam.pretraining.chertok.tasks.task6.model.queue;

import by.epam.pretraining.chertok.tasks.task6.model.ArrayDataType;
import by.epam.pretraining.chertok.tasks.task6.model.exceptions.ContainerIsEmptyException;

public class ArrayQueue<T> extends ArrayDataType implements Queue<T> {
    private int position;

    @Override
    public boolean isEmpty() {
        return numberOfElements == 0;
    }

    @Override
    public int size() {
        return numberOfElements;
    }

    @Override
    public void enequeue(T element) {
        if (array[array.length - 1] != null) {
            expand();
        }
        array[numberOfElements++] = element;
    }

    @Override
    public T peek() throws ContainerIsEmptyException {
        if (isEmpty()) {
            throw new ContainerIsEmptyException();
        }
        return (T) array[array.length - numberOfElements];
    }

    @Override
    public T dequeue() throws ContainerIsEmptyException{
        if (isEmpty()) {
            throw new ContainerIsEmptyException();
        }

        Object dequeued = array[position];
        array[position++] = null;
        numberOfElements--;

        return (T) dequeued;
    }

    private void expand() {
        Object[] tempArray = new Object[numberOfElements];

        for (int i = 0; i < numberOfElements; i++) {
            tempArray[i] = array[i];
        }

        array = new Object[numberOfElements * 2];

        for (int i = 0; i < numberOfElements; i++) {
            array[i] = tempArray[i];
        }
    }


}