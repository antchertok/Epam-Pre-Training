package third.model;

public class CommonPropCalc {

    public static int calcGCD(int firstInt, int secondInt) {

        if (firstInt * secondInt == 0) {
            throw new RuntimeException("At least one number is zero");//УБРАТЬ
        }

        firstInt = firstInt > 0 ? firstInt : -firstInt;
        secondInt = secondInt > 0 ? secondInt : -secondInt;
        int remainder;

        while (firstInt % secondInt != 0) {
            remainder = firstInt % secondInt;
            firstInt = secondInt;
            secondInt = remainder;
        }

        return secondInt;
    }

    public static int calcLCM(int firstInt, int secondInt) {

        if (firstInt * secondInt == 0) {
            throw new RuntimeException("At least one number is zero");//УБРАТЬ
        }

        return Math.abs(firstInt * secondInt) / calcGCD(firstInt, secondInt);
    }
}
