package by.epam.pretraining.chertok.tasks.task5.model.logic;

import by.epam.pretraining.chertok.tasks.task5.model.entity.Train;
import by.epam.pretraining.chertok.tasks.task5.model.util.Container;

import java.util.Iterator;

public class HeaviestTrainDetector {

    public static int whichTrainIsHeaviest(Container<Train> depot) {
        int maxWeight = 0;
        int indexOfHeaviestTrain = -1;

        for (Train train : depot) {
            if (maxWeight < train.calcGeneralWeight()) {
                maxWeight = train.calcGeneralWeight();
                indexOfHeaviestTrain = train.getTrainNumber();
            }
        }
        return indexOfHeaviestTrain;
    }
}
