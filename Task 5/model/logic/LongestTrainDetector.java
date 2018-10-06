package by.epam.pretraining.chertok.tasks.task5.model.logic;

import by.epam.pretraining.chertok.tasks.task5.model.entity.Train;
import by.epam.pretraining.chertok.tasks.task5.model.util.Container;

import java.util.Iterator;

public class LongestTrainDetector {

    public static int whichTrainIsLongest(Container<Train> depot) {
        int maxLength = 0;
        int indexOfTrainWithMaxLength = -1;

        for (Train train : depot) {
            if (maxLength < train.getNumberOfCarriage()) {
                maxLength = train.getNumberOfCarriage();
                indexOfTrainWithMaxLength = train.getTrainNumber();
            }
        }

        return indexOfTrainWithMaxLength;
    }
}
