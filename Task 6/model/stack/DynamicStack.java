package by.epam.pretraining.chertok.tasks.task6.model.stack;

public class DynamicStack<T> extends Stack<T> {
    public void push(T element) {
        if (array.length == numberOfElements) {
            expand();
        }

        array[numberOfElements++] = element;
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
