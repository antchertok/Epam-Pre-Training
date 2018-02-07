package second.model;

import java.util.Random;

public class MoodDetector {
    private static final String SURRENDER = "It's too hard to describe your mood";
    private static final String ERROR_MSG = "Incorrect input";
    private static final String CRYING_FACE = "T_T";
    private static final String HAPPY_FACE = "^_^";
    private static final String INDIFFERENT_FACE = "-_-";
    private static Random moodGuesser = new Random();

//    Надо ли указывать непроверяемое исключение?
    public static String detectMood(int amountOfMoods) {

        if (amountOfMoods <= 0) {
            throw new RuntimeException(ERROR_MSG);//УБРАТЬ
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
            case 2:
                mood = INDIFFERENT_FACE;
                break;
            default:
                mood = SURRENDER;
        }

        return mood;
    }
}
