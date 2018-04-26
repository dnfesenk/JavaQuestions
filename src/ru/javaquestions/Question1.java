package ru.javaquestions;

/**
 * "Реализация тернарного оператора"
 * Что выведется в консоль?
 */

public class Question1 {

    public static void main(String[] args) {
        int i = 1;
        System.out.println(i > 0 ? i : (double) i);
    }
}
