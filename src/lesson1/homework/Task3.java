package lesson1.homework;

public class Task3 {

    public static void main(String[] args) {
        double result = evaluateExpression(2,5, 4, 0);
        System.out.println(result);
    }

    private static double evaluateExpression(int a, int b, int c, int d) {
        if (d == 0) {
            return 0;
        }

        return a * (b + (1.0 * c / d));
    }
}
