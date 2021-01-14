package lesson7.string;

import java.io.IOException;
import java.util.Locale;

public class StringConcat {

    public static void main(String[] args) throws IOException {
        String a1 = "Hello ";
        String a2 = "World";
        String a3 = a1 + a2 + a1 + a2;
//        String a3 = a1.concat(a2).concat(a1).concat(a2);
        System.out.println(a3);

        String trim = " sgasgds sdfgsdg sdgreg          ";
        System.out.println(trim);
        System.out.println(trim.trim());

//        for (int i = 0; i < trim.length(); i++) {
//            System.out.println(trim.charAt(i));
//        }

        String emptyString = "             ";
        System.out.println(trim.replace(" ", ""));
        String regex = " sdgdsgsd 123sdgsdg 5464862dsgsdg";
        System.out.println(regex.replaceFirst("\\d{3}", "!"));
        System.out.println(regex.replaceAll("\\d{3}", "!"));

//
//
//
//        String sss = "abv dgdsg      dsgds    dsgdsg";
//        for (String s : sss.split("\\s+")) {
//            System.out.println(s);
//        }

        String ss1 = "ABCDE";
        String ss2 = "abcdE";
        System.out.println("LOWER and UPPER:");
        System.out.println(ss1.toLowerCase());
        System.out.println(ss2.toUpperCase());
//
        System.out.println("CONTAINS:");
        String s111 = "abcde";
        String s112 = "bc";
//        s112 = "dsgds";
        System.out.println(s111.contains(s112));

        System.out.println("BLANK:");
        String blank = "       ";
        String empty = "";
        String common = "dsgds";
        System.out.println("empty: " + common.isEmpty());
        System.out.println("blank: " + common.isBlank());

//        System.out.println(ss1.compareTo(ss2));
////
////
//        String ssss = "     Десять: " + (5 + 5) + "    ";
//        System.out.println(ssss.trim());
//
//        System.out.println("Index of: " + "Десять".indexOf("ять"));

        String[] data = {"a" , "b" , "c" , "d" , "e"};
        String result = "";
        for (String value : data) {
            result += value;
        }
        System.out.println(result);


        StringBuilder sb = new StringBuilder();
        for (String value : data) {
            sb.append(value);
        }

        System.out.println(sb.toString());
//
        String result1 = "a" + "b" + "c" + "d" + "e";
        System.out.println(result1);
    }

}
