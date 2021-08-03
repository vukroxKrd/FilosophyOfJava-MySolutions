//package ru.brown.chapters.Polymorphism.page254;
//
//public class ReferenceCounting {
//
//    public static void main(String[] args) {
//
//        Shared shared = new Shared();
//
//        Composing[] composing = {new Composing(shared),
//                new Composing(shared), new Composing(shared),
//                new Composing(shared), new Composing(shared)};
//        for (Composing c : composing)
//            c.dispose();
//
//        Composing compTest = new Composing(shared);
//        Composing compTest2 = new Composing(shared);
//        // Test finalize():
//        shared.finalize();
//        Shared sharedTest = new Shared();
//        Composing compTest3 = new Composing(sharedTest);
//        // Test sharedTest finalize():
//        sharedTest.finalize();
//    }
//}
