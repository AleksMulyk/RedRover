package hw.hw3;

public class Task3 {
    public static void main(String[] args) {
        int a = 40;
        if (a > 10) {
            System.out.println(a + " is more than 10");
        }
        if (a < 100) {
            System.out.println(a + " is less than 100");
        }
        if (a / 2 > 20) {
            System.out.println("The result of division by 2 is more than 20");
        }
        if (a >= 5 && a <= 40) {
            System.out.println("The value is between 5 and 40 inclusive");
        } else {
            System.out.println("The value is less than 5 and more than 40");
        }
    }
}
