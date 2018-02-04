package second.model;

import second.view.View;

public class MoodDetector {
    private static final double UPPER_LIMIT_OF_SAD_LEVEL = 0.33;
    private static final double LOWER_LIMIT_OF_HAPPY_LEVEL = 0.67;

    public static void detectMood() {
        double moodLevel = Math.random();

        if (isSad(moodLevel)) {
            FacePrinter.printSadFace();
        } else if (isHappy(moodLevel)) {
            FacePrinter.printHappyFace();
        } else {
            FacePrinter.printIndifferentFace();
        }
    }

    private static boolean isSad(double moodLevel) {
        return moodLevel <= UPPER_LIMIT_OF_SAD_LEVEL;
    }

    private static boolean isHappy(double moodLevel) {
        return moodLevel >= LOWER_LIMIT_OF_HAPPY_LEVEL;
    }
}

class FacePrinter {
    static void printHappyFace() {
        View.print("  XXXXXX");
        View.print(" X o  o X");
        View.print(" X°....°X");
        View.print("  XXXXXX");
    }

    static void printIndifferentFace() {
        View.print("  XXXXXX");
        View.print(" X o  o X");
        View.print(" X .... X");
        View.print("  XXXXXX");
    }

    static void printSadFace() {
        View.print("  XXXXXX");
        View.print(" X o  o X");
        View.print(" X.°°°°.X");
        View.print("  XXXXXX");
    }
}
