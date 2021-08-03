package ru.brown.chapters.Polymorphism.page254;

public class Rodent14 {
    private static RandomRodentGenerator gen = new RandomRodentGenerator();

    public static void main(String[] args) {
        Rodent[] rodents = new Rodent[5];
        for (Rodent r : rodents) {
            r = gen.next();
            System.out.println(r);
        }
        gen.shared.showRefcount();
    }
}