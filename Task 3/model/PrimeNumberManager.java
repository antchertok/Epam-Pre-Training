package third.model;

public class PrimeNumberManager {
    private static final int MIN_PRIME_NUMBER = 2;

    public static String getPrimeDivisors(int number) {
        number = number > 0 ? number : -number;
        StringBuilder primeDivisors = new StringBuilder();

        for (int divisor = MIN_PRIME_NUMBER; divisor < number; divisor++) {
            if (number % divisor == 0 && isPrime(divisor)) {
                primeDivisors.append(divisor);
                primeDivisors.append(' ');
            }
        }
        return primeDivisors.toString();
    }

    public static boolean isPrime(int number) {
        number = number > 0 ? number : -number;
        boolean isPrime = number < 2 ? false : true;

        int divisor = MIN_PRIME_NUMBER;
        while (divisor < number && isPrime) {
            if (number % divisor == 0) {
                isPrime = false;
            }
            divisor++;
        }

        return isPrime;
    }
}
