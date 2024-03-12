package main;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class EnoughIsEnough {
    public static void main(String[] args) {
        ArrayList<Integer> rsl = new ArrayList<>();
        int[] arr = {1, 2, 3, 3, 1, 4, 4, 4, 1, 4, 5, 3};
        int maxOccurrences = 2;
        int qtt = 0;
        for (int i = 0; i < arr.length; i++) {
            qtt = 0;
            for (int j = 0; j <= i; j++) {
                if (arr[j] == arr[i]) {
                    qtt += 1;
                }
            }
            if (qtt <= maxOccurrences) {
                rsl.add(arr[i]);
            }
            System.out.println(qtt);
        }
        int[] ret = new int[rsl.size()];
        for (int i = 0; i < rsl.size(); i++) {
            ret[i] = rsl.get(i);
        }
        System.out.println(Arrays.toString(ret));

    }
}