public class Fifth {
    
    static int calcSum(int n) {
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

        sum += n;
        return sum;
    }

    static int calcMult(int n) {
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

        mult *= n;
        return mult;
    }
}
