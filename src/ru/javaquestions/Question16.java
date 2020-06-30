package ru.javaquestions;

import java.util.Arrays;
import java.util.Deque;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

/**
 * Реализация метода sumLast10 (суммирование последних 10
 * элементов в итераторе)
 */
public class Question16 {

    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11);
        System.out.println(sumLast10(list.iterator()));
    }

    private static Integer sumLast10(Iterator<Integer> iterator) {
        Deque<Integer> deque = new LinkedList<>();
        while (iterator.hasNext()) {
            deque.addLast(iterator.next());
            if (deque.size() > 10) deque.removeFirst();
        }
        return deque.stream().mapToInt(Integer::intValue).sum();
    }
}
