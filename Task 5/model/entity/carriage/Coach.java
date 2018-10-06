package by.epam.pretraining.chertok.tasks.task5.model.entity.carriage;

public class Coach extends Carriage {
    private static final double MAX_WEIGHT_OF_CARGO_ON_COACH = 5;

    Coach(double cargoWeight) {
        if(cargoWeight > MAX_WEIGHT_OF_CARGO_ON_COACH){
            carWeight = DEFAULT_WEIGHT_OF_EMPTY_CAR + MAX_WEIGHT_OF_CARGO_ON_COACH;
        } else {
            carWeight = DEFAULT_WEIGHT_OF_EMPTY_CAR + cargoWeight;
        }
    }
}
