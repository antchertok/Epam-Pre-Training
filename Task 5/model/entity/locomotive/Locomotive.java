package by.epam.pretraining.chertok.tasks.task5.model.entity.locomotive;

import by.epam.pretraining.chertok.tasks.task5.model.entity.carriage.Carriage;

public class Locomotive implements Cloneable {
    private static final double TRACTION_ELECTRIC = 5000;
    private static final double TRACTION_DIESEL = 2500;
    private static final double TRACTION_STEAM = 500;
    private LocomotiveType locomotiveType;
    private double tractionTons;


    public LocomotiveType getLocomotiveType() {
        return locomotiveType;
    }

    public static Locomotive getLocomotive(int length)
            throws NoSuchTypeOfLocomotiveException {
        double generalWeight = length * Carriage.DEFAULT_WEIGHT_OF_EMPTY_CAR;

        if (generalWeight > TRACTION_ELECTRIC) {
            throw new NoSuchTypeOfLocomotiveException();
        } else if (generalWeight > TRACTION_DIESEL) {
            return new Locomotive(LocomotiveType.ELECTRIC, TRACTION_ELECTRIC);
        } else if (generalWeight > TRACTION_STEAM) {
            return new Locomotive(LocomotiveType.DIESEL, TRACTION_DIESEL);
        } else {
            return new Locomotive(LocomotiveType.STEAM, TRACTION_STEAM);
        }
    }

    @Override
    public String toString() {
        return locomotiveType.toString();
    }

    public Locomotive clone() throws CloneNotSupportedException {
        return (Locomotive) super.clone();
    }

    private Locomotive(LocomotiveType locomotiveType, double tractionTons){
        this.locomotiveType = locomotiveType;
        this.tractionTons = tractionTons;
    }
}
