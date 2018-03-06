package by.epam.pretraining.chertok.tasks.task6.model.stack;

import by.epam.pretraining.chertok.tasks.task6.model.ArrayDataType;
import by.epam.pretraining.chertok.tasks.task6.model.exceptions.ContainerIsEmptyException;

public class ArrayStack<T> extends ArrayDataType implements Stack<T> {

    @Override
    public boolean isEmpty() {
        return numberOfElements == 0;
    }

    @Override
    public int size() {
        return numberOfElements;
    }

    @Override
    public void push(T element) {
        if (array.length == numberOfElements) {
            expand();
        }

        array[numberOfElements++] = element;
    }

    @Override
    public T peek() throws ContainerIsEmptyException {
        if (numberOfElements == 0) {
            throw new ContainerIsEmptyException();
        }
        return (T) array[numberOfElements - 1];
    }

    @Override
    public T pop() {
//        throws ContainerIsEmptyException
//        if (numberOfElements == 0) {
//            throw new ContainerIsEmptyException();
//        }

        Object popped = array[numberOfElements - 1];
        array[numberOfElements--] = null;

        return (T) popped;
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
