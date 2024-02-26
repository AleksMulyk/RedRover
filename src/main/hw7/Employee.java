package main.hw7;

public class Employee {
    private String name;
    private int age;
    private String sex;
    private double salary;

    public Employee(String name, int age, String sex) {
        this.name = name;
        this.age = age;
        this.sex = sex;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public double getSalary() {
        return this.salary;
    }

    public boolean isSameName(Employee employee) {
            return name.equals(employee.name);
    }

    public static void main(String[] args) {
        Employee employee1 = new Employee("Alex", 38, "man");
        Employee employee2 = new Employee("Alex", 39, "man");
        System.out.println(employee1.isSameName(employee2));
        employee1.setSalary(1500);
        employee2.setSalary(2000);
        Employee[] employee = {employee1, employee2};
        System.out.println(Salary.getSum(employee));
    }



}
