package third.model;

public class GCDCalculator {

    //    Надо ли указывать непроверяемые исключения через throws?
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
    
     //    Вариант 2
    public static int calcGreatestCommonDivisor(int a, int b)
            throws RuntimeException {

        if (a * b == 0) {
            throw new RuntimeException("At least one number is zero");
        }

        a = a > 0 ? a : -a;
        b = b > 0 ? b : -b;

        for (int remainder; a % b != 0; a = b, b = remainder) {
            remainder = a % b;
        }

        return b;
    }
}

