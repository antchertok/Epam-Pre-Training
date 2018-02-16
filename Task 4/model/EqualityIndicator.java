package by.epam.pretraining.forth.model;

public class EqualityIndicator {

    public static boolean checkEquality(int number, int possibleSum) {
        number = number < 0 ? -number : number;
        possibleSum = possibleSum < 0 ? -possibleSum : possibleSum;
        return findEquality(number, possibleSum);
    }

    public static boolean findEquality(int number, int possibleSum) {
        return number >= 10 ? findEquality(number / 10, possibleSum - number % 10)
                            : number == possibleSum;
    }

    public static boolean findEqualityIterative(int number, int possibleSum) {
        return DigitsCalc.calcSumOfDigitsIterative(number) == possibleSum;
    }
}
