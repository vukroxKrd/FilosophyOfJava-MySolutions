package ru.brown.chapters.Inner_classes_chapter10.page294;

public class TestParcel {
    public static void main(String[] args) {
        Parcel4 p = new Parcel4();
        Contents c = p.contents();
        Destination d = p.destination("TaH3aHMH");
        // Обращение к закрытому классу невозможно:
        // Parcel4.PContents pc = p.new PContents();

        c.value();
    }
}