package by.epam.pretraining.chertok.tasks.task5.model.entity;

import by.epam.pretraining.chertok.tasks.task5.model.entity.carriage.Carriage;
import by.epam.pretraining.chertok.tasks.task5.model.entity.carriage.NoSuchTypeOfCarriageException;
import by.epam.pretraining.chertok.tasks.task5.model.entity.locomotive.Locomotive;
import by.epam.pretraining.chertok.tasks.task5.model.entity.locomotive.LocomotiveType;
import by.epam.pretraining.chertok.tasks.task5.model.entity.locomotive.NoSuchTypeOfLocomotiveException;
import by.epam.pretraining.chertok.tasks.task5.model.util.Container;
import by.epam.pretraining.chertok.tasks.task5.model.util.ContainerImp;

import java.util.Objects;

public class Train implements Cloneable {
    private int trainNumber;
    private String destination;
    private Locomotive loco;
    private TrainType type;
    private Container<Carriage> carriages;

    private static int amountOfTrains = 0;

    public Train(String type, int lengthOfCarriages, String destination) {
        this.type = TrainType.valueOf(type.toUpperCase());

        try {
            this.loco = Locomotive.getLocomotive(lengthOfCarriages);
            carriages = new ContainerImp<>();

            for (int length = 0; length < lengthOfCarriages; length++) {
                carriages.add(Carriage.getCarriage(this.type, 0));
            }
        } catch (NoSuchTypeOfCarriageException | NoSuchTypeOfLocomotiveException e) {
            e.printStackTrace();
        }

        this.destination = destination;
        trainNumber = ++amountOfTrains;
    }

    public Train(Train train) {
        destination = train.destination;
        type = train.type;

        try {
            loco = train.loco.clone();
            int lengthOfCarriage = train.carriages.size();
            this.carriages = new ContainerImp<>();

            for (int length = 0; length < lengthOfCarriage; length++) {
                this.carriages.add(Carriage.getCarriage(this.type, 0));
            }
        } catch (CloneNotSupportedException | NoSuchTypeOfCarriageException e) {
            e.printStackTrace();
        }
    }

    public LocomotiveType getTypeOfLocomotive() {
        return loco.getLocomotiveType();
    }

    public TrainType getType() {
        return type;
    }

    public int getNumberOfCarriage() {
        return carriages.size();
    }

    public String getDestination() {
        return destination;
    }

    public int getTrainNumber() {
        return trainNumber;
    }

    public int calcGeneralWeight() {
        int generalWeight = 0;
        for (Carriage carriage : carriages) {
            generalWeight += carriage.carWeight;
        }
        return generalWeight;
    }

    @Override
    public String toString() {
        return type + " train, type of locomotive: " + loco
                + ", amount of carriages: " + carriages.size()
                + ". Destination: " + destination;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Train)) return false;
        Train train = (Train) o;
        return trainNumber == train.trainNumber
                && Objects.equals(destination, train.destination)
                && Objects.equals(loco, train.loco)
                && type == train.type
                && Objects.equals(carriages, train.carriages);
    }

    @Override
    public int hashCode() {
        return 43 * trainNumber + destination.hashCode()
                + loco.hashCode() + type.hashCode() + carriages.hashCode();
    }
}

