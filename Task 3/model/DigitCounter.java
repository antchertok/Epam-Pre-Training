package third.model;

public class DigitCounter {

    public static int howManyDigits(int number) {
        if (number == 0) {
            return 1;
        }

        number = number > 0 ? number : -number;
        int amountOfDigits = 0;

        while (number > 0) {
            if (!contains(number / 10, number % 10)) {
                amountOfDigits++;
            }
            number /= 10
        }

        return amountOfDigits;
    }

    private static boolean contains(int number, int digit) {
        while (number > 0) {
            if (digit == number % 10) {
                return true;
            }
            number /= 10
        }
        return false;
    }
}
