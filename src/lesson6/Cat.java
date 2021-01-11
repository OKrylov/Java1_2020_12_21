package lesson6;

public final class Cat extends Animal {

    public Cat(String name, int age, String color) {
        super(name, age, color);
    }

//    @Override
//    public void test() {
//        System.out.println("cat test");
//    }

    @Override
    public void voice() {
        System.out.println("Mяу!");
    }

    @Override
    public void jump() {
        System.out.println("Cat has jumped!");
    }

    @Override
    public String toString() {
        return "Cat{" +
                "color='" + color + '\'' +
                ", name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
