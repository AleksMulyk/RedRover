package hw.hw7;

import hw.hw9.Month;

public class Employee {
    private String name;
    private int age;
    private char sex;
    private double salary;
    private double salaryPerDay;

    public Employee(String name, int age, char sex, double salary, double salaryPerDay) {
        this.name = name;
        this.age = age;
        this.sex = sex;
        this.salary = salary;
        this.salaryPerDay = salaryPerDay;
    }

    public boolean isSameName(Employee employee) {
        return (name.equals(employee));
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

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public double getSalaryPerDay() {
        return salaryPerDay;
    }

    public void setSalaryPerDay(double salaryPerDay) {
        this.salaryPerDay = salaryPerDay;
    }

    public double getSalary(Month[] monthArray) {
        double sum = 0.0;
        for (int i = 0; i < monthArray.length; i++) {
            sum += monthArray[i].getDaysWorking() * salaryPerDay;
        }
        return sum;
    }
}
