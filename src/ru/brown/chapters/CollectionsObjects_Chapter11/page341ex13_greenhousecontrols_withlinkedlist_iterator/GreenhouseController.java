package ru.brown.chapters.CollectionsObjects_Chapter11.page341ex13_greenhousecontrols_withlinkedlist_iterator;


import java.util.Arrays;
import java.util.LinkedList;

public class GreenhouseController {
    public static void main(String[] args) {
        GreenhouseControlsWithWMG gc =
                new GreenhouseControlsWithWMG();
        // Instead of hard-wiring, you could parse
        // configuration information from a text file here:
        gc.addEvent(gc.new Bell(900));
        LinkedList<Event> events = new LinkedList<>(Arrays.asList(
                gc.new ThermostatNight(0),
                gc.new LightOn(200),
                gc.new LightOff(400),
                gc.new WaterOn(600),
                gc.new WaterOff(800),
                gc.new ThermostatDay(1400),
                gc.new WatermistGeneratorOn(1600),
                gc.new WatermistGeneratorOff(1800),
                gc.new VentilationOff(200),
                gc.new VentilationOn(3000)));

//        Event[] eventList = {
//                gc.new ThermostatNight(0),
//                gc.new LightOn(200),
//                gc.new LightOff(400),
//                gc.new WaterOn(600),
//                gc.new WaterOff(800),
//                gc.new ThermostatDay(1400),
//                gc.new WatermistGeneratorOn(1600),
//                gc.new WatermistGeneratorOff(1800),
//                gc.new VentilationOff(200),
//                gc.new VentilationOn(3000)
//        };
        gc.addEvent(gc.new Restart(2000, events));
        if (args.length == 1)
            gc.addEvent(new GreenhouseControlsWithWMG
                    .Terminate(new Integer(args[0])));
        gc.run();
    }
}