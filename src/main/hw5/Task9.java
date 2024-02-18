package main.hw5;

public class Task9 {
    public static void main(String[] args) {
        int coloumn = 10;
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < coloumn; j++) {
                System.out.print(j);
            }
            System.out.println();
            coloumn--;
        }
    }
}
