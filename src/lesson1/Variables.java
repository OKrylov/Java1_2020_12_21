package lesson1;

public class Variables {

    private static int z;
    private static String x;

    public static void main(String[] args) {
//        testPrimitive();
//        testObject();
        testArithmeticOperation();
    }

    public static void testArithmeticOperation() {
        int a = 1;
        System.out.println(a);

//        a = a + 5
        a += 5;

//        int b = a--;
//        System.out.println(b);
        System.out.println(a);
    }

    private static void testObject() {
//        String str = new String("Hello!");
        String str = "Hello!";
        System.out.println(str);
        System.out.println(x);

        Calculator calculator = new Calculator(2, 3);
        int sum = calculator.sum();
        System.out.println(sum);
    }

    private static void testPrimitive() {
        System.out.println(z);
        int a = 5;
//        Integer a = 5;
        long b = 5_000_000_000L;

        float c = 0.5f;
        double d = 0.5;

        var v = 11L;
        System.out.println(((Object)v).getClass().getSimpleName());

        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
    }
}
