package ru.brown.chapters.Polymorphism.page248.additional_example;

public class Hide extends Dad {
    String name = "Hide";

    public static void main(String[] args) {
        ru.brown.chapters.Polymorphism.page248.additional_example.Hide h = new ru.brown.chapters.Polymorphism.page248.additional_example.Hide();
        System.out.println(h.name);
        System.out.println(((Dad) h).name);
        System.out.println(((GrandPa) h).name);
    }
}
