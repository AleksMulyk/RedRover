package main;

import main.hw.hw7.Employee;
import main.hw.hw7.Person;
import main.hw.hw7.Salary;

public class Main {
    public static void main(String[] args) {
        Person peter = new Person("Peter Kravech", 45, 'm');
        Person steven = new Person("Steven Rych", 38, 'm');
        System.out.println(peter.getName());
        Employee employee1 = new Employee("Peter Kravech", 45, 'm', 100);
        Employee employee2 = new Employee("Steven Rych", 38, 'm', 150);
        System.out.println(employee1.isSameName(employee2));
        Employee[] employees = {employee1, employee2};
        System.out.println(Salary.getSum(employees));

    }
}