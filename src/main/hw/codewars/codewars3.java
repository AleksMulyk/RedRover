package main.hw.codewars;

import java.util.ArrayList;

public class codewars3 {
    public static void main(String[] args) {
        Object[] arr = {"Hello", "Goodbye", "Hello Again" };
        ArrayList<String> rsl = new ArrayList<String>();
    /*if (arr.length == 0) {
            Object[] rsl = {};
            return rsl;
        } else if (arr.length == 1) {
            Object[] rsl = new Object[1];
            rsl[0] = arr[0];
            return rsl;
      }*/

        for (int i = 0; i < arr.length; i++) {
            if (i % 2 == 0) {
                rsl.add(arr[i].toString());
            }
        }
        System.out.println(rsl);
    }
}
