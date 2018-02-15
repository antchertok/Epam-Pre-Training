package third.model;

public class MaxDigitDetector {

    public static int detectMaxDigit(int number) {
        number = number > 0 ? number : -number;
        int max = 0;

        while (number > 0) {
            max = number % 10 > max ? number % 10 : max;
            number /= 10;
        }

        return max;
    }
}
