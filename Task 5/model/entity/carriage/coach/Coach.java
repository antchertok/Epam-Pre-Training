package by.epam.pretraining.chertok.tasks.task5.model.entity.carriage.coach;

import by.epam.pretraining.chertok.tasks.task5.model.entity.carriage.Carriage;

public class Coach extends Carriage {
    private int passengers;
    private CoachType type;
    private Comfortableness comfortableness;

    public Coach(){
        this("SITTING_CAR", 0);
    }

    public Coach(String coachType, int comfLvl) {
        type = CoachType.valueOf(coachType.toUpperCase());
        comfortableness = comfLvl < Comfortableness.values().length
                ? Comfortableness.values()[comfLvl]
                : Comfortableness.NOT_FOR_LIVING;
    }


    public CoachType getType() {
        return type;
    }

    public Comfortableness getComfortableness() {
        return comfortableness;
    }

    public void setPassengers(int passengers) throws UnloadingException {
        if (passengers < 0 && Math.abs(passengers) > this.passengers) {
            throw new UnloadingException();
        }

        this.passengers = passengers;
    }

    @Override
    public String toString() {
        return type + ", comfortableness level: " + comfortableness;
    }

}
