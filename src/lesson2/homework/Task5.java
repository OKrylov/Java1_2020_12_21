package lesson2.homework;

public class Task5 {

    public static void main(String[] args) {
        int[] array = {5, 2, 7, 1, 8, 3};
        int min = array[0];
        int max = array[0];
        for (int i = 1; i < array.length; i++) {
//            min = Math.min(min, array[i]);
//            max = Math.max(max, array[i]);
            if (array[i] < min) {
                min = array[i];
            }
            if (array[i] > max) {
                max = array[i];
            }
        }
        System.out.println("Min = " + min);
        System.out.println("Max = " + max);
    }
}
