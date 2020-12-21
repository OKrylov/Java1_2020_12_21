package lesson3;

public class VarArgs {

    public static void main(String[] args) {
        System.out.println(sum(1, 2, 3, 4, 5));
        System.out.println(sum());
        System.out.println(sum(1));
        System.out.println(sum(1, 2, 3));
    }

    private static int sum() {
        return 0;
    }

    private static int sum(int a, int b) {
        return a + b;
    }

    private static int sum(int... other) {
        int sum = 0;
        for (int value : other) {
            sum += value;
        }
        return sum;
    }
}
