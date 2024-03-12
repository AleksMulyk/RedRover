package hw.codewars;

import java.util.Arrays;

/*
Complete the function that takes a non-negative integer n as input, and returns a list of all
the powers of 2 with the exponent ranging from 0 to n ( inclusive ).
 */

public class CodeWars1 {
    public static long[] powersOfTwo(int n) {
        long[] rsl = new long[n + 1];
        for (int i = 0; i < rsl.length; i++) {
            rsl[i] = (long) Math.pow(2, i);
        }
        return rsl;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(powersOfTwo(1)));
    }
}
