package second.model;

public class MoodDetectorRunner {
    public static String detectMood(int amountOfMoods) {
        String mood = "Incorrect Input";//Следует ли возвращать что-либо в случае исключения? Бросать RuntimeException?

        try {
            mood = MoodDetector.detectMood(amountOfMoods);
        } catch (UnsupportedAmountOfMoodsException e) {
            e.printStackTrace();
        }

        return mood;
    }
}
