package by.epam.pretraining.chertok.tasks.task7.controller;

import by.epam.pretraining.chertok.tasks.task7.model.NoSuchElementException;
import by.epam.pretraining.chertok.tasks.task7.model.Tree;
import by.epam.pretraining.chertok.tasks.task7.model.TreeMaker;
import by.epam.pretraining.chertok.tasks.task7.view.View;

public class Test {

    public static void main(String[] args) {
        Tree<Double> tree = TreeMaker.TREE_MAKER.makeTreeDouble(20);

        double removing = 0.3141593;

        View.print(tree.size());
        View.print(tree.first());
        tree.add(removing);
        View.print(tree.getAll());

        View.print(tree.contains(removing));
        View.print(tree.size());

//        Исправлю в ближайшее время
        try {
            tree.remove(removing);
        } catch (NoSuchElementException e) {
            e.printStackTrace();
        }

        View.print(tree.size());
        View.print(removing);
        View.print(tree.contains(removing));
        View.print(tree.getAll());

    }
}
