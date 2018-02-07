package second.model;

import java.util.Random;

public class MoodDetector {
    private static final String CRYING_FACE = "T_T";
    private static final String HAPPY_FACE = "^_^";
    private static final String INDIFFERENT_FACE = "-_-";
    private static final int POSSIBLE_MOODS = 3;
    private static Random moodGuesser = new Random();

    public static String detectMood(int amountOfMoods)
            throws UnsupportedAmountOfMoodsException {
        amountOfMoods = amountOfMoods < 0 ? -amountOfMoods : amountOfMoods;

        if (amountOfMoods > POSSIBLE_MOODS) {
            throw new UnsupportedAmountOfMoodsException();
        }

        int moodLevel = moodGuesser.nextInt(amountOfMoods);
        String mood;

        switch (moodLevel) {
            case 0:
                mood = CRYING_FACE;
                break;
            case 1:
                mood = HAPPY_FACE;
                break;
            default:
                mood = INDIFFERENT_FACE;
                break;
        }

        return mood;
    }
}


