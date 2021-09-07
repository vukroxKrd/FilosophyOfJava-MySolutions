package ru.brown.chapters.Chapter14_types_info.page477ex14_constructor_factory;

class Belt extends Part {
}

class FanBelt extends Belt {
    public static class Factori implements Factory<FanBelt> {
        public FanBelt create() {
            return new FanBelt();
        }
    }
}

class GeneratorBelt extends Belt {
    public static class Factori implements Factory<GeneratorBelt> {
        public GeneratorBelt create() {
            return new GeneratorBelt();
        }
    }

}

class PowerSteeringBelt extends Belt {
    public static class Factori implements Factory<PowerSteeringBelt> {
        public PowerSteeringBelt create() {
            return new PowerSteeringBelt();
        }
    }
}
