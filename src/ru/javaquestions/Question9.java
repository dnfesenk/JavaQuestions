package ru.javaquestions;

/**
 *  Integer pool
 *  Что выведет в консоль?
 */
public class Question9 {
    public static void main(String[] args) {
        Integer i1 = 10;
        Integer i2 = 10;
        System.out.println(i1 == i2);

        Integer i3 = 127;
        Integer i4 = 127;
        System.out.println(i3 == i4);
    }
}

