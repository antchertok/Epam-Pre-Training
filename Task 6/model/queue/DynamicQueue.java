package sixth.model.queue;

public class DynamicQueue<T> extends Queue<T> {

    public void enequeue(T element) {
        if (isFull()) {
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
