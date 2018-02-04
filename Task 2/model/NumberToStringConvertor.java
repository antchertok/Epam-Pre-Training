package second.model;

public class NumberToStringConvertor {

    public static String convertNumberToString(int number) {
        StringBuilder numberAsString = new StringBuilder();

        if (consistsHundreds(number)) {
            numberAsString.append(getStringForHundreds(number));
            number %= 100;

            if (number != 0) {
                numberAsString.append(" and");
            }
        }

        if (consistsTens(number)) {
            numberAsString.append(getStringForTens(number));
        } else {
            numberAsString.append(getStringForUnits(number));
        }
        
        return numberAsString.toString();
    }

    private static String getStringForHundreds(int number) {

        switch (number / 100) {
            case 1:
                return "one hundred";
            case 2:
                return "two hundred";
            case 3:
                return "three hundred";
            case 4:
                return "four hundred";
            case 5:
                return "five hundred";
            case 6:
                return "six hundred";
            case 7:
                return "seven hundred";
            case 8:
                return "eight hundred";
            case 9:
                return "nine hundred";
            default:
                return "";
        }
    }

    private static String getStringForTens(int number) {

        if (number / 10 != 1) {
            return getStringForHigherTens(number);
        } else {
            return getStringForLowerTens(number);
        }
    }

    private static String getStringForHigherTens(int number) {
        StringBuilder numberAsString = new StringBuilder();

        switch (number / 10) {
            case 2:
                numberAsString.append(" twenty");
                break;
            case 3:
                numberAsString.append(" thirty");
                break;
            case 4:
                numberAsString.append(" forty");
                break;
            case 5:
                numberAsString.append(" fifty");
                break;
            case 6:
                numberAsString.append(" sixty");
                break;
            case 7:
                numberAsString.append(" seventy");
                break;
            case 8:
                numberAsString.append(" eighty");
                break;
            case 9:
                numberAsString.append(" ninety");
                break;
        }
        
        number %= 10;
        numberAsString.append(getStringForUnits(number));
        
        return numberAsString.toString();
    }

    private static String getStringForLowerTens(int number) {

        switch (number) {
            case 10:
                return " ten";
            case 11:
                return " eleven";
            case 12:
                return " twelwe";
            case 13:
                return " thirteen";
            case 14:
                return " fourteen";
            case 15:
                return " fifteen";
            case 16:
                return " sixteen";
            case 17:
                return " seventeen";
            case 18:
                return " eighteen";
            case 19:
                return " nineteen";
            default:
                return "";
        }
    }

    private static String getStringForUnits(int number) {

        switch (number) {
            case 1:
                return " one";
            case 2:
                return " two";
            case 3:
                return " three";
            case 4:
                return " four";
            case 5:
                return " five";
            case 6:
                return " six";
            case 7:
                return " seven";
            case 8:
                return " eight";
            case 9:
                return " nine";
            default:
                return "";
        }
    }

    private static boolean consistsHundreds(int number) {
        return number / 100 != 0;
    }

    private static boolean consistsTens(int number) {
        return number / 10 != 0;
    }
}

