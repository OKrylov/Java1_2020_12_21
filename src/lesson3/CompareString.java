package lesson3;

public class CompareString {

    public static void main(String[] args) {
        String str1 = "Java";//001[005]
        String str2 = new String("Java");//002[015]
        String str3 = "Java";//003[005]
        System.out.println("str1 == str2: " + (str1 == str2));
        System.out.println("str1 == str3: " + (str1 == str3));
        System.out.println("str1 equals str2: " + (str1.equals(str2)));
//        if (str1.equals(str2) && str1.equals(str3) && ...)
//        str2 = "Java1";
//        System.out.println(str2);
//        System.out.println(str1);
    }
}
