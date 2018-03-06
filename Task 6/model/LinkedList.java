package by.epam.pretraining.chertok.tasks.task6.model;

import java.util.Iterator;

public class LinkedList<T> implements ContainerList<T> {
    Node head;
    Node tail;
    int size;

    @Override
    public int size() {
        return size;
    }

    @Override
    public boolean isEmpty() {
        return size == 0;
    }

    @Override
    public void addLast(T element) {
        if (head == null) {
            head = new Node(element, null);
            tail = head;
        } else {
            addTo(head, null, element);
        }
        size++;
    }

    @Override
    public void addFirst(T element) {
        Node newFirst = new Node(element, null);
        newFirst.next = head;
        head.previous = newFirst;
        head = newFirst;
        size++;
    }

    @Override
    public void addAll(T... elements) {
        for (T element : elements) {
            addLast(element);
        }
        size+=elements.length;
    }

    @Override
    public void remove(T element) {
        removeNode(findNode(head, element));
        size--;
    }

    @Override
    public void removeAll() {
        head = null;
        size = 0;
    }

    @Override
    public T getFirst(){
        return (T)head.data;
    }

    @Override
    public T getLast(){
        return (T)tail.data;
    }

    @Override
    public T popFirst(){
        T data = (T) head.data;
        removeNode(head);
        size--;
        return data;
    }

    @Override
    public T popLast(){
        T data = (T) tail.data;
        removeNode(tail);
        size--;
        return data;
    }

    @Override
    public boolean contains(T element) {
        return head != null && findNode(head, element) != null;
    }

    @Override
    public boolean containsAll(T... elements) {
        for (T element : elements) {
            if (findNode(head, element) == null) {
                return false;
            }
        }
        return true;
    }

    @Override
    public Iterator<T> iterator() {
        return new Iterator<T>() {
            private int count;
            private Node step;

            @Override
            public boolean hasNext() {
                return count < size;
            }

            @Override
            public T next() {
                count++;
                step = step == null ? head : step.next;
                return (T) step.data;
            }
        };
    }

    private void removeNode(Node node) {
        if(node == head){
            head = head.next;
            head.previous = null;
            return;
        }
        if(node == tail){
            tail = node.previous;
            tail.next = null;
            return;
        }
        node.previous.next = node.next;
        node.next.previous = node.previous;
    }

    private class Node {
        Object data;
        Node previous;
        Node next;

        Node(Object data, Node previous) {
            this.data = data;
            this.previous = previous;
            if (previous != null) {
                previous.next = this;
            }
        }
    }

    private void addTo(Node node, Node previous, T element) {
        if (node != null) {
            addTo(node.next, node, element);
        } else {
            node = new Node(element, previous);
            previous.next = node;
            tail = node;
        }
    }

    private Node findNode(Node node, T element) {
        while (node != null) {
            if (node.data.equals(element)) {
                return node;
            }
            node = node.next;
        }
        return null;
    }
}
