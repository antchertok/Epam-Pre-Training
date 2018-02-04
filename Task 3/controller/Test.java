package third.controller;

import third.view.View;
import third.model.*;

public class Test {
    public static void main(String[] args) {
        int flings = 1000;
        int number = 12021;
        int perfTest = 28;


        View.print(HeadsOrTails.emulateHeadsOrTails(flings));

        View.print("The largest digit in " + number + ": "
                + MaxDigitDetector.getMaxDigit(number));

        View.print(number + " is a palindrome: "
                + PalindromeIndicator.isPalindrome(number));

        View.print(number + " is prime: "
                + PrimeNumberIndicator.isPrime(number));

        View.print("Prime divisors of " + number + ": "
                + PrimeDivisorsDetector.getPrimeDivisors(number));

        View.print("The greatest common divisor of " + flings + " and " + perfTest
                + ": " + GCDCalculator.calcGCD(flings, perfTest));

        View.print("The least common multiple of " + flings + " and " + perfTest
                + ": " + LCMCalculator.calcLCM(flings, perfTest));

        View.print(number + " contains "
                + DigitCounter.howManyDigits(number) + " digits");

        View.print(perfTest + " is perfect: "
                + PerfectNumberIndicator.isPerfect(perfTest));

    }
}
