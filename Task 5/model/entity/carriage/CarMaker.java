package by.epam.pretraining.chertok.tasks.task5.model.entity.carriage;

import by.epam.pretraining.chertok.tasks.task5.model.entity.TrainType;
import by.epam.pretraining.chertok.tasks.task5.model.entity.carriage.Carriage;
import by.epam.pretraining.chertok.tasks.task5.model.entity.carriage.coach.Coach;
import by.epam.pretraining.chertok.tasks.task5.model.entity.carriage.freightCar.FreightCar;


public enum CarMaker {
    CAR_MAKER;

    public Carriage makeCarriage(TrainType type){
        return type == TrainType.PASSENGER
                ? new Coach()
                : new FreightCar();
    }
}
