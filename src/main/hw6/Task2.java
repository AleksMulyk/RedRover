package main.hw6;
/*
Задача №2

Дана строка:
String s = “Перевыборы выбранного президента”;
необходимо подсчитать количество букв “е” в строке.
Для указанной строки ответ будет 4.

 */
public class Task2 {
    public static void main(String[] args) {
        int counter = 0;
        String s = "Перевыборы выбранного президента";
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == 'е') {
                counter++;
            }
        }
        System.out.println(counter);
    }
}
