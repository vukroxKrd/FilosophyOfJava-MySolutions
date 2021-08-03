package ru.brown.chapters.Inner_classes_chapter10.page300_init_exemplar;



// Использование "инициализации экземпляра" для выполнения
// конструирования в анонимном внутреннем классе.
public class Parcel10 {
    public Destination
    destination(final String dest, final float price) {
        return new Destination() {
            private int cost;
            {
                cost = Math.round(price);
                if (cost > 100) System.out.println("Превышение бюджета!");
            }

            private String label = dest;
            public String readLabel() {
                return label;
            }
        };
    }

    public static void main(String[] args) {
        Parcel10 p = new Parcel10();
        Destination d = p.destination("TaH3aHHfl", 101.395F);
    }
}
