package by.epam.pretraining.chertok.tasks.task5.model.logic;

import by.epam.pretraining.chertok.tasks.task5.model.entity.Train;
import by.epam.pretraining.chertok.tasks.task5.model.entity.TrainType;
import by.epam.pretraining.chertok.tasks.task5.model.entity.locomotive.LocomotiveType;
import by.epam.pretraining.chertok.tasks.task5.model.util.Container;
import by.epam.pretraining.chertok.tasks.task5.model.util.ContainerImp;

public class TrainStalker {

    public static Container<Train> findTrainsOfThisType(Container<Train> depot, String type) {
        Container<Train> result = new ContainerImp<>();
        TrainType trainType = TrainType.valueOf(type.toUpperCase());

        for (Train train : depot) {
            if (train.getType() == trainType) {
                result.add(train);
            }
        }

        return result;
    }

    public static Container<Train> findTrainsWithThisDestination(Container<Train> depot, String destination) {
        Container<Train> result = new ContainerImp<>();
        destination = destination.toUpperCase();

        for (Train train: depot){
            if(train.getDestination().equals(destination.toUpperCase())){
                result.add(train);
            }
        }

        return result;
    }

    public static Container<Train> findTrainsWithThisTypeOfLoco(Container<Train> depot, String loco) {
        Container<Train> result = new ContainerImp<>();
        LocomotiveType locomotive = LocomotiveType.valueOf(loco.toUpperCase());

        for(Train train: depot){
            if(train.getTypeOfLocomotive()==locomotive){
                result.add(train);
            }
        }

        return result;
    }
}
