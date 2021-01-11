package lesson5.hw;

import java.util.Random;

public class Homework {

    private static final int EMPLOYEE_COUNT = 5;
    private static final int MIN_AGE = 40;

    private static Random ageRandomize = new Random();


    public static void main(String[] args) {
        Employee[] employees = new Employee[EMPLOYEE_COUNT];
        for (int i = 0; i < EMPLOYEE_COUNT; i++) {
            employees[i] = createEmployee(i);
        }

        for (Employee employee : employees) {
            if (employee.getAge() > MIN_AGE) {
                employee.printInfo();
            }
        }

        intertnStringExample();
    }

    private static void intertnStringExample() {
        //        String str1 = new String("str");
//        String str2 = new String("str");
//        str1 = str1.intern();
//        str2 = str2.intern();
        String str1 = "str";
        String str2 = "str";
        System.out.println(str1 == str2);
        System.out.println(str1.equals(str2));
    }

    private static Employee createEmployee(int i) {
        return new Employee(
                "name" + i,
                "surname" + i,
                ageRandomize.nextInt(30) + 30,
                "test" + i + "@test.com",
                "+7920555778" + i,
                "Software Engineer",
                2000 + i * 100);
    }
}
