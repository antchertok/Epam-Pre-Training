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
        View.print("Next day: " + DaySwitchRunner.nextDay(day, month, year));
        View.print("The letter " + letter + " is vowel: " 
                + VowelsDetector.isVowelSwitch(letter));
        View.print(MoodDetectorRunner.detectMood(amountOfMoods));

    }
}
