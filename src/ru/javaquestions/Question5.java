package ru.javaquestions;

/**
 * Многомерные массивы
 * Что выведет в консоль?
 */
public class Question5 {
    public static void main(String[] args) {
        int i = 4;
        int ia[][][] = new int[i][i = 3][i];
        System.out.println(ia.length + ", " + ia[0].length + ", " + ia[0][0].length);
    }
}
