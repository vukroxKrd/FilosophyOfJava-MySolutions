package ru.brown.chapters.Chapter13_Strings.page422_format_method;

public class SimpleFormat {
    public static void main(String[] args) {
        int x = 5;
        double у = 5.332542;
        // Старый способ:
        System.out.println("Row 1: [" + x + " " + у + "]");
        // Новый способ:
        System.out.format("Row 1: [%d and %f]\n", x, у);
        // или
        System.out.printf("Row 1: [%d and %f]\n", x, у);
    }
}