package sixth.model.queue;

import sixth.model.ContainerIsFullException;

public class StaticQueue<T> extends Queue<T> {

    public void enequeue(T element) throws ContainerIsFullException {
        if (isFull()) {
            throw new ContainerIsFullException();
        }
        array[numberOfElements++] = element;
    }


}
