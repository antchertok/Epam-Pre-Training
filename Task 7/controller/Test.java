package by.epam.pretraining.chertok.tasks.task7.controller;

import by.epam.pretraining.chertok.tasks.task7.model.Tree;
import by.epam.pretraining.chertok.tasks.task7.view.View;

public class Test {

    public static void main(String[] args) {
        Tree<Double> tree = new Tree<>();
        double removing = 0;
        for (int i = 0; i < 30; i++) {
            double element = Math.random() * 100;
            tree.add(element);
            if(i == 25){
                removing = element;
            }
        }
        View.print(tree.size());
        View.print(tree.getAll());
        View.print(tree.first());

        View.print(tree.contains(removing));
//        TreeRemoveRunner.REMOVE_RUNNER.remove(removing);
        View.print(tree.size());
        View.print(removing);
        View.print(tree.contains(removing));
        View.print(tree.getAll());

    }
}
