package second;

public class Fourth {

    static String nextDay(int day, int month, int year) {

        switch (month) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
                month = (day != 31) ? month : ++month;
                day = (day != 31) ? ++day : 1;
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                month = (day != 30) ? month : ++month;
                day = (day != 30) ? ++day : 1;
                break;
            case 2:
                if (!Year.isLeap(year)) {
                    month = (day != 28) ? month : ++month;
                    day = (day != 28) ? ++day : 1;
                } else {
                    month = (day != 29) ? month : ++month;
                    day = (day != 29) ? ++day : 1;

                }
                break;
            case 12:
                month = (day != 31) ? month : 1;
                year = (day != 31) ? year : ++year;
                day = (day != 31) ? ++day : 1;
                break;
            default:
                return "INCORRECT INPUT";
        }

        return "Следующий день: " + day + "." + month + "." + year;
    }

    //    Если с дополнительным классом нельзя
    static String veryNextDay(int day, int month, int year) {

        switch (month) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
                month = (day != 31) ? month : ++month;
                day = (day != 31) ? ++day : 1;
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                month = (day != 30) ? month : ++month;
                day = (day != 30) ? ++day : 1;
                break;
            case 2:
                if (year % 4 != 0) {
                    month = (day != 28) ? month : ++month;
                    day = (day != 28) ? ++day : 1;
                } else {
                    month = (day != 29) ? month : ++month;
                    day = (day != 29) ? ++day : 1;

                }
                break;
            case 12:
                month = (day != 31) ? month : 1;
                year = (day != 31) ? year : ++year;
                day = (day != 31) ? ++day : 1;
                break;
            default:
                return "INCORRECT INPUT";
        }

        return "Следующий день: " + day + "." + month + "." + year;
    }
}

class Year {
    static boolean isLeap(int year) {
        boolean isLeap;

        if (year % 4 == 0) {
            isLeap = true;

            if (year % 100 == 0) {
                isLeap = (year % 400 == 0) ? true : false;
            }
        } else {
            isLeap = false;
        }
        return isLeap;
    }
}
