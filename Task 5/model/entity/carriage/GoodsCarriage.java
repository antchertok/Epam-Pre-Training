package by.epam.pretraining.chertok.tasks.task5.model.entity.carriage;

public class GoodsCarriage extends Carriage {
    private int MAX_WEIGHT_OF_CARGO_ON_COODS_CARRIAGE = 40;

    GoodsCarriage(int cargoWeight) {
        carWeight = DEFAULT_WEIGHT_OF_EMPTY_CAR + cargoWeight;//Exception?
    }

//    public void loadCarriage(int cargoWeight)
//            throws IllegalWeightOfCargoException {
//        if (cargoWeight > MAX_WEIGHT_OF_CARGO_ON_COODS_CARRIAGE) {
//            throw new IllegalWeightOfCargoException();
//        }
//        carWeight = DEFAULT_WEIGHT_OF_EMPTY_CAR + cargoWeight;
//    }

}
