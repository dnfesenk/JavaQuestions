package ru.javaquestions.utils;

import java.lang.reflect.Field;

/**
 * Created by dnfesenk
 * on 15.06.2017.
 */
public class SomeMagic {
    public static void mutate(String s) throws NoSuchFieldException, IllegalAccessException {
        final Field valueField = String.class.getDeclaredField("value");
        valueField.setAccessible(true);
        ((char[]) valueField.get(s))[0] = 'i';
        ((char[]) valueField.get(s))[10] = 's';
    }
}
