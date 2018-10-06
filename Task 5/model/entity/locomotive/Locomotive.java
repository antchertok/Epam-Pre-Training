package by.epam.pretraining.chertok.tasks.task5.model.entity.locomotive;

import by.epam.pretraining.chertok.tasks.task5.model.entity.carriage.Carriage;

public class Locomotive implements Cloneable {

    private LocomotiveType locomotiveType;
    private double tractionTons;


    public LocomotiveType getLocomotiveType() {
        return locomotiveType;
    }

    @Override
    public String toString() {
        return locomotiveType.toString();
    }

    public Locomotive clone() throws CloneNotSupportedException {
        return (Locomotive) super.clone();
    }

    Locomotive(LocomotiveType locomotiveType, double tractionTons){
        this.locomotiveType = locomotiveType;
        this.tractionTons = tractionTons;
    }
}
