package ru.brown.chapters.Chapter14_types_info.page477ex14_constructor_factory;

public class E14_RegisteredFactories2 {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++)
            System.out.println(Part2.createRandom());
    }
}
