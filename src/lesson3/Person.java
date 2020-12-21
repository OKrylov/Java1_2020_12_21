package lesson3;

import java.util.Objects;

public class Person {

    public static void main(String[] args) {
        Person person1  = new Person("Oleg");
        Person person2  = new Person("Oleg");
//        System.out.println(person1);
        System.out.println(person1 == person2);
        System.out.println(person1.equals(person2));
    }

    private String name;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return Objects.equals(name, person.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }

    public Person(String name) {
        this.name = name;
    }

}
