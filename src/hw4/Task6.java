package hw4;

import java.util.Arrays;

public class Task6 {
    public static void main(String[] args) {
        int[] array = {9, 2, 6, 4, 5, 12, 7, 8, 6};
        for (intds i = 0; i < array.length; i++) {
            array[i] *= 15;
        }
        System.out.println(Arrays.toString(array));
    }
}
