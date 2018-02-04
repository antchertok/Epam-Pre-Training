package third.model;

public class GCDCalculator {

    public static int calcGCD(int a, int b) {
        a = a > 0 ? a : -a;
        b = b > 0 ? b : -b;
        a = a > b ? a : a + b - (b = a);
        int remainder;

        while (a % b != 0) {
            remainder = a % b;
            a = b;
            b = remainder;
        }

        return b;
    }
}
