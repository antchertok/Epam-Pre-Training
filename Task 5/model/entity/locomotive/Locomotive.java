package by.epam.pretraining.chertok.tasks.task5.model.entity.locomotive;

import by.epam.pretraining.chertok.tasks.task5.model.entity.carriage.Carriage;

public abstract class Locomotive implements Cloneable {
    static LocomotiveType locomotiveType;

    public LocomotiveType getLocomotiveType() {
        return locomotiveType;
    }

    public static Locomotive getLocomotive(int length)
            throws NoSuchTypeOfLocomotiveException {
        int generalWeight = length * Carriage.DEFAULT_WEIGHT_OF_EMPTY_CAR;

        if (generalWeight > ElectricLocomotive.tractionTons) {
            throw new NoSuchTypeOfLocomotiveException();
        } else if (generalWeight > DieselLocomotive.tractionTons) {
            return new ElectricLocomotive();
        } else if (generalWeight > SteamLocomotive.tractionTons) {
            return new DieselLocomotive();
        } else {
            return new SteamLocomotive();
        }
    }

    @Override
    public String toString() {
        return locomotiveType.toString();
    }

    public Locomotive clone() throws CloneNotSupportedException {
        return (Locomotive) super.clone();
    }
}
