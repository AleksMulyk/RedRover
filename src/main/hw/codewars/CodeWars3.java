package main.hw.codewars;

import java.util.ArrayList;

public class CodeWars3 {
    public static void main(String[] args) {
        Object[] arr = {"Hello", "Goodbye", "Hello Again" };
        ArrayList<String> rsl = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            if (i % 2 == 0) {
                rsl.add(arr[i].toString());
            }
        }
        System.out.println(rsl);
    }
}
