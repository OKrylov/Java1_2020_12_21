package lesson1.homework;

public class Task5 {

    public static void main(String[] args) {
        digitIdentifier(-5);
        digitIdentifier(0);
        digitIdentifier(5);
    }

    private static void digitIdentifier(int digit) {
        if (digit < 0) {
            System.out.println(digit + " is negative digit");
        }
        else {
            System.out.println(digit + " is positive digit");
        }
    }
}
