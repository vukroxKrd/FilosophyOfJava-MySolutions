package ru.brown.chapters.Chapter14_types_info.page477ex14_constructor_factory;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class Part {
    public String toString() {
        return getClass().getSimpleName();
    }

    static List<Factory<? extends Part>> partFactories = new ArrayList<Factory<? extends Part>>();

    static {
        // Для Collections.addAll() выдается предупреждение
        // "неконтролируемое создание обобщенного массива”
        partFactories.add(new FuelFilter.Factori());
        partFactories.add(new AirFilter.Factori());
        partFactories.add(new CabinAirFilter.Factori());
        partFactories.add(new OilFilter.Factori());
        partFactories.add(new FanBelt.Factori());
        partFactories.add(new PowerSteeringBelt.Factori());
        partFactories.add(new GeneratorBelt.Factori());
    }



    private static Random rand = new Random(47);

    public static Part createRandom() {
        int n = rand.nextInt(partFactories.size());
        return partFactories.get(n).create();
    }
}


