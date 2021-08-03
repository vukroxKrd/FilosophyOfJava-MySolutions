package ru.brown.chapters.inner_classes.page301_ex10;

public class Sobol {
    public Opposition opposition() {
        return new Opposition() {
            private String weapon = "Micro";
            public void useWeapon(String weapon){
                System.out.println(weapon);
            }
            @Override
            public void prepare() {
                useWeapon(this.weapon);
            }
        };
    }
}
