package main.hw.hw6;

/*
Задача №3

Дан массив:
String[][] array = {{“Привет”, “всем”, “кто”}, {“изучает”, “язык”, “программирования”}, {“java”}};
необходимо подсчитать количество строк в массиве, которые не содержат буквы “е”.

 */

public class Task3 {
    public static void main(String[] args) {
        String[][] array = {{"Привет", "всем", "кто"}, {"изучает", "язык", "программирования"}, {"java"}};
        int counter = 0;
        int num = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                counter = 0;
                String s = array[i][j];
                for (int k = 0; k < s.length(); k++) {
                    if (s.charAt(k) == 'е') {
                        counter++;
                    }
                }
                if (counter == 0) {
                    num++;
                }
            }
        }
        System.out.println(num);
    }
}
