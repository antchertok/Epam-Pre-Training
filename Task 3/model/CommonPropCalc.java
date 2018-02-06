package third.model;

public class CommonPropCalc {

    public static int calcGCD(int a, int b) throws RuntimeException {

        if (a * b == 0) {
            throw new RuntimeException("At least one number is zero");
        }

        a = a > 0 ? a : -a;
        b = b > 0 ? b : -b;
        int remainder;

        while (a % b != 0) {
            remainder = a % b;
            a = b;
            b = remainder;
        }

        return b;
    }

    public static int calcLCM(int a, int b) throws RuntimeException {

        if (a * b == 0) {
            throw new RuntimeException("At least one number is zero");
        }

        return Math.abs(a * b) / calcGCD(a, b);
    }
}
