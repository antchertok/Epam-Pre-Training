package by.epam.pretraining.chertok.tasks.task5.model.entity.locomotive;

import by.epam.pretraining.chertok.tasks.task5.model.entity.carriage.Carriage;

public enum LocomotiveMaker {
    LOCOMOTIVE_MAKER;

    private static final double TRACTION_ELECTRIC = 5000;
    private static final double TRACTION_DIESEL = 2500;
    private static final double TRACTION_STEAM = 500;

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
}
