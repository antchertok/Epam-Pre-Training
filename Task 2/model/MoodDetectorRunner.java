package second.model;

public class MoodDetectorRunner {
    public static String detectMood(int amountOfMoods) {
        String mood = "Incorrect Input";

        try {
            mood = MoodDetector.detectMood(amountOfMoods);
        } catch (UnsupportedAmountOfMoodsException e) {
            e.printStackTrace();
        }

        return mood;
    }
}
