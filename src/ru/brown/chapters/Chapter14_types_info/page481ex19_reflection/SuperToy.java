package ru.brown.chapters.Chapter14_types_info.page481ex19_reflection;

import ru.brown.chapters.Chapter14_types_info.page457_class_demo.FancyToy;

class SuperToy extends FancyToy {
    int IQ;
    public SuperToy(int intelligence) {
        super();
        IQ = intelligence; }
    public String toString() {
        return "I'm a SuperToy. I'm smarter than you.";
    }
}