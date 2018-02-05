package third.model;

public class PrimeNumIndicator {
    private static final int MIN_PRIME_NUMBER = 2;

    public static boolean isPrime(int number) {
        for (int divisor = MIN_PRIME_NUMBER; divisor < number; divisor++) {
            if (number % divisor == 0) {
                return false;
            }
        }
        return true;
    }
}
