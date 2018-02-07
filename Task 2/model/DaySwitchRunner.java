package second.model;

public class DaySwitchRunner{
    public static String nextDay(int day, int month, int year){
        String nextDay = null;
        try{
            nextDay =  DaySwitch.nextDay(day, month, year);
        } catch (InvalidDateException e){
            e.printStackTrace();
        }
        return nextDay;
    }
}





