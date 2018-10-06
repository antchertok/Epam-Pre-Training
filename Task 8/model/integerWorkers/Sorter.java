package by.epam.pretraining.chertok.tasks.task8.model.integerWorkers;

public enum Sorter {
    SORTER;

    public int[] bubbleSort(int[] unsorted) {
        for (int i = 0; i < unsorted.length - 1; i++) {
            boolean isSorted = true;

            for (int j = 0; j < unsorted.length - 1 - i; j++) {
                if (unsorted[j] > (unsorted[j + 1])) {
                    int temp = unsorted[j + 1];
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

    public int[] insertionSort(int[] unsorted) {
        for (int i = 1; i < unsorted.length; i++) {

            int transfer = unsorted[i];
            int j = i;

            while (j > 0 && transfer < (unsorted[j - 1])) {
                unsorted[j] = unsorted[j - 1];
                j--;
            }
            unsorted[j] = transfer;
        }
        return unsorted;
    }

    public int[] selectioSort(int[] unsorted) {
        for (int i = 0; i < unsorted.length - 1; i++) {
            int min = unsorted[i];
            int indexMin = i;

            for (int j = i + 1; j < unsorted.length; j++) {
                if (min > (unsorted[j])) {
                    min = unsorted[j];
                    indexMin = j;
                }
            }

            int temp = unsorted[i];
            unsorted[i] = min;
            unsorted[indexMin] = temp;
        }
        return unsorted;
    }

    public int[] mergeSort(int[] unsorted) {
        if (unsorted.length == 1) {
            return unsorted;
        }

        int divider = unsorted.length / 2;
        int[] first = new int[divider];
        int[] second = new int[unsorted.length - divider];
        System.arraycopy(unsorted, 0, first, 0, divider);
        System.arraycopy(unsorted, divider, second, 0, unsorted.length - divider);

        first = mergeSort(first);
        second = mergeSort(second);
        int i = 0, j = 0;
        int[] result = uniteSortedArrays(first, second);

        return result;
    }

    public int[] quickSort(int[] unsorted) {
        return startQuickSort(unsorted, 0, unsorted.length - 1);
    }

    private int[] startQuickSort(int[] unsorted, int left, int right) {
        int pivot = (left + right) / 2;
        int i = left, j = right;
        while (unsorted[i] < (unsorted[pivot]) && i < j) {
            i++;
        }
        while (unsorted[j] > (unsorted[pivot]) && j > pivot) {
            j--;
        }

        int temp = unsorted[i];
        unsorted[i] = unsorted[j];
        unsorted[j] = temp;

        if (i + 1 < right) unsorted = startQuickSort(unsorted, i + 1, right);
        if (j - 1 > left) unsorted = startQuickSort(unsorted, left, j - 1);
        return unsorted;

    }

    private int[] uniteSortedArrays(int[] first, int[] second) {
        int[] result = new int[first.length + second.length];
        int i = 0, j = 0;
        while (i < first.length && j < second.length) {
            if (first[i] < (second[j])) {
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
