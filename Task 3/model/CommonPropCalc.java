package third.model;

public class CommonPropCalc {

    public static int calcGCD(int firstNumber, int secondNumber)
            throws ZeroDetectedException {

        if (firstNumber * secondNumber == 0) {
            throw new ZeroDetectedException();
        }

        firstNumber = firstNumber > 0 ? firstNumber : -firstNumber;
        secondNumber = secondNumber > 0 ? secondNumber : -secondNumber;
        int remainder;

        while (firstNumber % secondNumber != 0) {
            remainder = firstNumber % secondNumber;
            firstNumber = secondNumber;
            secondNumber = remainder;
        }

        return secondNumber;
    }

    public static int calcLCM(int firstNumber, int secondNumber)
            throws ZeroDetectedException {

        if (firstNumber * secondNumber == 0) {
            throw new ZeroDetectedException();
        }

        return Math.abs(firstNumber * secondNumber)
                / calcGCD(firstNumber, secondNumber);
    }
}
