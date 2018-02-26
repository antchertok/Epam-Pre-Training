package by.epam.pretraining.chertok.tasks.task5.controller;

import by.epam.pretraining.chertok.tasks.task5.model.DepotMaker;
import by.epam.pretraining.chertok.tasks.task5.model.entity.Train;
import by.epam.pretraining.chertok.tasks.task5.model.logic.HeaviestTrainDetector;
import by.epam.pretraining.chertok.tasks.task5.model.logic.LongestTrainDetector;
import by.epam.pretraining.chertok.tasks.task5.model.logic.TrainFinder;
import by.epam.pretraining.chertok.tasks.task5.model.util.Container;
import by.epam.pretraining.chertok.tasks.task5.view.View;

public class Depot {

    public static void main(String[] args) {
        Container<Train> depot = DepotMaker.DEPOT_MAKER.makeDepot(50, 2, 70);

        Train train = new Train((Train) depot.get(0));
        View.print(train);
        View.print(depot.get(0));

        View.print("TOTAL: " + depot.size());
        View.print("GOODS: " + TrainFinder.findTrainsOfThisType(depot, "GOODS").size());
        View.print("PASSENGER: " + TrainFinder.findTrainsOfThisType(depot, "PASSENGER").size());

        View.print(LongestTrainDetector.whichTrainIsLongest(depot));
        View.print(TrainFinder.findTrainsWithThisDestination(depot, "SOFIA").size());
        View.print(TrainFinder.findTrainsWithThisTypeOfLoco(depot, "SteAm").size());
        View.print(HeaviestTrainDetector.whichTrainIsHeaviest(depot));

        View.print(depot.toString());
    }
}
