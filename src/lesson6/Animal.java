package lesson6;

public abstract class Animal {

    protected final String name;
    protected final int age;
    protected final String color;

    public Animal(String name, int age, String color) {
        this.name = name;
        this.age = age;
        this.color = color;
    }
//
//    public static void test() {
//        System.out.println("animal test");
//    }
    public final void test() {
        System.out.println("animal test");
    }

//    public Animal() {
//    }
    public abstract void voice();
    public abstract void jump();

    @Override
    public String toString() {
        return "Animal{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", color='" + color + '\'' +
                '}';
    }
}
