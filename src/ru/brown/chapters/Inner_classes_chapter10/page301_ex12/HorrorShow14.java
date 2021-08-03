package ru.brown.chapters.inner_classes.page301_ex12;

import ru.brown.chapters.util.Print;

public class HorrorShow14 {
    static void u(Monster b) { b.menace(); }
    static void v(DangerousMonster d) {
        d.menace();
        d.destroy();
    }
    static void w(Lethal l) { l.kill(); }
    public DangerousMonster monsterMaker() {
        return new DangerousMonster() {
            public void menace() {
                Print.print("DangerousMonster Menace"); }
            public void destroy() { Print.print("DangerousMonster Destroy"); }
        };
    }
    public Vampire vampireMaker() {
        return new Vampire() {
            public void menace() { Print.print("Vampire Menace"); }
            public void destroy() { Print.print("Vampire Destroy"); }
            public void kill() { Print.print("Vampire Kill"); }
            public void drinkBlood() { Print.print("Vampire DrinkBlood"); }
        };
    }
    public static void main(String[] args) {
        HorrorShow14 show = new HorrorShow14();
        show.u(show.monsterMaker());
        show.v(show.monsterMaker());
        show.u(show.vampireMaker());
        show.v(show.vampireMaker());
        show.w(show.vampireMaker());
    }
}