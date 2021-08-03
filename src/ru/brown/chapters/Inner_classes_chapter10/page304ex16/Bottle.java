package ru.brown.chapters.Inner_classes_chapter10.page304ex16;


public class Bottle {

    protected static class Water implements Fluid {
        private int time = 10;
        private int distance = 1000;

        public int getTime() {
            return time;
        }

        public int getDistance() {
            return distance;
        }

        public Water() {
        }

        public Water(int time, int distance) {
            this.time = time;
            this.distance = distance;
        }

        @Override
        public void flow() {
            System.out.println("Water speed: "+(time*distance));
        }
        public static Fluid contents(int time, int distance){
            return new Water(time, distance);
        }
    }
    public static void main(String[] args) {
        Water water1 = new Water();
        Fluid water = Water.contents(10,1000);
        water.flow();
    }
}
