package lesson7.string;

import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;

public class StringCreateExample {

//    public static void main() {
//        System.out.println("Hello, World!");
//    }


    public static void main(String[] args) {
        if (args.length == 1) {
            String greetings = args[0];
            System.out.println(greetings);
        }
        String s1 = "Java";
        String s2 = "Java";
        System.out.println("Equals: " + (s1.equals(s2)));
        System.out.println("Identify: " + (s1 == s2));

        String replace = s1.replace('a', 'o');
        System.out.println(replace);


        char[] chars = {'A', 'B', 'C'};
//        char[] chars = null;
//        String test = null;
        String s3 = new String(chars);
//        System.out.println(s3);
        String s4 = String.valueOf(chars);
//        System.out.println(s4);

        Integer a = 5;
        Integer b = null;
        System.out.println(a.toString());
//        System.out.println(b);
        System.out.println("sagsa" + 5 + true + "dsg");

        System.out.println(Charset.defaultCharset());
        String s5 = new String(new byte[]{65, 66, 67});
        String s6 = new String(new byte[]{0, 65, 0, 66, 66, 66}, StandardCharsets.UTF_16);
        System.out.printf("s1 = %s%n s2 = %s%n s3 = %s%n s4 = %s%n s5 = %s%n s6 = %s", s1, s2, s3, s4, s5, s6);

        System.out.println("----");
        String latin1 = "Джава";
        System.out.println(latin1);
        System.out.println(Arrays.toString(latin1.getBytes()));
        System.out.println("----");
        String utf16 = "Java☺";
        System.out.println(utf16);
        System.out.println(Arrays.toString(utf16.getBytes()));

    }
}
