package main.hw.hw7;

public class Person {
    private String name;
    private int age;
    private char sex;

    public Person(String name, int age, char sex) {
        this.name = name;
        this.age = age;
        this.sex = sex;
    }

    public String getName() {
        return switch (Character.toLowerCase(sex)) {
            case 'm' -> "Mr " + name;
            case 'w' -> "Mrs " + name;
            default -> name;
        };
    }
}
