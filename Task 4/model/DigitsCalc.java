package by.epam.pretraining.forth.model;

public class DigitsCalc {

    public static int runCalcSumOfDigits(int number){
        number = number < 0 ? -number : number;
        return calcSumOfDigits(number);
    }
    public static int calcSumOfDigits(int number) {
        return number < 10 ? number : number % 10 + calcSumOfDigits(number / 10);
    }

    public static int calcSumOfDigitsIterative(int number) {
        int sum = 0;

        for (; number > 0; number /= 10) {
            sum += number % 10;
        }

        return sum;
    }


}
