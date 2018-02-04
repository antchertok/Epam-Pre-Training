package third.model;

public class MaxDigitDetector {

    public static int getMaxDigit(int number) {
        int max = 0;
        for (; number > 0; number /= 10) {
            max = (number % 10 > max) ? number % 10 : max;
        }
        return max;
    }

}
