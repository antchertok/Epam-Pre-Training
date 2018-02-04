package third.model;

public class DigitCounter {

    public static int howManyDigits(int number) {
        String digitStorage = "";//Если нельзя с коллекцией

        for (; number > 0; number /= 10) {
            if (!digitStorage.contains(Integer.toString(number % 10))) {
                digitStorage += number % 10;
            }
        }

        return digitStorage.length();
    }
}
