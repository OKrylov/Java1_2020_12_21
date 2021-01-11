package lesson5.test;

import lesson5.Cat;

public class TestCat {

    public static void main(String[] args) {
//        Cat cat1 = new Cat();
        Cat cat1 = new Cat("Barsik", "White");
//        cat1.name = "Barsik";
//        cat1.color = "White";
//        cat1.age = 4;

        Cat cat2 = new Cat("Markiz", "black", 7);
        cat2.meow();

        printInfo(cat1);
        printInfo(cat2);

        System.out.println(Cat.type);
        Cat.testStatic();
    }

    private static void printInfo(Cat cat) {
        System.out.printf("Cat '%s'; color: %s; age: %d%n",
                cat.getName(), cat.getColor(), cat.getAge());
    }

}
