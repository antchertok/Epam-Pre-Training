package second.controller;

import second.view.View;
import second.model.*;

public class Test {
    public static void main(String[] args) {
        int ageOfDragon = 110;
        int day = 31;
        int month = 12;
        int year = 2000;
        String letter = "A";

        View.print("The dragon has "
                + DragonAnalyzer.getAmountOfHeads(ageOfDragon) + " heads and "
                + DragonAnalyzer.getAmountOfEyes(ageOfDragon) + " eyes.");
        View.print("It's "
                + NumberToStringConvertor.convertNumberToString(ageOfDragon)
                + " years old.");
        View.print("The next day after " + day + "." + month + "." + year
                + " is " + DaySwitch.nextDay(day, month, year));
        View.print("The letter " + letter +" is "
                + (VowelsDetector.isVowelSwitch(letter) ? "vowel" : "consonant"));
        MoodDetector.detectMood();

    }
}
