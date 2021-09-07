package ru.brown.chapters.Chapter14_types_info.page457_class_demo;

import static ru.brown.chapters.util.Print.print;

public class ToyTest {

    static void printInfo(Class cc) {
        print("Имя класса: " + cc.getName() + " является интерфейсом? [" + cc.isInterface() + "]");
        print("Пpocтoe имя: " + cc.getSimpleName());
        print("Kaноничecкoe имя : " + cc.getCanonicalName());
    }

    public static void main(String[] args) {
        Class c = null;
        try {
            c = Class.forName("ru.brown.chapters.Chapter14_types_info.page457_class_demo.FancyToy");
        } catch (ClassNotFoundException e) {
            print("He удается найти FancyToy");
            System.exit(1);
        }
        printInfo(c);
        for (Class face : c.getInterfaces()) {
            printInfo(face);
        }
    }
}

