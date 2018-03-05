package by.epam.pretraining.chertok.tasks.task8.model.integerWorkers;

import java.util.Arrays;

public enum Sorter {
    SORTER;

    public Integer[] bubbleSort(Integer[] unsorted) {
        for (int i = 0; i < unsorted.length - 1; i++) {
            boolean isSorted = true;
            for (int j = 0; j < unsorted.length - 1 - i; j++) {
                if (unsorted[j].compareTo(unsorted[j + 1]) > 0) {
                    Integer temp = unsorted[j + 1];
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

    public Integer[] insertionSort(Integer[] unsorted) {
        for (int i = 1; i < unsorted.length; i++) {

            Integer transfer = unsorted[i];
            int j = i;
            while (j > 0 && transfer.compareTo(unsorted[j - 1]) < 0) {
                unsorted[j] = unsorted[j - 1];
                j--;
            }
            unsorted[j] = transfer;
        }
        return unsorted;
    }

    public Integer[] selectioSort(Integer[] unsorted) {
        for (int i = 0; i < unsorted.length - 1; i++) {
            Integer min = unsorted[i];
            int indexMin = i;
            for (int j = i + 1; j < unsorted.length; j++) {
                if (min.compareTo(unsorted[j]) > 0) {
                    min = unsorted[j];
                    indexMin = j;
                }
            }

            Integer temp = unsorted[i];
            unsorted[i] = min;
            unsorted[indexMin] = temp;
        }
        return unsorted;
    }

    public Integer[] mergeSort(Integer[] unsorted) {
        if (unsorted.length == 1) {
            return unsorted;
        }

        int divider = unsorted.length / 2;
        Integer[] first = new Integer[divider];
        Integer[] second = new Integer[unsorted.length - divider];
        System.arraycopy(unsorted, 0, first, 0, divider);
        System.arraycopy(unsorted, divider, second, 0, unsorted.length - divider);

        first = mergeSort(first);
        second = mergeSort(second);
        int i = 0, j = 0;
        Integer[] result = uniteSortedArrays(first, second);

        return result;
    }

    public Integer[] startQuickSort(Integer[] unsorted){
        return quickSort(unsorted,0,unsorted.length-1);
    }

    private Integer[] quickSort(Integer[] unsorted, int left, int right) {
        int pivot = (left+right) / 2;
        int i = left, j = right;
        while(unsorted[i].compareTo(unsorted[pivot]) < 0 && i < j){
            i++;
        }
        while(unsorted[j].compareTo(unsorted[pivot]) > 0 && j > pivot){
            j--;
        }

        Integer temp = unsorted[i];
        unsorted[i] = unsorted[j];
        unsorted[j] = temp;

        if(i + 1 < right)unsorted = quickSort(unsorted,i+1,right);
        if(j - 1 > left)unsorted = quickSort(unsorted,left,j-1);
        return unsorted;

    }

    private Integer[] uniteSortedArrays(Integer[] first, Integer[] second) {
        Integer[] result = new Integer[first.length + second.length];
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

    public static void main(String[] args) {
        Integer[] sorted = SORTER.startQuickSort(new Integer[]{3,2,1,0,-1,9,8,7,6,5,7,4});
        System.out.println(Arrays.toString(sorted));
        System.out.println(Arrays.toString(SORTER.uniteSortedArrays(new Integer[]{2, 3}, new Integer[]{0, 1})));
        int[] a = {5, 5};
        int b = 1;
        a[b] = b = 0;
        System.out.println(Arrays.toString(a));
    }
}
