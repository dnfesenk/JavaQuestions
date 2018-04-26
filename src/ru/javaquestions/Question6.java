package ru.javaquestions;

/**
 * Приоритет перегрузок
 */
public class Question6 {
    public static void main(String[] args) {
        int i = 1;
//        test(i); //Что выведет в консоль?
    }

    private static void test(Integer i) {
        System.out.println("Integer " + i);
    }

    private static void test(double v) {
        System.out.println("double " + v);
    }
}
