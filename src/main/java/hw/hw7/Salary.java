package hw.hw7;

public class Salary {

    public static double getSum(Employee[] employeeArray) {
        double sumSalary = 0;
        for (Employee employee : employeeArray) {
            sumSalary += employee.getSalary();
        }
        return sumSalary;
    }
}
