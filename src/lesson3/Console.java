package lesson3;

import java.io.IOException;
import java.util.Scanner;

public class Console {

    public static void main(String[] args) throws IOException {
//        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
//        String line = reader.readLine();
//        System.out.println("Line from console: " + line);


        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Введите число от 0 до 10: ");

            if (!scanner.hasNextInt()) {
                System.out.println("Было введено нечисловое значение!");
                scanner.nextLine();
                continue;
            }

            int digit = scanner.nextInt();

            if (digit >= 0 && digit <= 10) {
                System.out.println("Пользователь ввёл корректное значение: " + digit);
                break;
            }
            else {
                System.out.println("Пользователь ввёл НЕКОРРЕКТНОЕ значение: " + digit);
            }
        }

//        String str = scanner.nextLine();
//        while (!str.equals("exit")) {
//            System.out.println("From scanner: " + str);
//            str = scanner.nextLine();
//        }
    }
}
