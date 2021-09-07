package ru.brown.chapters.Chapter14_types_info.page462;

import ru.brown.chapters.Chapter14_types_info.page457_class_demo.FancyToy;

public class GenericToyTest {
    public static void main(String[] args) throws Exception {

        Class<FancyToy> ftClass = FancyToy.class;
        // Создает точный тип:
        FancyToy fancyToy = ftClass.newInstance();

        Class<? super FancyToy> up = ftClass.getSuperclass();
        // Не компилируется:
        // Class<Toy> up2 = ftClass.getSuperclass();
        // Создает только Object:
        Object obj = up.newInstance();
    }
}