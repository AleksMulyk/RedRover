import hw.hw7.Employee;
import hw.hw7.Person;
import hw.hw7.Salary;
import hw.hw9.LicensePlate;
import hw.hw9.LicensePlateMaker;
import hw.hw9.Manager;
import hw.hw9.MonthUtils;
import lessons.lesson9.BankAccount;
import lessons.lesson9.Date;

public class Main {
    public static void main(String[] args) {
        Person peter = new Person("Peter Kravech", 47, 'm');
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
        System.out.println(employee1.getSalary(MonthUtils.summerMonth));
        System.out.println(employee2.getSalary(MonthUtils.summerMonth));
        System.out.println("=========================================");
        Manager manager1 = new Manager("Jhon Valdich", 41, 'm', 150.0, 5);
        System.out.println(manager1.getSalary(MonthUtils.summerMonth));
        System.out.println("=========================================");
        BankAccount account1 = new BankAccount("1234564778-12456");
        System.out.println(account1.getBalance());
        account1.credit(1000);
        System.out.println(account1.getBalance());
        account1.debit(100);
        System.out.println(account1.getBalance());
        account1.debit(1000);
        System.out.println(account1.getBalance());
        System.out.println("=========================================");
        Date olddate = new Date(20, 2, 2024);
        Date date = olddate.plusDays(2);
        System.out.print(date.getDay());
        System.out.print("-");
        System.out.print(date.getMonth());
        System.out.print("-");
        System.out.print(date.getYear());
        System.out.println("=========================================");
        LicensePlateMaker nyMaker = new LicensePlateMaker("NY", 1000);
        LicensePlate plate1 = nyMaker.makeNextPlate();
        System.out.println(plate1.getPlate());
    }
}