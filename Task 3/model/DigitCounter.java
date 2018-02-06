package third.model;

public class DigitCounter {

    public static int howManyDigits(int number) {
        if (number == 0) {
            return 1;
        }

        number = number > 0 ? number : -number;
        int amountOfDigits = 0;

        for (; number > 0; number /= 10) {
            if (!contains(number / 10, number % 10)) {
                amountOfDigits++;
            }
        }

        return amountOfDigits;
    }

    private static boolean contains(int number, int digit) {
        for (; number > 0; number /= 10) {
            if (digit == number % 10) {
                return true;
            }
        }
        return false;
    }
}
