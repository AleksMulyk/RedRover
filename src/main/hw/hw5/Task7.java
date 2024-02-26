package main.hw.hw5;

public class Task7 {
    public static void main(String[] args) {
        int[][] array = {{1, 2, 3, 4, 5},
                {6, 7, 8, 9},
                {-1, -2, -3, -4},
                {-5, -6}};
        int amount = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                amount++;
            }
        }
        System.out.println(amount);
    }
}
