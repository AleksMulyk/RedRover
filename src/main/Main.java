package main;

import main.hw.hw7.Employee;
import main.hw.hw7.Person;
import main.hw.hw7.Salary;
import main.hw.hw9.Manager;
import main.hw.hw9.MonthUtils;

public class Main {
    public static void main(String[] args) {
        Person peter = new Person("Peter Kravech", 45, 'm');
        Person steven = new Person("Steven Rych", 38, 'm');
        System.out.println(peter.getName());
        System.out.println("=========================================");

        Employee employee1 = new Employee("Peter Kravech", 45, 'm', 35000, 100);
        Employee employee2 = new Employee("Steven Rych", 38, 'm', 45000, 150);
        System.out.println(employee1.isSameName(employee2));
        System.out.println("=========================================");

        Employee[] employees = {employee1, employee2};
        System.out.println(Salary.getSum(employees));
        System.out.println("=========================================");

        System.out.println(employee1.getSalary(MonthUtils.SUMMER_MONTHS));
        System.out.println(employee2.getSalary(MonthUtils.SUMMER_MONTHS));
        System.out.println("=========================================");

        Manager manager1 = new Manager("Jhon Valdich", 41, 'm', 150.0, 5);
        System.out.println(manager1.getSalary(MonthUtils.SUMMER_MONTHS));



    }
}