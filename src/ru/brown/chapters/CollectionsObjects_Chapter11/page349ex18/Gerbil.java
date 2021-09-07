package ru.brown.chapters.CollectionsObjects_Chapter11.page349ex18;

/*Возьмите класс Gerbil из упражнения 1 и поместите его в контейнер Мар. Используйте объект String,
содержащий имя каждого объекта Getbil, в качестве ключа для связывания с объектом Gerbil (значение), помещаемым в таблицу.
Получите Iterator для keySet() и используйте его для перемещения по Map, с выборкой объекта Gerbil для каждого ключа,
выводом ключа и вызовом метода hop().*/
public class Gerbil implements Comparable<Gerbil> {
    private int gerbilNumber;
    private String name;
    private Size size;

    @Override
    public int compareTo(Gerbil o) {
        return (int) (this.gerbilNumber - o.gerbilNumber);
    }

    public static class Builder {
        //Obigatory params
        private final int gerbilNumber;
        private final String name;
        //Optional param
        private Size size;

        public Builder(int gerbilNumber, String name) {
            this.gerbilNumber = gerbilNumber;
            this.name = name;
        }

        public Builder size(Size val) {
            size = val;
            return this;
        }

        public Gerbil build() {
            return new Gerbil(this);
        }
    }

    private Gerbil(Builder builder) {
        gerbilNumber = builder.gerbilNumber;
        name = builder.name;
        size = builder.size;
    }

    @Override
    public String toString() {
        if (this.size != null) {
            return "Gerbil{" +
                    "gerbilNumber=" + gerbilNumber +
                    ", name='" + name + ", size ='" + size + '\'' +
                    '}';

        } else
            return "Gerbil{" +
                    "gerbilNumber=" + gerbilNumber +
                    ", name='" + name + '\'' +
                    '}';
    }

    public void hop() {
        System.out.println("Gerbil number " + this.gerbilNumber + " hops");
    }
}
