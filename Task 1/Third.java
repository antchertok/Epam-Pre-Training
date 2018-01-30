public class Third {
    
    static void changeStorage(double a, double b) {
        a = a - b;
        b = b + a;
        a = b - a;
        System.out.println(a + " " + b);
    }
}
