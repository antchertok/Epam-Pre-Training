package by.epam.pretraining.chertok.tasks.task6.model;

public abstract class AbstractDataType<T> implements AbstractData {
    private static final int DEFAULT_CAPACITY = 10;
    protected Object[] array;
    protected int numberOfElements = 0;

    public AbstractDataType() {
        array = new Object[DEFAULT_CAPACITY];
    }

    public AbstractDataType(int capacity) {
        array = new Object[capacity];
    }

    @Override
    public boolean isEmpty() {
        return numberOfElements == 0;
    }

    @Override
    public int size() {
        return numberOfElements;
    }
}
