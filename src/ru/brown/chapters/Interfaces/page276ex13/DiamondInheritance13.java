package ru.brown.chapters.Interfaces.page276ex13;

public class DiamondInheritance13 {
    public static void main(String[] args) {
        Doer d = new Doer();
        ((CanDoMore) d).doMore();
        ((CanDoFaster) d).doFaster();
        ((CanDo) d).doIt();
    }
}