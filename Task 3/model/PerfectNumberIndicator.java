package third.model;

public class PerfectNumberIndicator {

    public static boolean isPerfect(int number) {
        number = number > 0 ? number : -number;
        return number == calcSumOfDigits(number);
    }

    private static int calcSumOfDigits(int number) {
        int sum = 0;

        for (int divisor = 1; divisor < number; divisor++) {
            if (number % divisor == 0) {
                sum += divisor;
            }
        }

        return sum;
    }
}
