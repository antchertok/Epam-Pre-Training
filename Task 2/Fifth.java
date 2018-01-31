package second;

import java.util.Scanner;

public class Fifth {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        View.print("***Название числа в виде строки***\n");
        View.print("Введите число: ");
        int number = scanner.nextInt();
        View.print("Число в виде строки: " + numberAsString(number));
    }

    static String numberAsString(int n) {
        String numberAsString = "";

        if (n / 100 != 0) {
            numberAsString = stringForHundreds(n);
            n %= 100;
        }
        if (n / 10 != 0) {
            numberAsString += stringForTens(n);
        } else {
            numberAsString += stringForUnits(n);
        }
        return numberAsString;
    }

    static String stringForHundreds(int n) {
        String numberAsString = "";

        switch (n / 100) {
            case 1:
                numberAsString += "сто ";
                break;
            case 2:
                numberAsString += "двести ";
                break;
            case 3:
                numberAsString += "триста ";
                break;
            case 4:
                numberAsString += "четыреста ";
                break;
            case 5:
                numberAsString += "пятьсот ";
                break;
            case 6:
                numberAsString += "шестьсот ";
                break;
            case 7:
                numberAsString += "семьсот ";
                break;
            case 8:
                numberAsString += "восемьсот ";
                break;
            case 9:
                numberAsString += "девятьсот ";
                break;
        }

        return numberAsString;
    }

    static String stringForTens(int n) {
        String numberAsString = "";

        if (n / 10 != 1) {
            switch (n / 10) {
                case 2:
                    numberAsString += "двадцать ";
                    break;
                case 3:
                    numberAsString += "тридцать ";
                    break;
                case 4:
                    numberAsString += "сорок ";
                    break;
                case 5:
                    numberAsString += "пятьдесят ";
                    break;
                case 6:
                    numberAsString += "шестьдесят ";
                    break;
                case 7:
                    numberAsString += "семьдесят ";
                    break;
                case 8:
                    numberAsString += "восемьдесят ";
                    break;
                case 9:
                    numberAsString += "девяносто ";
                    break;
            }
            n %= 10;
            numberAsString += stringForUnits(n);
        } else {
            switch (n) {
                case 10:
                    numberAsString += "десять";
                    break;
                case 11:
                    numberAsString += "одинадцать ";
                    break;
                case 12:
                    numberAsString += "двенадцать ";
                    break;
                case 13:
                    numberAsString += "тринадцать ";
                    break;
                case 14:
                    numberAsString += "четырнадцать ";
                    break;
                case 15:
                    numberAsString += "пятнадцать ";
                    break;
                case 16:
                    numberAsString += "шестнадцать ";
                    break;
                case 17:
                    numberAsString += "семнадцать ";
                    break;
                case 18:
                    numberAsString += "восемнадцать ";
                    break;
                case 19:
                    numberAsString += "девятнадцать ";
                    break;
            }
        }
        return numberAsString;
    }

    static String stringForUnits(int n) {
        String numberAsString = "";

        switch (n) {
            case 1:
                numberAsString += "один";
                break;
            case 2:
                numberAsString += "два";
                break;
            case 3:
                numberAsString += "три";
                break;
            case 4:
                numberAsString += "четыре";
                break;
            case 5:
                numberAsString += "пять";
                break;
            case 6:
                numberAsString += "шесть";
                break;
            case 7:
                numberAsString += "семь";
                break;
            case 8:
                numberAsString += "восемь";
                break;
            case 9:
                numberAsString += "девять";
                break;
        }

        return numberAsString;
    }
}

class View {

    static void print(Object msg) {
        System.out.print(msg);
    }
}
