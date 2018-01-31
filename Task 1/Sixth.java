public class Sixth {
    
    static double calcArithAverage(int n) {
        double average;
        int digit;
        int sum = 0;
        
        digit = n % 10;
        sum += digit;
        n /= 10;

        digit = n % 10;
        sum += digit;
        n /= 10;

        digit = n % 10;
        sum += digit;
        n /= 10;

        digit = n % 10;
        sum += digit;
        n /= 10;

        digit = n % 10;
        sum += digit;
        n /= 10;

        sum += n;
        average = sum / 6.0;
        
        return average;
    }

    static double calcGeomAverage(int n) {
        double average;
        int digit;
        int mult = 1;
        
        digit = n % 10;
        mult *= digit;
        n /= 10;

        digit = n % 10;
        mult *= digit;
        n /= 10;

        digit = n % 10;
        mult *= digit;
        n /= 10;

        digit = n % 10;
        mult *= digit;
        n /= 10;

        digit = n % 10;
        mult *= digit;
        n /= 10;

        mult *= n;
        average = Math.pow(mult, 1.0 / 6);
        
        return average;
    }
}
