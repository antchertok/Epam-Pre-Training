package by.epam.pretraining.chertok.tasks.task5.model.entity.carriage;

public class FreightCarriage extends Carriage {
    private static final double MAX_WEIGHT_OF_CARGO_ON_FREIGHT_CARRIAGE = 40;

    FreightCarriage(double cargoWeight) {
        if(cargoWeight > MAX_WEIGHT_OF_CARGO_ON_FREIGHT_CARRIAGE){
            carWeight = DEFAULT_WEIGHT_OF_EMPTY_CAR + MAX_WEIGHT_OF_CARGO_ON_FREIGHT_CARRIAGE;
        } else {
            carWeight = DEFAULT_WEIGHT_OF_EMPTY_CAR + cargoWeight;
        }
    }
}
