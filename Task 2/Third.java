package second;

public class Third {

    static void detectMood() {
        double moodLevel = Math.random();
        String yourMoodIs = "Ваше настроение...";

        System.out.println(yourMoodIs);
        if (moodLevel < 0.33) {
            FacePrinter.printSadFace();
        } else if (moodLevel > 0.66) {
            FacePrinter.printHappyFace();
        } else {
            FacePrinter.printIndifferentFace();
        }
    }

//    Если с дополнительным классом нельзя
    static void detectMoodLevel() {
        double moodLevel = Math.random();
        String yourMoodIs = "Ваше настроение...";

        System.out.println(yourMoodIs);
        if (moodLevel < 0.33) {
            System.out.println("  XXXXXX");
            System.out.println(" X o  o X");
            System.out.println(" X      X");
            System.out.println(" X.°°°°.X");
            System.out.println("  XXXXXX");
        } else if (moodLevel > 0.66) {
            System.out.println("  XXXXXX");
            System.out.println(" X o  o X");
            System.out.println(" X      X");
            System.out.println(" X°....°X");
            System.out.println("  XXXXXX");
        } else {
            System.out.println("  XXXXXX");
            System.out.println(" X o  o X");
            System.out.println(" X      X");
            System.out.println(" X °°°° X");
            System.out.println("  XXXXXX");
        }
    }

}

class FacePrinter {
    static void printHappyFace() {
        System.out.println("  XXXXXX");
        System.out.println(" X o  o X");
        System.out.println(" X      X");
        System.out.println(" X°....°X");
        System.out.println("  XXXXXX");
    }

    static void printIndifferentFace() {
        System.out.println("  XXXXXX");
        System.out.println(" X o  o X");
        System.out.println(" X      X");
        System.out.println(" X °°°° X");
        System.out.println("  XXXXXX");
    }

    static void printSadFace() {
        System.out.println("  XXXXXX");
        System.out.println(" X o  o X");
        System.out.println(" X      X");
        System.out.println(" X.°°°°.X");
        System.out.println("  XXXXXX");
    }
}
