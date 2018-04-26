package ru.javaquestions;

/**
 * "Переопределение методов"
 * Что выведется в консоль?.
 */

public class Question2 {
    public static void main(String[] args) {
        new Child();
    }
}

class Child extends Parent {
    private String test = "VarInit";

    Child() {
        System.out.println(test);
    }

    @Override
    void init() {
        System.out.println("init called");
        test = "Initialize";
    }
}

class Parent {

    Parent() {
        init();
    }

    void init() {
        System.out.println("test");
    }
}
