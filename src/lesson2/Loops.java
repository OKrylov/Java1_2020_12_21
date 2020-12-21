package lesson2;

public class Loops {

    public static void main(String[] args) {
//        forExample();
//        innerLoop();
//
//        for (boolean b = true; b; ) {
//            System.out.println(b);
//        }

        whileExample();

    }

    private static void whileExample() {
        int a = 10;
//        while (a > 0) {
//            System.out.println(a);
//            a--;
//        }

//        while (true) {
//            System.out.println(a);
//            a--;
//            if (a < 0) {
//                break;
//            }
//        }

        do {
            System.out.println(a);
            a--;
        } while (a > 0);
    }

    private static void innerLoop() {
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 8; j++) {
                if (j == 3) {
                    continue;
                }
                if (j == 5) {
                    break;
                }
                System.out.print(" " + i + j);
            }
            System.out.println();
        }
//        System.out.println(i);

    }

    private static void forExample() {
        for (int i = 10; i >= 0; i--) {
            System.out.println(i);
        }

        System.out.println("-------");

        for (int i = 1, j = 2; i < 10 && j > 0; i++, j--) {
            System.out.println(i);
        }

        for (;;) {
            System.out.println(1);
        }


    }
}
