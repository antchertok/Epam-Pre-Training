package third.controller;

import third.view.View;
import third.model.*;

public class Test {
    public static void main(String[] args) {
        int tosses = -1000;
        int number = -12321;
        int perfTest = 28;


        View.print(HeadsOrTails.howManyHeads(tosses) + " heads");

        View.print("The largest digit in " + number + ": "
                + MaxDigitDetector.detectMaxDigit(number));

        View.print(number + " is a palindrome: "
                + PalindromeIndicator.indicatePalindrome(number));

        View.print(number + " is prime: "
                + PrimeNumberManager.indicatePrime(number));

        View.print("Prime divisors of " + number + ": "
                + PrimeNumberManager.findPrimeDivisors(number));

       View.print("The greatest common divisor of " + tosses + " and " + perfTest
                + ": " + CommonPropCalcRunner.calcGCD(tosses, perfTest));

        View.print("The least common multiple of " + tosses + " and " + perfTest
                + ": " + CommonPropCalcRunner.calcLCM(tosses, perfTest));

        View.print(number + " contains "
                + DigitCounter.howManyDigits(number) + " digits");

        View.print(perfTest + " is perfect: "
                + PerfectNumberIndicator.indicatePerfect(perfTest));

    }

}
