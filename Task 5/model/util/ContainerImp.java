package by.epam.pretraining.chertok.tasks.task5.model.util;

import java.util.Arrays;
import java.util.Iterator;

public class ContainerImp<T> implements Container<T> {
    private static final int DEFAULT_CAPARCITY = 10;
    private int numberOfElements = 0;
    private Object[] array;

    public ContainerImp() {
        array = new Object[DEFAULT_CAPARCITY];
    }

    public ContainerImp(int caparcity) {
        array = new Object[caparcity];
    }

    public ContainerImp clone() throws CloneNotSupportedException {
        return (ContainerImp) super.clone();
    }

    public int size() {
        return numberOfElements;
    }

    public boolean isEmpty() {
        return numberOfElements == 0;
    }

    public void add(T element) {
        if (numberOfElements == array.length) {
            expand();
        }
        array[numberOfElements] = element;
        numberOfElements++;
    }

    public void add(T element, int index) {
        if (numberOfElements == array.length) {
            expand();
        }
        Object[] tempArray = new Object[array.length - index];
        for (int i = index; i <= array.length; i++) {
            tempArray[i - index] = array[i];
        }
        array[index] = element;
        for (int i = 0; i <= tempArray.length; i++) {
            array[i + index + 1] = tempArray[i];
        }
        numberOfElements++;
    }

    public void addAll(T... elements) {
        if (numberOfElements + elements.length >= array.length) {
            expand(elements.length);
        }

        for (T element : elements) {
            add(element);
        }

        numberOfElements += elements.length;
    }

    public T get(int index) {
        if (index >= array.length) {
            return null; //Обязательно ли здесь бросать проверяемое исключение?
        }
        return (T) array[index];
    }

    public void remove(int index) {
        if (index >= numberOfElements) {
            return;
        }

        int nextElement = index + 1;
        Object[] tempArray = new Object[array.length - nextElement];

        for (int i = 0; i < tempArray.length; i++) {
            tempArray[i] = array[i + nextElement];
        }

        for (int i = 0; i < tempArray.length; i++) {
            array[i + index] = tempArray[i];
        }
        numberOfElements--;
    }

    public void removeAll() {
        for (int i = 0; i < numberOfElements; i++) {
            array[i] = null;
        }
        numberOfElements = 0;
    }

    public boolean contains(Object element) {
        for (int i = 0; i < numberOfElements; i++) {
            if (array[i].equals(element)) {
                return true;
            }
        }
        return false;
    }

    public boolean containsAll(T... elements) {
        for (Object element : elements) {
            if (!contains(element)) {
                return false;
            }
        }
        return true;
    }

    @Override
    public String toString() {
        return Arrays.toString(array);
    }

    @Override
    public Iterator<T> iterator() {
        Iterator<T> it = new Iterator<T>() {
            int current = 0;

            @Override
            public boolean hasNext() {
//                return get(current + 1) != null;
                return current < numberOfElements;
            }

            @Override
            public T next() {
                return get(current++);
            }
        };
        return it;
    }


    private void expand() {
        Object[] tempArray = new Object[array.length];
        System.arraycopy(array, 0, tempArray,0, array.length);

        array = new Object[tempArray.length * 2];
        System.arraycopy(tempArray, 0, array,0, tempArray.length);
    }

    private void expand(int amountOfElements) {
        Object[] tempArray = new Object[array.length];
        System.arraycopy(array, 0, tempArray,0, array.length);

        array = new Object[tempArray.length + amountOfElements];
        System.arraycopy(tempArray, 0, array,0, tempArray.length);

    }

}
