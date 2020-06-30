package ru.javaquestions;

/**
 * Что выведет программа, в каком
 * порядке происходит инициализация класса
 */
public class Question17 {
    public static void main(String[] args) {
        new Test();
    }
}

class SuperTest {
    static {
        System.out.println("1");
    }

    {
        System.out.println("2");
    }

    public SuperTest() {
        System.out.println("3");
    }
}

class Test extends SuperTest {
    static {
        System.out.println("4");
    }

    {
        System.out.println("5");
    }

    public Test() {
        System.out.println("6");
    }
}
