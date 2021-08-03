package ru.brown.chapters.Inner_classes_chapter10.page312_control_framework.patter_Command;

import ru.brown.chapters.Inner_classes_chapter10.page312_control_framework.Event;
import ru.brown.chapters.Inner_classes_chapter10.page312_control_framework.GreenhouseControls;

public class GreenhouseController {
    public static void main(String[] args) {
        GreenhouseControls gc = new GreenhouseControls();
        // Вместо жесткой фиксации параметров в коде
        // можно было бы считать информацию
        // из текстового файла:
        gc.addEvent(gc.new Bell(90000));
        Event[] eventList = {
                gc.new ThermostatNight(0),
                gc.new LightOn(20000),
                gc.new LightOff(40000),
                gc.new WaterOn(60000),
                gc.new WaterOff(80000),
                gc.new ThermostatDay(140000),
                gc.new VentilationOff(200),
                gc.new VentilationOn(3000)
        };
        gc.addEvent(gc.new Restart(200000, eventList));
        if (args.length == 1)
            gc.addEvent(
                    new GreenhouseControls.Terminate(
                            new Integer(args[0])));
        gc.run();
    }
}