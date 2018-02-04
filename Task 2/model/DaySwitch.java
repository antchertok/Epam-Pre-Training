package second.model;

public class DaySwitch {
    private static final int THIRTY_ONE_DAYS = 31;
    private static final int THIRTY_DAYS = 30;
    private static final int DAYS_PER_FEB = 28;
    private static final int DAYS_PER_FEB_IN_LEAP_YEAR = 29;
    private static final int FIRST = 1;

    public static String nextDay(int day, int month, int year) {

        switch (month) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
                month = (day != THIRTY_ONE_DAYS) ? month : ++month;
                day = (day != THIRTY_ONE_DAYS) ? ++day : FIRST;
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                month = (day != THIRTY_DAYS) ? month : ++month;
                day = (day != THIRTY_DAYS) ? ++day : FIRST;
                break;
            case 2:
                if (!Year.isLeap(year)) {
                    month = (day != DAYS_PER_FEB) ? month : ++month;
                    day = (day != DAYS_PER_FEB) ? ++day : FIRST;
                } else {
                    month = (day != DAYS_PER_FEB_IN_LEAP_YEAR) ? month : ++month;
                    day = (day != DAYS_PER_FEB_IN_LEAP_YEAR) ? ++day : FIRST;
                }
                break;
            case 12:
                month = (day != THIRTY_ONE_DAYS) ? month : FIRST;
                year = (day != THIRTY_ONE_DAYS) ? year : ++year;
                day = (day != THIRTY_ONE_DAYS) ? ++day : FIRST;
                break;
            default:
                return "INCORRECT INPUT";    
        }

        return day + "." + month + "." + year;
    }

    private static class Year {
        private static final int PERIOD_BETWEEN_LEAP_YEARS = 4;

        static boolean isLeap(int year) {
            return year % PERIOD_BETWEEN_LEAP_YEARS == 0;
        }
    }

}



