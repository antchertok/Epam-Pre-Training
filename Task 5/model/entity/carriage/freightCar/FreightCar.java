package by.epam.pretraining.chertok.tasks.task5.model.entity.carriage.freightCar;

import by.epam.pretraining.chertok.tasks.task5.model.entity.carriage.Carriage;
import by.epam.pretraining.chertok.tasks.task5.model.exception.FreightCarIsOverloadedException;

public class FreightCar extends Carriage {
    private static final int MAX_WEIGHT_OF_CARGO_TONS = 40;
    private CarType carType;
    private DangerousLevel dangerousLevel;

    public FreightCar() {
        this("OPEN_CAR", 3);
    }

    public FreightCar(String carType, int dangLvl) {
        this.carType = CarType.valueOf(carType.toUpperCase());
        dangerousLevel = dangLvl < DangerousLevel.values().length
                ? DangerousLevel.values()[dangLvl]
                : DangerousLevel.HIGH;
    }

    public CarType getCarType() {
        return carType;
    }

    public DangerousLevel getDangerousLevel() {
        return dangerousLevel;
    }

    public void setWeight(int cargoWeight) throws FreightCarIsOverloadedException {
        if(cargoWeight > MAX_WEIGHT_OF_CARGO_TONS){
            throw new FreightCarIsOverloadedException();
        }
        carWeight = DEFAULT_WEIGHT_OF_EMPTY_CAR + cargoWeight;
    }

}
