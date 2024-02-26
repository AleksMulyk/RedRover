package main.hw7;

public class Person {
    private String name;
    private int age;
    private String sex;

    public Person() {
    }
    public Person(String name, int age, String sex) {
        this.name = name;
        this.age = age;
        this.sex = sex;
    }

    public void setName(String name) {
        this.name = name;
    }
    public String getName() {
        String sex = "";
        if (this.sex == "man") {
            sex = "Mr";
        } else if (this.sex == "woman") {
            sex = "Mrs";
        }
        return sex + " " + this.name;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public int getAge() {
        return this.age;
    }
    public void setSex(String sex) {
        this.sex = sex;
    }
    public String getSex() {
        return this.sex;
    }

    public static void main(String[] args) {
        Person person1 = new Person("Alex", 38, "man");
        System.out.println(person1.getName());
    }

}
