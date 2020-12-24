package lesson5;

public class Cat {

    public static String type = "Персидский";

    public static final String DEFAULT_NAME = "БАрсик";

    public static void testStatic() {
        System.out.println(type);
    }

    public String name;
    public String color;
    public int age;

    public Cat(String name, String color, int age) {
        this.name = name;
        this.color = color;
        this.age = age;
    }

//    public Cat(String _name, int _age, String _color) {
//        name = _name;
//        color = _color;
//        age = _age;
//    }

    public Cat(String name, String color) {
        this(name, color, 4);
    }

    public Cat() {
        this("Barsik", "White", 4);
    }

    public void meow() {
        System.out.println(this.name + " said 'Meow!'");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
