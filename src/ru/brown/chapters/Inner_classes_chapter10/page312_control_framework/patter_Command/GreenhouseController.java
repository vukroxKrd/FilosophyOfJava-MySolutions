package ru.brown.chapters.Inner_classes_chapter10.page312_control_framework.patter_Command;

import ru.brown.chapters.Inner_classes_chapter10.page312_control_framework.Event;
import ru.brown.chapters.Inner_classes_chapter10.page312_control_framework.GreenhouseControls;
import ru.brown.chapters.Inner_classes_chapter10.page312_control_framework.GreenhouseControlsWithWMG;


public class GreenhouseController {
    public static void main(String[] args) {
        GreenhouseControlsWithWMG gc =
                new GreenhouseControlsWithWMG();
        // Instead of hard-wiring, you could parse
        // configuration information from a text file here:
        gc.addEvent(gc.new Bell(900));
        Event[] eventList = {
//                gc.new ThermostatNight(0),
//                gc.new LightOn(200),
//                gc.new LightOff(400),
//                gc.new WaterOn(600),
//                gc.new WaterOff(800),
//                gc.new ThermostatDay(1400),
//                gc.new WatermistGeneratorOn(1600),
//                gc.new WatermistGeneratorOff(1800),
                gc.new VentilationOff(200),
                gc.new VentilationOn(3000)
        };
        gc.addEvent(gc.new Restart(2000, eventList));
        if (args.length == 1)
            gc.addEvent(new GreenhouseControlsWithWMG
                    .Terminate(new Integer(args[0])));
        gc.run();
    }
}