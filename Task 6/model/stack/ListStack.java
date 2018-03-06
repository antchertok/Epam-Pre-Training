package by.epam.pretraining.chertok.tasks.task6.model.stack;

import by.epam.pretraining.chertok.tasks.task6.model.ListDataType;
import by.epam.pretraining.chertok.tasks.task6.model.exceptions.ContainerIsEmptyException;

public class ListStack<T> extends ListDataType implements Stack<T> {

    @Override
    public boolean isEmpty() {
        return list.isEmpty();
    }

    @Override
    public int size() {
        return list.size();
    }

    @Override
    public void push(T element) {
        list.addFirst(element);
    }

    @Override
    public T peek() throws ContainerIsEmptyException{
        if(list.isEmpty()){
            throw new ContainerIsEmptyException();
        }
        return (T) list.getFirst();
    }

    @Override
    public T pop() throws ContainerIsEmptyException{
        if(list.isEmpty()){
            throw new ContainerIsEmptyException();
        }
        return (T) list.popFirst();
    }

}
