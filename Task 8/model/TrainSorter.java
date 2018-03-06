package by.epam.pretraining.chertok.tasks.task8.model;

import by.epam.pretraining.chertok.tasks.task5.model.entity.Train;

import java.util.Arrays;

public enum TrainSorter {
    TRAIN_SORTER;

    public Train[] bubbleSort(Train[] unsorted) {
        for (int i = 0; i < unsorted.length - 1; i++) {
            boolean isSorted = true;

            for (int j = 0; j < unsorted.length - 1 - i; j++) {
                if (unsorted[j].compareTo(unsorted[j + 1]) > 0) {
                    Train temp = unsorted[j + 1];
                    unsorted[j + 1] = unsorted[j];
                    unsorted[j] = temp;
                    isSorted = false;
                }
            }
            if (isSorted) {
                break;
            }
        }
        return unsorted;
    }

    public Train[] insertionSort(Train[] unsorted) {
        for (int i = 1; i < unsorted.length; i++) {

            Train transfer = unsorted[i];
            int j = i;

            while (j > 0 && transfer.compareTo(unsorted[j - 1]) < 0) {
                unsorted[j] = unsorted[j - 1];
                j--;
            }
            unsorted[j] = transfer;
        }
        return unsorted;
    }

    public Train[] selectioSort(Train[] unsorted) {
        for (int i = 0; i < unsorted.length - 1; i++) {
            Train min = unsorted[i];
            int indexMin = i;

            for (int j = i + 1; j < unsorted.length; j++) {
                if (min.compareTo(unsorted[j]) > 0) {
                    min = unsorted[j];
                    indexMin = j;
                }
            }

            Train temp = unsorted[i];
            unsorted[i] = min;
            unsorted[indexMin] = temp;
        }
        return unsorted;
    }

    public Train[] mergeSort(Train[] unsorted) {
        if (unsorted.length == 1) {
            return unsorted;
        }

        int divider = unsorted.length / 2;
        Train[] first = new Train[divider];
        Train[] second = new Train[unsorted.length - divider];
        System.arraycopy(unsorted, 0, first, 0, divider);
        System.arraycopy(unsorted, divider, second, 0, unsorted.length - divider);

        first = mergeSort(first);
        second = mergeSort(second);
        int i = 0, j = 0;
        Train[] result = uniteSortedArrays(first, second);

        return result;
    }

    public Train[] startQuickSort(Train[] unsorted) {
        return quickSort(unsorted, 0, unsorted.length - 1);
    }

    private Train[] quickSort(Train[] unsorted, int left, int right) {
        int pivot = (left + right) / 2;
        int i = left, j = right;

        while (unsorted[i].compareTo(unsorted[pivot]) < 0 && i < j) {
            i++;
        }
        while (unsorted[j].compareTo(unsorted[pivot]) > 0 && j > pivot) {
            j--;
        }

        Train temp = unsorted[i];
        unsorted[i] = unsorted[j];
        unsorted[j] = temp;

        if (i + 1 < right) unsorted = quickSort(unsorted, i + 1, right);
        if (j - 1 > left) unsorted = quickSort(unsorted, left, j - 1);
        return unsorted;

    }

    private Train[] uniteSortedArrays(Train[] first, Train[] second) {
        Train[] result = new Train[first.length + second.length];
        int i = 0, j = 0;

        while (i < first.length && j < second.length) {
            if (first[i].compareTo(second[j]) < 0) {
                result[i + j] = first[i++];
            } else {
                result[i + j] = second[j++];
            }
        }

        if (i == first.length) {
            System.arraycopy(second, j, result, i + j, second.length - j);
        } else {
            System.arraycopy(first, i, result, i + j, first.length - i);
        }

        return result;
    }
}
