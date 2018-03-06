package by.epam.pretraining.chertok.tasks.task7.model;

import java.util.*;

public class Tree<T extends Comparable> {
    private ArrayList arrayList = new ArrayList();
    private TreeNode root;
    private int size;
    Comparator<T> comparator;

    public Tree() {
        comparator = new Comparator<T>() {
            @Override
            public int compare(T o1, T o2) {
                return o1.compareTo(o2);
            }
        };
    }

    public Tree(Comparator comparator) {
        this.comparator = comparator;
    }

    public int getSize() {
        return size;
    }

    public void clear() {
        root = null;
        size = 0;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public void add(T element) {
        if (root == null) {
            root = new TreeNode(element, null);
            size++;
        } else {
            addTo(root, element);
        }
    }

    public T first() {
        return (T) findLeft(root).data;
    }

    public void remove(T element) throws NoSuchElementException {
        //parent == null?(first element)
        if (root == null) {
            throw new NoSuchElementException();
        }

        TreeNode removing = findElement(root, element);
        if (removing == null) {
            throw new NoSuchElementException();
        }

        if ((removing.left == null) && (removing.right == null)) {
            if (removing.parent.left == removing) {
                removing.parent.left = null;
            } else {
                removing.parent.right = null;
            }
        } else if ((removing.left != null) && (removing.right == null)) {
            if (removing.parent.left == removing) {
                removing.parent.left = removing.left;
            } else {
                removing.parent.right = removing.left;
            }
        } else if ((removing.right.left == null)) {
            removing.right.left = removing.left;

            if (removing.parent.left == removing) {
                removing.parent.left = removing.right;
            } else {
                removing.parent.right = removing.left;
            }
        } else {
            TreeNode replacer = findLeft(removing);
            replacer.parent = removing.parent;
            replacer.left = removing.left;
            replacer.right = removing.right;

            if (removing.parent.left == removing) {
                removing.parent.left = replacer;
            } else {
                removing.parent.right = replacer;
            }
        }
        size--;
    }

    public boolean contains(T element) {
        return findElement(root, element) != null;
    }

    private void addTo(TreeNode node, T element) {
        if (comparator.compare(element, (T) node.data) < 0) {
            if (node.left == null) {
                node.left = new TreeNode(element, node);
                size++;
            } else {
                addTo(node.left, element);
            }
        } else if (comparator.compare(element, (T) node.data) > 0) {
            if (node.right == null) {
                node.right = new TreeNode(element, node);
                size++;
            } else {
                addTo(node.right, element);
            }
        }
    }

    public List<T> getAll() {
        if (root != null) {
            List<T> branch = new LinkedList();
            branch.addAll(getData(root));
            return branch;
        }
        return null;
    }

    private TreeNode findElement(TreeNode node, T element) {
        TreeNode required;

        if (comparator.compare(element, (T) node.data) < 0) {
            if (node.left == null) {
                required = null;
            } else {
                required = findElement(node.left, element);
            }
        } else if (comparator.compare(element, (T) node.data) > 0) {
            if (node.right == null) {
                required = null;
            } else {
                required = findElement(node.right, element);
            }
        } else {
            required = node;
        }

        return required;
    }

    private List<T> getData(TreeNode node) {
        List<T> branch = new LinkedList<>();
        if (node.left != null) {
            branch.addAll(getData(node.left));
        }
        branch.add((T) node.data);
        if (node.right != null) {
            branch.addAll(getData(node.right));
        }
        return branch;
    }

    private TreeNode findLeft(TreeNode node) {
        while (node.left != null) {
            node = node.left;
        }
        return node;
    }

    private class TreeNode<T extends Comparable> {
        private T data;
        private TreeNode left;
        private TreeNode right;
        private TreeNode parent;

        private TreeNode(T element, TreeNode parent) {
            data = element;
            this.parent = parent;
        }
    }

}


