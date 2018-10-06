package second.model;

public class VowelsDetector {
    private static final String VOWELS = "AEIOUY";

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
        boolean isVowel = false;
        letter = letter.toUpperCase();

        if ((letter.equals("A") || letter.equals("E")
                || letter.equals("I") || letter.equals("O")
                || letter.equals("U") || letter.equals("Y"))) {
            isVowel = true;
        }
        
        return isVowel;
    }

    public static boolean isVowelReturn(String letter) {
        letter = letter.toUpperCase();
        return (letter.equals("A") || letter.equals("E")
                || letter.equals("I") || letter.equals("O")
                || letter.equals("U") || letter.equals("Y"));
    }

    public static boolean isVowelString(String letter) {
        return VOWELS.contains(letter.toUpperCase());
    }

}
