package lesson1;

public class Conditions {

    public static void main(String[] args) {
//        int a = 5;
//        Integer a = 5;


        // && & -  AND
        // || | -  OR
        // ^    -  XOR

        int a = 2;
        int b = 5;

        System.out.println("2 = " + Integer.toBinaryString(2));
        System.out.println("5 = " + Integer.toBinaryString(5));

        System.out.println(2 & 5);
        System.out.println(2 | 5);
        System.out.println(2 ^ 5);

        if (2 > 0 | 5 > 0) {
            System.out.println();
        }


//        if (a == null) {
//            System.out.println("a is null!");
//        }
//        else if (a > 0) {
//            System.out.println("a is positive");
//        } else if (a < 0) {
//            System.out.println("a is negative");
//        } else {
//            System.out.println("a is zero!");
//        }
    }
}
