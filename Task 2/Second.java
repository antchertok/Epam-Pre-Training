package second;

public class Second {

    static boolean isVowelSwitch(String letter) {
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

    static boolean isVowelIfElse(String letter) {
        letter = letter.toUpperCase();
        boolean isVowel;

        if (letter.equals("A")) {
            isVowel = true;
        } else if (letter.equals("E")) {
            isVowel = true;
        } else if (letter.equals("I")) {
            isVowel = true;
        } else if (letter.equals("O")) {
            isVowel = true;
        } else if (letter.equals("U")) {
            isVowel = true;
        } else if (letter.equals("Y")) {
            isVowel = true;
        } else {
            isVowel = false;
        }

        return isVowel;
    }

    static boolean isVowelIf(String letter) {
        letter = letter.toUpperCase();
        boolean isVowel = false;

        if (letter.equals("A") || letter.equals("E") || letter.equals("I")
                || letter.equals("O") || letter.equals("U") || letter.equals("Y")) {
            isVowel = true;
        }

        return isVowel;
    }

    static boolean isVowelReturn(String letter){
        letter = letter.toUpperCase();
        return (letter.equals("A") || letter.equals("E") || letter.equals("I")
                    || letter.equals("O") || letter.equals("U") || letter.equals("Y"));
    }

    static boolean isVowelString(String letter) {
        return "AEIOUY".contains(letter.toUpperCase());
    }

}
