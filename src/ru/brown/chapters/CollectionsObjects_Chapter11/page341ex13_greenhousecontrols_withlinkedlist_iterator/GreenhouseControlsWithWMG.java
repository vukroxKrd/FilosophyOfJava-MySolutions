package ru.brown.chapters.CollectionsObjects_Chapter11.page341ex13_greenhousecontrols_withlinkedlist_iterator;

public class GreenhouseControlsWithWMG extends GreenhouseControls {

    private boolean generator = false;

    public class WatermistGeneratorOn extends Event {
        public WatermistGeneratorOn(long delayTime) {
            super(delayTime);
        }

        public void action() {
            generator = true;
        }

        public String toString() {
            return "Water mist generator is on";
        }
    }

    public class WatermistGeneratorOff extends Event {
        public WatermistGeneratorOff(long delayTime) {
            super(delayTime);
        }

        public void action() {
            generator = false;
        }

        public String toString() {
            return "Water mist generator is off";
        }
    }
}


