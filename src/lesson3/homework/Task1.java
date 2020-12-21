package lesson3.homework;

import java.util.Random;
import java.util.Scanner;

public class Task1 {

    private static final int ATTEMPT_NUMBER = 3;
    private static final int MAX_VALUE = 9;

    public static void main(String[] args) {
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            playGame(random, scanner);

            System.out.println("Повторить игру еще раз? 1 – да / 0 – нет");

            int result = getRepeatGameAnswer(scanner);
            if (result == 0) {
                break;
            }
        }
    }

    private static void playGame(Random random, Scanner scanner) {
        int targetValue = random.nextInt(MAX_VALUE + 1);

        System.out.println("Я загадал число от 0 до 9! Угадай, какое?");

        boolean isWin = false;
        for (int attempt = 0; attempt < ATTEMPT_NUMBER; attempt++) {
            System.out.printf("Попытка номер %d.%n", attempt + 1);
            int userValue = getUserValue(scanner);
            if (userValue == targetValue) {
                System.out.println("Все верно!");
                isWin = true;
                break;
            }
            else if (userValue < targetValue) {
                System.out.println("Загаданное число больше " + userValue);
            }
            else {
                System.out.println("Загаданное число меньше " + userValue);
            }
        }

        String messageResult = isWin ? "Вы выиграли!" : "Вы проиграли!";
        System.out.println(messageResult);
    }

    private static int getRepeatGameAnswer(Scanner scanner) {
        int result = -1;
        do {
            if (!scanner.hasNextInt()) {
                System.out.println("Некорректный формат ответа. Введите 1, если да и 0, если нет");
                scanner.nextLine();
                continue;
            }
            result = Integer.parseInt(scanner.nextLine());
        } while (result != 0 && result != 1);

        return result;
    }

    private static int getUserValue(Scanner scanner) {
        int result = -1;
        do {
            try {
                System.out.print("Введите число: ");
                String consoleLine = scanner.nextLine();
                int value = Integer.parseInt(consoleLine);
                if (value < 0 || value > MAX_VALUE) {
                    System.out.println("Число вне диапазона, пробуй еще!");
                    continue;
                }
                result = value;
            } catch (NumberFormatException e) {
                System.out.println("Это не число, в следующий раз давай без фокусов!");
            }
        } while (result == -1);

        return result;
    }
}
