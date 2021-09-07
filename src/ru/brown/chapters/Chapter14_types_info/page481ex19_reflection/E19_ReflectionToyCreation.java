package ru.brown.chapters.Chapter14_types_info.page481ex19_reflection;

import ru.brown.chapters.Chapter14_types_info.page457_class_demo.Toy;

import java.lang.reflect.Constructor;

public class E19_ReflectionToyCreation {
    public static Toy makeToy(String toyName, int IQ) {
        try {
            Class<?> tClass = Class.forName(toyName);
            for (Constructor<?> ctor : tClass.getConstructors()) {
                // Look for a constructor with a single parameter:
                Class<?>[] params = ctor.getParameterTypes();
                if (params.length == 1)
                    if (params[0] == int.class)
                        return (Toy) ctor.newInstance(
                                new Object[]{Integer.valueOf(IQ)});
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        return null;
    }

    public static void main(String args[]) {
        System.out.println(makeToy("ru.brown.chapters.Chapter14_types_info.page481ex19_reflection.SuperToy", 150));
    }
}