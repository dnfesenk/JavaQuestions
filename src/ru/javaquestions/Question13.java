package ru.javaquestions;

/**
 * StringBuilder length and capacity
 * Что выведет в консоль?
 * Вопрос со (*)
 */
public class Question13 {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
        System.out.println(sb.length());
        System.out.println(sb.capacity());
        sb.append("12345678901234567");
        System.out.println(sb.length());
        System.out.println(sb.capacity());
        sb.append("1234567890123456789");
        System.out.println(sb.length());
        System.out.println(sb.capacity());
    }
}
