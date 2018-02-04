package third.model;

public class PrimeDivisorsDetector {
    private static final int MIN_PRIME_NUMBER = 2;

    public static String getPrimeDivisors(int number) {
        StringBuilder primeDivisors = new StringBuilder();

        for (int divisor = MIN_PRIME_NUMBER; divisor < number; divisor++) {
            if (isDivisor(number, divisor)){
                if(isPrime(divisor)){
                    primeDivisors.append(divisor);
                    primeDivisors.append(' ');
                }
            }
        }
        return primeDivisors.toString();
    }

    private static boolean isPrime(int number) {
        for (int divisor = MIN_PRIME_NUMBER; divisor < number; divisor++) {
            if (isDivisor(number,divisor)) {
                return false;
            }
        }
        return true;
    }

    private static boolean isDivisor(int dividend, int divisor) {
        return dividend % divisor == 0;
    }
}
