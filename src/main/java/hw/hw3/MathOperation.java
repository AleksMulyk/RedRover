package hw.hw3;

public class MathOperation {
    public static void main(String[] args) {
        int a = 10;
        int b = 7;
        System.out.println(a + b);
        System.out.println(a * b);
        System.out.println(a - b);
        System.out.println(a / b);
        System.out.println(1.0 * a % b);
        if (a % 2 == 0) {
            System.out.println(a + " is even number");
        } else {
            System.out.println(a + " is odd number");
        }
        if (b % 2 == 0) {
            System.out.println(b + " is even number");
        } else {
            System.out.println(b + " is odd number");
        }
    }
}
