package third.model;

public class PrimeNumberManager {

    public static String findPrimeDivisors(int number) {
        number = number > 0 ? number : -number;
        int upperLimit = number / 2;
        StringBuilder primeDivisors = new StringBuilder();

        for (int divisor = 2; divisor <= upperLimit; divisor++) {
            if (number % divisor == 0 && indicatePrime(divisor)) {
                primeDivisors.append(divisor);
                primeDivisors.append(' ');
            }
        }
        return primeDivisors.toString();
    }

    public static boolean indicatePrime(int number) {
        number = number > 0 ? number : -number;
        int upperLimit = number / 2;
        boolean isPrime = number < 2 ? false : true;

        for (int divisor = 2; divisor <= upperLimit; divisor++) {
            if (number % divisor == 0) {
                isPrime =  false;
            }
        }
        return isPrime;
    }
}
