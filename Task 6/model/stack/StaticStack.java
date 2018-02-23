package sixth.model.stack;

import sixth.model.ContainerIsFullException;

public class StaticStack<T> extends Stack<T> {

    public void push(T element) throws ContainerIsFullException {
        if (isFull()) {
            throw new ContainerIsFullException();
        }

        array[numberOfElements++] = element;
    }

}
