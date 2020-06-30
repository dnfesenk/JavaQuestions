/*
 * VTB Group. Do not reproduce without permission in writing.
 * Copyright (c) 2019 VTB Group. All rights reserved.
 */

package ru.javaquestions;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

/**
 * Управление сериализацией, что делают методы, как кастомизировать
 * сериализацию поля
 */
public class Question18 {
    public static void main(String[] args) {
        System.out.println(new Test());
    }

    static class Test implements Serializable {

        private void writeObject(ObjectOutputStream out) throws IOException {
            out.defaultWriteObject();
        }

        private void readObject(ObjectInputStream in) throws IOException, ClassNotFoundException {
            in.defaultReadObject();
        }
    }
}
