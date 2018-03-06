package by.epam.pretraining.chertok.tasks.task6.model;

public abstract class ArrayDataType {
    private static final int DEFAULT_CAPACITY = 10;
    protected Object[] array;
    protected int numberOfElements = 0;

    public ArrayDataType() {
        array = new Object[DEFAULT_CAPACITY];
    }

    public ArrayDataType(int capacity) {
        array = new Object[capacity];
    }
}
