package third.model;

public class LCMCalculator {

    public static int calcLeastCommonMultiple(int a, int b) {
        return Math.abs(a * b) / GCDCalculator.calcGCD(a, b);
    }

//    Если нельзя способом выше
    public static int calcLCM(int a, int b) {
        a = a > 0 ? a : -a;
        b = b > 0 ? b : -b;
        a = a > b ? a : a + b - (b = a);
        int finalNumerator = a * b;
        int remainder;

        while (a % b != 0) {
            remainder = a % b;
            a = b;
            b = remainder;
        }

        return finalNumerator / b;
    }
}
