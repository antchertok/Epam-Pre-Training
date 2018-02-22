package by.epam.pretraining.chertok.tasks.task5.model.entity.carriage;

import by.epam.pretraining.chertok.tasks.task5.model.entity.TrainType;

public abstract class Carriage {
    public static int DEFAULT_WEIGHT_OF_EMPTY_CAR = 60;
    public int carWeight;

    public static Carriage getCarriage(TrainType type, int cargoWeight)
            throws NoSuchTypeOfCarriageException {
        switch (type) {
            case GOODS:
                return new GoodsCarriage(cargoWeight);
            case PASSENGER:
                return new Coach(cargoWeight);
            default:
                throw new NoSuchTypeOfCarriageException();
        }
    }

//    public abstract void loadCarriage(int cargoWeight)
//            throws IllegalWeightOfCargoException;

}
