package by.epam.pretraining.chertok.tasks.task6.model;

import by.epam.pretraining.chertok.tasks.task6.model.list.LinkedList;

public abstract class ListDataType {
    protected LinkedList list;

    protected ListDataType(){
        list = new LinkedList();
    }
}
