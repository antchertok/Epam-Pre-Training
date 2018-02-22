package by.epam.pretraining.chertok.tasks.task5.model.entity.carriage;

public class Coach extends Carriage {
    private static int MAX_WEIGHT_OF_CARGO_ON_COACH = 5;

    Coach(int cargoWeight) {
        carWeight = DEFAULT_WEIGHT_OF_EMPTY_CAR + cargoWeight;//Exception?
    }

//    public void loadCarriage(int cargoWeight)
//            throws IllegalWeightOfCargoException {
//        if (cargoWeight > MAX_WEIGHT_OF_CARGO_ON_COACH || cargoWeight < 0) {
//            throw new IllegalWeightOfCargoException();
//        }
//        carWeight = DEFAULT_WEIGHT_OF_EMPTY_CAR + cargoWeight;
//    }
}
