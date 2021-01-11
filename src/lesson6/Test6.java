package lesson6;

public class Test6 {

    public static void main(String[] args) {
        Animal cat = new Cat("Barsik", 1, "Black");
        Animal dog = new Dog("Rex", 4, "White");
//        Animal animal = new Animal("animal", 500, "grey");
//        Dog animal = new Animal("animal", 500, "grey");
        Animal dog1 = new Dog("Rex", 4, "White");


        Animal animalCat = cat;
//        cat = dog;
//        String str = (String) 5;

        System.out.println(cat);
        System.out.println(dog);
//        System.out.println(animal);

        saySmth(cat);
        saySmth(dog);
//        saySmth(animal);
//
//        Animal.test();
//        Animal.test();

        cat.jump();
        dog.jump();
    }

    private static void saySmth(Animal animal) {
        animal.voice();
    }
}
