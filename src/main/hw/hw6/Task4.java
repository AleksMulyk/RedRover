package main.hw.hw6;

/*
Экстра задача

Дана строка:
String s = “Посмотрите как Рите нравится ритм”;
необходимо вывести индексы начала всех подстрок - “рит”, независимо от регистра.
Для указанной строки ответ будет 6, 15, 29.
*/

public class Task4 {
    public static void main(String[] args) {
        String s = "Посмотрите как Рите нравится ритм";
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == 'р'  && s.charAt(i + 1) == 'и' && s.charAt(i + 2) == 'т') {
                System.out.print(i + " ");
            }
            if (s.charAt(i) == 'Р'  && s.charAt(i + 1) == 'и' && s.charAt(i + 2) == 'т') {
                System.out.print(i + " ");
            }
            if (s.charAt(i) == 'р'  && s.charAt(i + 1) == 'И' && s.charAt(i + 2) == 'т') {
                System.out.print(i + " ");
            }
            if (s.charAt(i) == 'р'  && s.charAt(i + 1) == 'и' && s.charAt(i + 2) == 'Т') {
                System.out.print(i + " ");
            }
            if (s.charAt(i) == 'Р'  && s.charAt(i + 1) == 'И' && s.charAt(i + 2) == 'т') {
                System.out.print(i + " ");
            }
            if (s.charAt(i) == 'Р'  && s.charAt(i + 1) == 'и' && s.charAt(i + 2) == 'Т') {
                System.out.print(i + " ");
            }
            if (s.charAt(i) == 'р'  && s.charAt(i + 1) == 'И' && s.charAt(i + 2) == 'Т') {
                System.out.print(i + " ");
            }
            if (s.charAt(i) == 'Р'  && s.charAt(i + 1) == 'И' && s.charAt(i + 2) == 'Т') {
                System.out.print(i + " ");
            }

        }
    }
}
