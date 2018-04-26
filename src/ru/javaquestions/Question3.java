package ru.javaquestions;

/**
 * Data types
 */
public class Question3 {
    public static void main(String[] args) {
        short x = 10;
        short y = 3;

//        short z = x * y; //Почему не скомпиллируется?
        x *= y; //Почему скомпиллируется?
    }
}
