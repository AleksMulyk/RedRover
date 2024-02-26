package main.hw.hw6;
/*
Задача №1

Дана строка:
String s = “Перестановочный алгоритм быстрого действия”;
необходимо вывести все буквы “о” из этой строки.
Для указанной строки ответ будет “ооооо” (или в столбик)

 */
public class Task1 {
    public static void main(String[] args) {
        String s = "Fast permutation algorithm";
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == 'o') {
                System.out.print(s.charAt(i));
            }
        }
    }
}
