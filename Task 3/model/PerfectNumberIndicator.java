package third.model;

public class PerfectNumberIndicator {

    public static boolean indicatePerfect(int number) {
        if(number == 0 || number == 1){
            return false;
        }

        number = number > 0 ? number : -number;
        return number == calcSumOfDivisors(number);
    }

    private static int calcSumOfDivisors(int number) {
        int sum = 1;
        int upperLimit = number / 2;

        for (int divisor = 2; divisor <= upperLimit; divisor++) {
            if (number % divisor == 0) {
                sum += divisor;
            }
        }

        return sum;
    }
}
