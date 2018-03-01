package by.epam.pretraining.chertok.tasks.task7.model;

public enum TreeMaker {
    TREE_MAKER;

    public Tree makeTreeDouble(int amount) {
        Tree<Double> tree = new Tree();
        for (int i = 0; i < amount; i++) {
            tree.add(Math.random());
        }
        return tree;
    }
}
