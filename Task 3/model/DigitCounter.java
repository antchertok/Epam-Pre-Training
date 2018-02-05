package third.model;

import java.util.HashSet;

public class DigitCounter {

    //Если нельзя с коллекцией
    public static int howManyDigits(int number) {
        String digitStorage = "";

        for (; number > 0; number /= 10) {
            if (!digitStorage.contains(Integer.toString(number % 10))) {
                digitStorage += number % 10;
            }
        }

        return digitStorage.length();
    }

    //Если можно
    public static int howManyFigures(int number) {
        HashSet<Integer> digitStorage = new HashSet();

        for (; number > 0; number /= 10) {
            digitStorage.add(number % 10);
        }

        return digitStorage.size();
    }
}
