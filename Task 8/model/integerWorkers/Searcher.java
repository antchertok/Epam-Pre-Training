package by.epam.pretraining.chertok.tasks.task8.model.integerWorkers;

import java.util.Arrays;

public enum Searcher {
    SEARCHER;

    public boolean containsBinary(int element, int[] sorted) {
        int central = sorted.length / 2;
        if (sorted.length == 1) {
            return element == sorted[central];
        }
        return element < sorted[central]
                ? containsBinary(element, Arrays.copyOfRange(sorted, 0, central))
                : containsBinary(element, Arrays.copyOfRange(sorted, central, sorted.length));
    }

    public boolean containsBinaryIterate(int element, int[] sorted) {
        int range = sorted.length;
        int central = range / 2;

        while (central > 0 && element != sorted[central]) {
            if (element < sorted[central]) {
                central = (range /= 2) / 2;
                int[] temp = new int[range];
                System.arraycopy(sorted, 0, temp, 0, range);
                sorted = temp;
            } else {
                range = range % 2 == 0 ? range / 2 : range / 2 + 1;
                int[] temp = new int[range];
                System.arraycopy(sorted, central, temp, 0, range);
                central = range / 2;
                sorted = temp;
            }
        }
        return element == sorted[central];
    }

    public boolean containsLinearIterate(int element, int... elements) {
        for (int el : elements) {
            if (element == el) {
                return true;
            }
        }
        return false;
    }

    public boolean containsLinear(int element, int... elements) {
        return element == (elements[0]) || containsLinearRecursion(element, 1, elements);
    }

    private boolean containsLinearRecursion(int element, int startPos, int... elements) {
        return startPos == elements.length - 1 || element == (elements[startPos])
                ? element == (elements[startPos])
                : containsLinearRecursion(element, ++startPos, elements);
    }
}
