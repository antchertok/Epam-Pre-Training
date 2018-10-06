package by.epam.pretraining.chertok.tasks.task5.model;

import by.epam.pretraining.chertok.tasks.task5.model.entity.Train;
import by.epam.pretraining.chertok.tasks.task5.model.entity.TrainType;
import by.epam.pretraining.chertok.tasks.task5.model.util.Container;
import by.epam.pretraining.chertok.tasks.task5.model.util.ContainerImp;

import java.util.Random;

public enum DepotMaker {
    DEPOT_MAKER;

    public Container<Train> makeDepot(int amountOfTrains, int possibleTypes, int possibleLength) {
        Container<Train> depot = new ContainerImp<>();
        Random random = new Random();
        TrainType trainType;
        int lengthOfEmptyCarriages;


        for (int i = 0; i < amountOfTrains; i++) {
            trainType = TrainType.values()[random.nextInt(possibleTypes)]; //2
            lengthOfEmptyCarriages = random.nextInt(possibleLength);  //70

            depot.add(new Train(trainType.toString(), lengthOfEmptyCarriages,
                    DestinationGenerator.getPossibleDestination()));
        }

        return depot;
    }
}
