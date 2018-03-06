package by.epam.pretraining.chertok.tasks.task8.controller;

import by.epam.pretraining.chertok.tasks.task9.view.View;

import java.util.Arrays;

import static by.epam.pretraining.chertok.tasks.task8.model.integerWorkers.Sorter.SORTER;
import static by.epam.pretraining.chertok.tasks.task8.model.integerWorkers.Searcher.SEARCHER;

public class Test {

    public static void main(String[] args) {
        int[] a = {0,9,8,7,6,5,4,3,2,1};

        View.print(Arrays.toString(SORTER.bubbleSort(a)));
        View.print(Arrays.toString(SORTER.insertionSort(a)));
        View.print(Arrays.toString(SORTER.selectioSort(a)));
        View.print(Arrays.toString(SORTER.mergeSort(a)));
        View.print(Arrays.toString(SORTER.quickSort(a)));

        View.print(SEARCHER.containsBinary(1,a));
        View.print(SEARCHER.containsBinaryIterate(1,a));
        View.print(SEARCHER.containsLinear(1,a));
        View.print(SEARCHER.containsLinearIterate(1,a));

        View.print(SEARCHER.containsBinary(-1,a));
        View.print(SEARCHER.containsBinaryIterate(-1,a));
        View.print(SEARCHER.containsLinear(-1,a));
        View.print(SEARCHER.containsLinearIterate(-1,a));
    }
}
