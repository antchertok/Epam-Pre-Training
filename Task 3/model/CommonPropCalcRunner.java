package third.model;

public class CommonPropCalcRunner {
    public static int calcGCD(int firstNumber, int secondNumber){
        int gsd = 1;//Следует ли возвращать что-либо в случае исключения? Бросать RuntimeException?

        try {
            gsd = CommonPropCalc.calcGCD(firstNumber, secondNumber);
        } catch (ZeroDetectedException e){
            e.printStackTrace();
        }

        return gsd;
    }

    public static int calcLCM(int firstNumber, int secondNumber){
        int lcm = 1;

        try {
            lcm = CommonPropCalc.calcLCM(firstNumber, secondNumber);
        } catch (ZeroDetectedException e){
            e.printStackTrace();
        }

        return lcm;
    }
}
