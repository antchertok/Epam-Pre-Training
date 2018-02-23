package sixth.model;

public interface AbstractData<T> {
    int size();

    T peek() throws ContainerIsEmptyException;

    boolean isEmpty();
}
