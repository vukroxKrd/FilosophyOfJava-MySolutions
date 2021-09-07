package ru.brown.chapters.Chapter14_types_info.page464_cast_meth;

public class ClassCasts {
    public static void main(String[] args) {
        Building b = new House();
        Class<House> houseType = House.class;
        House h = houseType.cast(b);
        h = (House) b; // ... или так.
    }
}

class Building {
}

class House extends Building {
}
