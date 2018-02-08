package second.model;

public class DragonAnalyzer {
    private static final int YOUTH = 200;
    private static final int OLD_AGE = 300;
    private static final int HEADS_PER_YEAR_IN_YOUTH = 3;
    private static final int HEADS_PER_YEAR_IN_MID_AGE = 2;
    private static final int HEADS_PER_YEAR_IN_OLD_AGE = 1;
    private static final int EYES_PER_HEAD = 2;


    public static int getAmountOfHeads(int age) {
        age = age < 0 ? -age : age;
        int heads = HEADS_PER_YEAR_IN_YOUTH;

        if (age >= OLD_AGE) {
            heads = heads + age * HEADS_PER_YEAR_IN_OLD_AGE
                    - OLD_AGE * HEADS_PER_YEAR_IN_OLD_AGE
                    + OLD_AGE * HEADS_PER_YEAR_IN_MID_AGE
                    - YOUTH * HEADS_PER_YEAR_IN_MID_AGE
                    + YOUTH * HEADS_PER_YEAR_IN_YOUTH;
        } else if (age >= YOUTH) {
            heads  = heads + age * HEADS_PER_YEAR_IN_MID_AGE
                    - YOUTH * HEADS_PER_YEAR_IN_MID_AGE
                    + YOUTH * HEADS_PER_YEAR_IN_YOUTH;
        } else {
            heads = heads + age * HEADS_PER_YEAR_IN_YOUTH;
        }
        return heads;
    }

    public static int getAmountOfEyes(int age) {
        return getAmountOfHeads(age) * EYES_PER_HEAD;
    }
}
