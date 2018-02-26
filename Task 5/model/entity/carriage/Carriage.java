package by.epam.pretraining.chertok.tasks.task5.model.entity.carriage;

import by.epam.pretraining.chertok.tasks.task5.model.entity.TrainType;

public abstract class Carriage {
    public static int DEFAULT_WEIGHT_OF_EMPTY_CAR = 60;
    protected double carWeight;

    public static Carriage getCarriage(TrainType type, int cargoWeight)
            throws NoSuchTypeOfCarriageException {
        switch (type) {
            case GOODS:
                return new FreightCarriage(cargoWeight);
            case PASSENGER:
                return new Coach(cargoWeight);
            default:
                throw new NoSuchTypeOfCarriageException();
        }
    }

    public double getCarWeight() {
        return carWeight;
    }

}
