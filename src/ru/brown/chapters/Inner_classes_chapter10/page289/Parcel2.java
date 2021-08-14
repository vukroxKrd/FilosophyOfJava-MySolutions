package ru.brown.chapters.Inner_classes_chapter10.page289;

public class Parcel2 {

    public Contents contents() {
        return new Contents();
    }
    public Destination to(String s) {
        return new Destination(s);
    }

    public void ship(String dest) {
        Contents с = contents();
        Destination d = to(dest);
        System.out.println(d.readLabel());
    }

    class Contents {

        private int i = 11;

        public int value() {
            return i;
        }
    }

    class Destination {

        private String label;

        Destination(String whereTo) {
            label = whereTo;
        }

        String readLabel() {
            return label;
        }
    }

    public static void main(String[] args) {
        Parcel2 p = new Parcel2();
        p.ship("Tansania");
        Parcel2 q = new Parcel2();
        // Определение ссылок на внутренние классы:
        Parcel2.Contents с = q.contents();
        Parcel2.Destination d = q.to("Borneo");
    }
}

