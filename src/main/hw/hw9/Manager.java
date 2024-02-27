package main.hw.hw9;

public class Manager {
    private String name;
    private int age;
    private char sex;
    private double salaryPerDay;
    private int subordinates;

    public Manager(String name, int age, char sex, double salaryPerDay, int subordinates) {
        this.name = name;
        this.age = age;
        this.sex = sex;
        this.salaryPerDay = salaryPerDay;
        this.subordinates = subordinates;
    }

    public double getSalary(Month[] monthsArray) {
        double sum = 0.0;
        for (int i = 0; i < monthsArray.length; i++) {
            sum += monthsArray[i].getDaysWorking() * salaryPerDay;
        }
        return sum * (1 + 0.01 * subordinates);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public char getSex() {
        return sex;
    }

    public void setSex(char sex) {
        this.sex = sex;
    }

    public double getSalaryPerDay() {
        return salaryPerDay;
    }

    public void setSalaryPerDay(double salaryPerDay) {
        this.salaryPerDay = salaryPerDay;
    }

    public int getSubordinates() {
        return subordinates;
    }

    public void setSubordinates(int subordinates) {
        this.subordinates = subordinates;
    }
}
