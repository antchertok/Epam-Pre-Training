package third.model;

public class LCMCalculator {

    //    Надо ли указывать непроверяемые исключения через throws?
    public static int calcLCM(int a, int b) throws RuntimeException {
        
        if (a * b == 0) {
            throw new RuntimeException("At least one number is zero");
        }

        return Math.abs(a * b) / GCDCalculator.calcGCD(a, b);
    }

}
