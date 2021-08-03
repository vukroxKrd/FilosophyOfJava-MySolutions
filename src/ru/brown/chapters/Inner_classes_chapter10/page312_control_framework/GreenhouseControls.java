package ru.brown.chapters.Inner_classes_chapter10.page312_control_framework;

import java.util.concurrent.ThreadLocalRandom;

public class GreenhouseControls extends Controller {

    //принадлежит внешнему классу GreenhouseControls
    private boolean light = false;

    //LIGHT field control classes
    //inner class
    public class LightOn extends Event {
        public LightOn(long delayTime) {
            super(delayTime);
        }

        public void action() {
            // Поместите сюда код управления оборудованием,
            // выполняющий непосредственное включение света,
            light = true;
        }

        public String toString() {
            return "Свет включен";
        }
    }

    // inner class
    public class LightOff extends Event {
        public LightOff(long delayTime) {
            super(delayTime);
        }

        public void action() {
            // Поместите сюда код управления оборудованием,
            // выполняющий выключение света,
            light = false;
        }

        public String toString() {
            return "Свет выключен";
        }
    }

    //принадлежит внешнему классу GreenhouseControls
    private boolean water = false;

    //WATER field control classes
    //inner class
    public class WaterOn extends Event {

        public WaterOn(long delayTime) {
            super(delayTime);
        }

        public void action() {
            // Здесь размещается код управления оборудованием,
            water = true;
        }

        public String toString() {
            return "Полив включен";
        }
    }

    public class WaterOff extends Event {
        public WaterOff(long delayTime) {
            super(delayTime);
        }

        public void action() {
            // Здесь размещается код управления оборудованием,
            water = false;
        }

        public String toString() {
            return "Полив выключен";
        }
    }

    //принадлежит внешнему классу GreenhouseControls
    private String thermostat = "День";

    public class ThermostatNight extends Event {
        public ThermostatNight(long delayTime) {
            super(delayTime);
        }

        public void action() {
            // Здесь размещается код управления оборудованием,
            thermostat = "Ночь";
        }

        public String toString() {
            return "Термостат использует ночной режим";
        }
    }

    public class ThermostatDay extends Event {
        public ThermostatDay(long delayTime) {
            super(delayTime);
        }

        public void action() {
            // Здесь размещается код управления оборудованием,
            thermostat = "День";
        }

        public String toString() {
            return "Термостат использует дневной режим";
        }
    }

    //Task from the book:
    /* В программу GreenhouseControls.java добавьте внутренние классы для события Event, отключающие и включающие проветривание оранжереи.
    Настройте программу GreenhouseContraller.java на использование нового типа события.*/

    // Принадлежит внешнему классу
    private boolean ventilation = false;

    static abstract class Equipment {

        String mechanism;

        //Когда писал этот метод, то хотел переиспользовать его в наследниках, но когда я запускаю этот метод в GreenhouseController, в ссылке на объект вылетает null.
        //Я попытался решить эту проблему переопределив этот метод в наследнике, но это не решило моей проблемы... по прежнему null (в консоли: "null don't work")

        public void performTask(boolean needWork) {
            if (needWork == true) {
                System.out.println(mechanism + " work");
            } else {
                System.out.println(mechanism + " don't work");
            }
        }
    }

    public static final class Ventilator extends Equipment {

        private static Ventilator instance;
        public String mechanism;

        private Ventilator() {
            this.mechanism = "ventilator";
        }

        public static Ventilator getVentilator() {
            if (instance == null) {
                instance = new Ventilator();
            }
            return instance;
        }

        //Можно ли сделать так, чтобы использовать performTask из родителя?
        @Override
        public void performTask(boolean needWork) {
            if (needWork == true) {
                System.out.println(mechanism + " work");
            } else {
                System.out.println(mechanism + " don't work");
            }
        }
    }
    //что то не так с генератором случайных чисел, потому что в консоли вентилятор всегде не работает. Видимо этот способо не генерит отрицательные числа.
    public int temperature = ThreadLocalRandom.current().nextInt(-50, 60 + 1);

    public class VentilationOff extends Event {
        Ventilator ventilator = Ventilator.getVentilator();

        public VentilationOff(long delayTime) {
            super(delayTime);
        }

        @Override
        public void action() {
            //Как выполнить этот мето из статического контента?
            if (temperature <= 19) {
                ventilator.performTask(ventilation);
            } else {
                return;
            }
        }

        public String toString() {
            return "Отключаем проветривание!";
        }
    }

    public class VentilationOn extends Event {
        Ventilator ventilator = Ventilator.getVentilator();

        public VentilationOn(long delayTime) {
            super(delayTime);
        }

        @Override
        public void action() {
            if (temperature >= 20) {
                ventilator.performTask(true);
            } else {
                return;
            }
            //Как выполнить этот мето из статического контента?
        }

        public String toString() {

            return "Проветриваем";
        }
    }

    // Пример метода action(), вставляющего новый экземпляр
    // самого себя в список событий:
    public class Bell extends Event {
        public Bell(long delayTime) {
            super(delayTime);
        }

        public void action() {
            addEvent(new Bell(delayTime));
        }

        public String toString() {
            return "Бам!";
        }
    }

    public class Restart extends Event {
        private Event[] eventList;

        public Restart(long delayTime, Event[] eventList) {
            super(delayTime);
            this.eventList = eventList;
            for (Event e : eventList)
                addEvent(e);
        }

        public void action() {
            for (Event e : eventList) {
                e.start(); // Перезапуск каждого события
                addEvent(e);
            }
            start(); // Перезапуск текущего события
            addEvent(this);
        }

        public String toString() {
            return "Перезапуск системы";
        }
    }

    public static class Terminate extends Event {
        public Terminate(long delayTime) {
            super(delayTime);
        }

        public void action() {
            System.exit(0);
        }

        public String toString() {
            return "Отключение";
        }
    }
}


