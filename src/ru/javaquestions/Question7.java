package ru.javaquestions;


/**
 * String pool
 */
public class Question7 {
    public static void main(String[] args) throws NoSuchFieldException, IllegalAccessException {
        String hello = "Hello", lo = "lo";
        System.out.println(hello == "Hello");
        System.out.println(Other.hello == hello);
        System.out.println(ru.javaquestions.utils.Other.hello == hello);
        System.out.println(hello == ("Hel" + "lo"));
        System.out.println(hello == ("Hel" + lo));
        System.out.println(hello == ("Hel" + lo).intern());
    }
}

class Other {
    static String hello = "Hello";
}
