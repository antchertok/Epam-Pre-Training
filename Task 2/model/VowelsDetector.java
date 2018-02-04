package second.model;

public class VowelsDetector {

    public static boolean isVowelSwitch(String letter) {
        switch (letter.toUpperCase()) {
            case "A":
            case "E":
            case "I":
            case "O":
            case "U":
            case "Y":
                return true;
            default:
                return false;
        }
    }

    public static boolean isVowelIfElse(String letter) {
        letter = letter.toUpperCase();

        if (letter.equals("A")) {
            return true;
        } else if (letter.equals("E")) {
            return true;
        } else if (letter.equals("I")) {
            return true;
        } else if (letter.equals("O")) {
            return true;
        } else if (letter.equals("U")) {
            return true;
        } else if (letter.equals("Y")) {
            return true;
        } else {
            return false;
        }
    }

    public static boolean isVowelConditionalOperator(String letter) {
        letter = letter.toUpperCase();

        boolean isVowel = letter.equals("A");
        isVowel = (letter.equals("E") || isVowel) ? true : false;
        isVowel = (letter.equals("I") || isVowel) ? true : false;
        isVowel = (letter.equals("O") || isVowel) ? true : false;
        isVowel = (letter.equals("U") || isVowel) ? true : false;
        isVowel = (letter.equals("Y") || isVowel) ? true : false;

        return isVowel;
    }

    public static boolean isVowelReturn(String letter) {
        letter = letter.toUpperCase();
        return (letter.equals("A") || letter.equals("E")
                || letter.equals("I") || letter.equals("O")
                || letter.equals("U") || letter.equals("Y"));
    }

    public static boolean isVowelString(String letter) {
        return "AEIOUY".contains(letter.toUpperCase());
    }

}
