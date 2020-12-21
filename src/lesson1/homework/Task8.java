package lesson1.homework;

public class Task8 {

    public static void main(String[] args) {
        printLeapYear(1);
        printLeapYear(4);
        printLeapYear(40);
        printLeapYear(100);
        printLeapYear(300);
        printLeapYear(400);
        printLeapYear(700);
    }

    public static void printLeapYear(int year) {
        boolean isLeap = isLeapYear(year);
        if (isLeap) {
            System.out.print(year + " is leap year\n");
        }
        else {
            System.out.print(year + " is not leap year\n");
        }
    }

    private static boolean isLeapYear(int year) {
        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
//        if (year % 400 == 0) {
//            return true;
//        }
//        if (year % 100 == 0) {
//            return false;
//        }
//        return year % 4 == 0;

    }
}
