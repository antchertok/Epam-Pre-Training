package by.epam.pretraining.forth.model;

public class EqualityIndicator {

    public static boolean checkEquality(int number, int possibleSum) {
        number = number < 0 ? -number : number;
        possibleSum = possibleSum < 0 ? -possibleSum : possibleSum;
        return findEquality(number, possibleSum);
    }

    public static boolean findEquality(int number, int possibleSum) {
        if (number >= 10) {
            return findEquality(number / 10, possibleSum - number % 10);
        } else {
            return number == possibleSum;
        }

    }

    public static boolean findEqualityIterative(int number, int possibleSum) {
        return DigitsCalc.calcSumOfDigitsIterative(number) == possibleSum;
    }
}
