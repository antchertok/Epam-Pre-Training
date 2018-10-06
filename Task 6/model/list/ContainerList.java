package by.epam.pretraining.chertok.tasks.task6.model.list;

public interface ContainerList<T> extends Iterable<T>{
    int size();
    boolean isEmpty();
    void addFirst(T elements);
    void addLast(T element);
    void addAll(T... elements);
    Object getFirst();
    Object getLast();
    Object popFirst();
    Object popLast();
    void remove(T element);
    void removeAll();
    boolean contains(T element);
    boolean containsAll(T... elements);
}
