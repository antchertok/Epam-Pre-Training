package second.model;

public class DaySwitchRunner{
    public static String nextDay(int day, int month, int year){
        String nextDay = "Incorrect input";
        
        try{
            nextDay =  DaySwitch.nextDay(day, month, year);
        } catch (InvalidDateException e){
            e.printStackTrace();
        }
        
        return nextDay;
    }
}





