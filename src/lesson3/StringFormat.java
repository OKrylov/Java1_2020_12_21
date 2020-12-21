package lesson3;

public class StringFormat {


    public static void main(String[] args) {
        String name = "Oleg";
        float age = 28.05645646f;
        System.out.println("Hello! My name is " + name + "! I'm " + age);

        String text = String.format("Hello! My name is %s! I'm %.8f", name, age);
        System.out.println(text);

        System.out.printf("Hello! My name is %s! I'm %s\n", name, age);
        System.out.printf("Hello! My name is %s! I'm %s%n", name, age);
    }
}
