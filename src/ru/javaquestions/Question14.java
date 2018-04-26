package ru.javaquestions;

/**
 * Память
 */
public class Question14 {
    static class B {
        B b = new B();
    }

    public static void main(String[] args) {
        try {
            B b = new B();
        } catch (Error e) {
            long[] longs = new long[Integer.MAX_VALUE];
        }
    }
}
