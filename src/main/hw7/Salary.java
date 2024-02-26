package main.hw7;

public class Salary {
    public static double getSum(Employee[] employeeArray) {
        double rsl = 0.0;
        for (int i = 0; i < employeeArray.length; i++) {
            rsl += employeeArray[i].getSalary();
        }
        return rsl;
    }

}
