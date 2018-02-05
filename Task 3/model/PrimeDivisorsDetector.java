package third.model;

public class PrimeDivisorsDetector {
    private static final int MIN_PRIME_NUMBER = 2;

    public static String getPrimeDivisors(int number) {
        StringBuilder primeDivisors = new StringBuilder();

        for (int divisor = MIN_PRIME_NUMBER; divisor < number; divisor++) {
            if (number % divisor == 0 && PrimeNumIndicator.isPrime(divisor)) {
                primeDivisors.append(divisor);
                primeDivisors.append(' ');
            }
        }
        return primeDivisors.toString();
    }
}
