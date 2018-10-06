package first;

public class MeanCalculator {

    public static double calcArithmeticMean(int n) {
        int sum = n % 10;

        sum += (n /= 10) % 10;
        sum += (n /= 10) % 10;
        sum += (n /= 10) % 10;
        sum += (n /= 10) % 10;
        sum += (n /= 10);

        return sum / 6.0;
    }

    public static double calcGeometricMean(int n) {
        int mult = n % 10;

        mult *= (n /= 10) % 10;
        mult *= (n /= 10) % 10;
        mult *= (n /= 10) % 10;
        mult *= (n /= 10) % 10;
        mult *= (n /= 10);

        return Math.pow(mult, 1 / 6.0);
    }

}
