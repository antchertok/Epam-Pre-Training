package second.model;

public class DragonAnalyzer {
    private static final int YEARS_OF_YOUNG_AGE = 200;
    private static final int YEARS_OF_MID_AGE = 100;
    private static final int HEADS_PER_YEAR_IN_YOUTH = 3;
    private static final int HEADS_PER_YEAR_IN_MID_AGE = 2;
    private static final int HEADS_PER_YEAR_IN_OLD_AGE = 1;
    private static final int EYES_PER_YEAR_IN_YOUTH = 6;
    private static final int EYES_PER_YEAR_IN_MID_AGE = 4;
    private static final int EYES_PER_YEAR_IN_OLD_AGE = 2;


    public static int getAmountOfHeads(int age) {
        int heads = HEADS_PER_YEAR_IN_YOUTH; //3 головы при рождении

        if (age >= YEARS_OF_YOUNG_AGE) {
            heads += YEARS_OF_YOUNG_AGE * HEADS_PER_YEAR_IN_YOUTH;
            age -= YEARS_OF_YOUNG_AGE;

            if (age >= YEARS_OF_MID_AGE) {
                heads += YEARS_OF_MID_AGE * HEADS_PER_YEAR_IN_MID_AGE;
                heads += (age - YEARS_OF_MID_AGE) * HEADS_PER_YEAR_IN_OLD_AGE;
            } else {
                heads += (age * HEADS_PER_YEAR_IN_MID_AGE);
            }
        } else {
            heads += age * HEADS_PER_YEAR_IN_YOUTH;
        }

        return heads;
    }

    public static int getAmountOfEyes(int age) {
        int eyes = EYES_PER_YEAR_IN_YOUTH;

        if (age >= YEARS_OF_YOUNG_AGE) {
            eyes += YEARS_OF_YOUNG_AGE * EYES_PER_YEAR_IN_YOUTH;
            age -= YEARS_OF_YOUNG_AGE;

            if (age >= YEARS_OF_MID_AGE) {
                eyes += YEARS_OF_MID_AGE * EYES_PER_YEAR_IN_MID_AGE;
                eyes += (age - YEARS_OF_MID_AGE) * EYES_PER_YEAR_IN_OLD_AGE;
            } else {
                eyes += (age * EYES_PER_YEAR_IN_MID_AGE);
            }
        } else {
            eyes += age * EYES_PER_YEAR_IN_YOUTH;
        }

        return eyes;
    }

}
