package ru.javaquestions;

import static ru.javaquestions.utils.SomeMagic.mutate;

/**
 * Что выведется в консоль?
 */
public class Question8 {
    public static void main(String[] args) throws NoSuchFieldException, IllegalAccessException {
        final String s = "Immutable String";
        System.out.println(s);
        mutate(s);
        System.out.println(s);
    }
}
