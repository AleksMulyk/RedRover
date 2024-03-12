package main.hw.hw6;

/*
Задача №1

Необходимо написать 4 метода:
сложение 2х чисел
вычитание 2х чисел
умножение 2х чисел
деление 2х чисел

 */
public class Task5 {
    public static int addition(int x, int y) {
        int rsl = x + y;
        return rsl;
    }

    public static int subtraction(int x, int y) {
        int rsl = x - y;
        return rsl;
    }

    public static int multiplication(int x, int y) {
        int rsl = x * y;
        return rsl;
    }

    public static int division(int x, int y) {
        int rsl = x / y;
        return rsl;
    }

    public static void main(String[] args) {
        System.out.println(addition(6, 3));
        System.out.println(subtraction(6, 3));
        System.out.println(multiplication(6, 3));
        System.out.println(division(6, 3));
        division(3, 4);
    }
}
