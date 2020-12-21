package lesson1;

public class Calculator {

    private int a;
    private int b;

    public Calculator(int a, int b) {
        this.a = a;
        this.b = b;
//        char t = "3";
    }

    public int sum() {
        return a + b;
    }
}
