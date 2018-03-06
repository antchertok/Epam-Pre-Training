package by.epam.pretraining.chertok.tasks.task8.model;

import by.epam.pretraining.chertok.tasks.task5.model.entity.Train;

import java.util.Arrays;

public enum TrainSearcher {
    TRAIN_SEARCHER;

    public boolean containsLinear(Train element, Train... elements) {
        return element.equals(elements[0]) || containsLinearRecursion(element, 1, elements);
    }

    public boolean containsLinearRecursion(Train element, int startPos, Train... elements) {
        return startPos == elements.length - 1 || element.equals(elements[startPos])
                ? element.equals(elements[startPos])
                : containsLinearRecursion(element, ++startPos, elements);
    }

    public boolean containsLinearIterate(Train element, Train... elements) {
        for (Train el : elements) {
            if (element.equals(el)) {
                return true;
            }
        }
        return false;
    }

    public boolean containsBinary(Train element, Train[] sorted) {
        int central = sorted.length / 2;
        if (sorted.length == 1) {
            return element.equals(sorted[central]);
        }
        if (element.compareTo(sorted[central]) < 0) {
            return containsBinary(element, Arrays.copyOfRange(sorted, 0, central));
        } else {
            return containsBinary(element, Arrays.copyOfRange(sorted, central, sorted.length));
        }
    }

    public boolean containsBinaryIterate(Train element, Train[] sorted) {
        int range = sorted.length;
        int central = range / 2;

        while (central > 0 && !element.equals(sorted[central])) {
            if (element.compareTo(sorted[central]) < 0) {
                central = (range /= 2) / 2;
                Train[] temp = new Train[range];
                System.arraycopy(sorted, 0, temp, 0, range);
                sorted = temp;
            } else {
                range = range % 2 == 0 ? range / 2 : range / 2 + 1;
                Train[] temp = new Train[range];
                System.arraycopy(sorted, central, temp, 0, range);
                central = range / 2;
                sorted = temp;
            }
        }
        return element.equals(sorted[central]);
    }
}
