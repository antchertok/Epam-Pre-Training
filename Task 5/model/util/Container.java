package by.epam.pretraining.chertok.tasks.task5.model.util;

public interface Container<T> extends Iterable<T>, Cloneable{
    int size();
    boolean isEmpty();
    void add(T element);
    void add(T element, int index);
    void addAll(T... elements);
    Object get(int index);
    void remove(int index);
    void removeAll();
    boolean contains(T element);
    boolean containsAll(T... elements);
}
