package ru.brown.chapters.Chapter14_types_info.page457_class_demo;

import ru.brown.chapters.Chapter14_types_info.page457_class_demo.interfaces.CanDrive;
import ru.brown.chapters.Chapter14_types_info.page457_class_demo.interfaces.HasBatteries;
import ru.brown.chapters.Chapter14_types_info.page457_class_demo.interfaces.Shoots;
import ru.brown.chapters.Chapter14_types_info.page457_class_demo.interfaces.Waterproof;

public class FancyToy extends Toy implements HasBatteries, Waterproof, Shoots, CanDrive {
    public FancyToy() {
        super(1);
    }
}