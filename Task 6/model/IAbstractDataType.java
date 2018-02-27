package sixth.model;

public interface IAbstractDataType<T> {
    int size();

    T peek() throws ContainerIsEmptyException;

    boolean isEmpty();
}
