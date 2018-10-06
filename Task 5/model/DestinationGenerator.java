package by.epam.pretraining.chertok.tasks.task5.model;

import java.util.Random;

public class DestinationGenerator {
    private static final int VARIANTS = 8;
    private static Random random = new Random();

    private enum Destinations {
        BAKU, VIENNA, TALLINN, SOFIA, BRUSSELS, RIGA, WARSAW, MOSCOW
    }

    public static String getPossibleDestination() {
        return Destinations.values()[random.nextInt(VARIANTS)].toString();
    }
}
