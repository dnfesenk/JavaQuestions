package ru.javaquestions;

/**
 * Что сделать, чтобы при раскомментировании
 * строки код скомпиллировался?
 */
public class Question10 {
    public static void main(String[] args) {
        Integer i = new Integer("1");
        System.out.println("i = " + i++);
        new Object() {
            void test() {
//                System.out.println(i);
            }
        }.test();
    }
}
