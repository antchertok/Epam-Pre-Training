public class Task1 {
    //    1 Граммы в тонны
    static double getTons(long grams) {
        return grams / 1_000_000;
    }

    //    2 Площадь кольца
    static double getCircleSquare(double r1, double r2) {
        return 3.14 * (r1 * r1 - r2 * r2);
    }

    //    3 Поменять местами содержимое переменных
    static void changeStorage(double a, double b) {
        a = a - b;
        b = b + a;
        a = b - a;
        System.out.println(a + " " + b);
    }

    //    4 Являются ли числа в чиле возрастающей последовательностью
    static boolean isIncreasingSequence(int n) {
        int digit;
        boolean isIncreasing = true;
        for (int i = 0; i < 4; i++) {
            digit = n % 10;
            n /= 10;
            if (digit < n % 10) {
                isIncreasing = false;
            }
        }
        return isIncreasing;
    }

    //    5.1 Сумма цифр в числе
    static int calcSum(int n) {
        int sum = 0;
        for (int i = 0; i < 5; i++) {
            sum += (n % 10);
            n /= 10;
        }
        return sum;
    }

    //    5.2 Произведение цифр в числе
    static int calcMult(int n) {
        int mult = 1;
        for (int i = 0; i < 5; i++) {
            mult *= (n % 10);
            n /= 10;
        }
        return mult;
    }

    //    6.1 Среднее арифметическое цифр в числе
    static double calcArithAverage(int n) {
        double average;
        int sum = 0;
        for (int i = 0; i < 6; i++) {
            sum += (n % 10);
            n /= 10;
        }
        average = sum / 6.0;
        return average;
    }

    //    6.2 Среднее геометрическое цифр в числе
    static double calcGeomAverage(int n) {
        double average;
        int mult = 1;
        for (int i = 0; i < 6; i++) {
            mult *= (n % 10);
            n /= 10;
        }
        average = Math.pow(mult, 1.0 / 6);
        return average;
    }

    //    7 Число с цифрами в обратном порядке
    static int reverse(int n) {
        int reversed = 0;
        for (int i = 0; i < 7; i++) {
            reversed = reversed * 10 + n % 10;
            n /= 10;
        }
        return reversed;
    }
}
