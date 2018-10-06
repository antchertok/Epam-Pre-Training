package by.epam.pretraining.chertok.tasks.task6.model.queue;

import by.epam.pretraining.chertok.tasks.task6.model.ListDataType;
import by.epam.pretraining.chertok.tasks.task6.model.exceptions.ContainerIsEmptyException;

public class ListQueue<T> extends ListDataType implements Queue<T> {

    @Override
    public boolean isEmpty() {
        return list.isEmpty();
    }

    @Override
    public int size() {
        return list.size();
    }

    @Override
    public void enequeue(T element) {
        list.addLast(element);
    }

    @Override
    public T peek() throws ContainerIsEmptyException{
        if(list.isEmpty()){
            throw new ContainerIsEmptyException();
        }
        return (T) list.getFirst();
    }

    @Override
    public T dequeue() throws ContainerIsEmptyException{
        if(list.isEmpty()){
            throw new ContainerIsEmptyException();
        }
        return (T) list.popFirst();
    }

}
