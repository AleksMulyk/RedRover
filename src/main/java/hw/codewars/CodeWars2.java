package hw.codewars;

import java.util.Arrays;
/*
Take an array and remove every second element from the array.
Always keep the first element and start removing with the next element.

Example:
["Keep", "Remove", "Keep", "Remove", "Keep", ...] --> ["Keep", "Keep", "Keep", ...]

None of the arrays will be empty, so you don't have to worry about that!
 */
public class CodeWars2 {
    public static void main(String[] args) {
        Object[] arr = new Object[] {0, 1, 5, 8};
        int count = 0;
        Object[] rsl = new Object[(arr.length / 2) + arr.length % 2];
        for (int i = 0; i < arr.length; i++) {
                if (i % 2 == 0) {
                    rsl[count++] = arr[i];
                }
        }
        System.out.println(Arrays.toString(rsl));
    }
}
