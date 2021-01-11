package lesson5;

public class TestObject {

    public static void main(String[] args) {
        int a = 5;
        testPrimitive(a);
        System.out.println(a);

        Cat c1 = new Cat("Barsik", "Grey", 5);
        testObject(c1);
        System.out.println(c1.name);
    }

    private static void testObject(Cat c2) { // c2 = c1;
        c2.name = "SUPER CAT";
        c2 = new Cat("Markiz", "White", 8);
    }

    private static void testPrimitive(int a) {
        a = 6;
    }
}
