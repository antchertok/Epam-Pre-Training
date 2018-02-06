package third.model;

public class PerfectNumberIndicator {

    public static boolean isPerfect(int number) {
        number = number > 0 ? number : -number;

        if(number == 0){
            return false;
        }

        return number == calcSumOfDivisors(number);
    }

    private static int calcSumOfDivisors(int number) {
        int sum = 0;

        for (int divisor = 1; divisor < number; divisor++) {
            if (number % divisor == 0) {
                sum += divisor;
            }
        }

        return sum;
    }
}
