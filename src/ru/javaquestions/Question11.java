package ru.javaquestions;

/**
 * Наследование от внутреннего класса
 * Что сделать, чтобы после снятия комментария
 * код скомпиллировался?
 */
class Question11 {
    class Claz1 {
        Claz1(int i) {
            System.out.println(i);
        }
    }
}

//class Claz2 extends Question11.Claz1 {
//    public Claz2(int i) {
//        super(i);
//    }
//}