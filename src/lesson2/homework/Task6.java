package lesson2.homework;

public class Task6 {

    public static void main(String[] args) {
        System.out.println(checkBalance(new int[] {2, 2, 2, 1, 2, 2, 10, 1}));
        System.out.println(checkBalance(new int[] {1, 1, 1, 2, 1}));
        System.out.println(checkBalance(new int[] {3, 5}));
        System.out.println(checkBalance(new int[] {1, 2, 0, 0, 3}));
    }

    private static boolean checkBalance(int[] array) {
        System.out.println();
        boolean result = false;
        int leftSum = 0;
        int rightSum = sum(array, 0, array.length);
        for (int i = 1; i < array.length; i++) {
            leftSum += array[i - 1];
//            int leftSum  = sum(array, 0, i);//[0; i)
//            int rightSum = sum(array, i, array.length);
            rightSum -= array[i - 1];
            if (leftSum == rightSum) {
                System.out.println("Common sum = " + leftSum + "; index = " + i);
                result = true;
            }
        }
        System.out.println("-----");
        return result;
    }

    private static int sum(int[] array, int start, int end) {
        int sum = 0;
        for (int i = start; i < end; i++) {
            sum += array[i];
        }
        return sum;
    }
}
