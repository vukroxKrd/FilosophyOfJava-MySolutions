package ru.brown.chapters.Chapter14_types_info.page477ex14_constructor_factory;

class Filter extends Part {
}

class FuelFilter extends Filter {
    // Создание фабрики класса для каждого конкретного типа:
    public static class Factori implements Factory<FuelFilter> {
        public FuelFilter create() {
            return new FuelFilter();
        }
    }
}

class AirFilter extends Filter {
    public static class Factori implements Factory<AirFilter> {
        public AirFilter create() {
            return new AirFilter();
        }
    }
}

class CabinAirFilter extends Filter {
    public static class Factori implements Factory<CabinAirFilter> {
        public CabinAirFilter create() {
            return new CabinAirFilter();
        }
    }
}


class OilFilter extends Filter {
    public static class Factori implements Factory<OilFilter> {
        public OilFilter create() {
            return new OilFilter();
        }
    }
}

