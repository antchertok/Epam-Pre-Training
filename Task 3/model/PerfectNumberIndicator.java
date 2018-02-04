package third.model;

public class PerfectNumberIndicator {

    public static boolean isPerfect(int number) {
        int sum = 0;

        for (int divisor = 1; divisor < number; divisor++) {
            if (number % divisor == 0) {
                sum += divisor;
            }
        }
        return sum == number;
    }
}
