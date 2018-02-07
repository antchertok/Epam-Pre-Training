package second.model;

public class DaySwitch {
    private static final int THIRTY_ONE_DAYS = 31;
    private static final int THIRTY_DAYS = 30;
    private static final int DAYS_PER_FEB = 28;
    private static final int DAYS_PER_FEB_IN_LEAP_YEAR = 29;
    private static final int FIRST = 1;
    private static final int PERIOD_BETWEEN_LEAP_YEARS = 4;


    public static String nextDay(int day, int month, int year) {

        if (!isValidDate(day, month, year)) {
            throw new RuntimeException("Incorrect input");// УБРАТЬ
        }

        if (month == 4 || month == 6 || month == 9 || month == 11) {
            month = (day != THIRTY_DAYS) ? month : ++month;
            day = (day != THIRTY_DAYS) ? ++day : FIRST;
        } else if (month == 2) {
            if (!isLeap(year)) {
                month = (day != DAYS_PER_FEB) ? month : ++month;
                day = (day != DAYS_PER_FEB) ? ++day : FIRST;
            } else {
                month = (day != DAYS_PER_FEB_IN_LEAP_YEAR) ? month : ++month;
                day = (day != DAYS_PER_FEB_IN_LEAP_YEAR) ? ++day : FIRST;
            }
        } else if (month == 12) {
            month = (day != THIRTY_ONE_DAYS) ? month : FIRST;
            year = (day != THIRTY_ONE_DAYS) ? year : ++year;
            day = (day != THIRTY_ONE_DAYS) ? ++day : FIRST;
        } else {
            month = (day != THIRTY_ONE_DAYS) ? month : ++month;
            day = (day != THIRTY_ONE_DAYS) ? ++day : FIRST;

        }
        return day + "." + month + "." + year;
    }

    private static boolean isLeap(int year) {
        boolean isLeap = false;

        if (year % PERIOD_BETWEEN_LEAP_YEARS == 0) {
            isLeap = true;

            if (year % 100 == 0) {
                isLeap = year % 400 == 0 ? true : false;
            }
        }
        return isLeap;
    }

    private static boolean isValidDate(int day, int month, int year) {
        boolean isValid = true;

        if (year < 0 || day < 0 || month < 1 || month > 12) {
            isValid = false;
        }

        if(isValid){
            if (month == 1 || month == 3 || month == 5 || month == 7
                    || month == 8 || month == 10 || month == 12) {
                if (day > 31) {
                    isValid = false;
                }
            } else if (month == 4 || month == 6 || month == 9 || month == 11) {
                if (day > 30) {
                    isValid = false;
                }
            } else if (!isLeap(year) || day > 28) {
                isValid = false;
            } else if (day > 29) {
                isValid = false;
            }
        }
        
        return isValid;
    }
}


