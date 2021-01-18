package lesson7.string;

public class HomeworkString {

    public static void main(String[] args) {
        testString("I like Java!!!");
    }

    // a) Напишите метод, который принимает в качестве параметра любую строку, например “I like Java!!!”.
    private static void testString(String str) {
        System.out.println("Test String: " + str);

        // б) Распечатать последний символ строки. Используем метод String.charAt().
        System.out.println("Last char: " + str.charAt(str.length() - 1));

        // в) Проверить, заканчивается ли ваша строка подстрокой “!!!”. Используем метод String.endsWith().
        System.out.println("End with '!!!': " + str.endsWith("!!!"));

        // г) Проверить, начинается ли ваша строка подстрокой “I like”. Используем метод String.startsWith().
        System.out.println("start with 'I like': " + str.startsWith("I like"));

        // д) Проверить, содержит ли ваша строка подстроку “Java”. Используем метод String.contains().
        System.out.println("contains 'Java': " + str.contains("Java"));

        // e) Найти позицию подстроки “Java” в строке “I like Java!!!”.
        System.out.println("index of 'Java' substring: " + str.indexOf("Java"));

        // ж) Заменить все символы “а” на “о”.
        System.out.println("Replace all 'a' to 'o': " + str.replace('a', 'o'));

        // з) Преобразуйте строку к верхнему регистру.
        System.out.println("To upper case: " + str.toUpperCase());

        // и) Преобразуйте строку к нижнему регистру.
        System.out.println("To lower case: " + str.toLowerCase());

        // к) Вырезать строку Java c помощью метода String.substring().
        String targetSubstr = "Java";
        int beginIndex = str.indexOf(targetSubstr);
        int endIndex = beginIndex + targetSubstr.length();
        System.out.println("Get 'Java' substring: " + str.substring(beginIndex, endIndex));
    }
}
