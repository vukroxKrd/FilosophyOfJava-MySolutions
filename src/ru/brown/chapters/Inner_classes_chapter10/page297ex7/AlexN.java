package ru.brown.chapters.inner_classes.page297ex7;

public class AlexN {

    public Opposition protest() {

        class AggressiveProtester implements Opposition {
            private String weapon = "Molotov cocktail";
            private String[] arsenal;

            public void giveNewWeapon(String newWeapon) {
                if (newWeapon != null) {
                    this.weapon = newWeapon;
                }
                arsenal = new String[5];
                arsenal[0] = weapon;
            }

            public String getWeapon() {
                return this.weapon;
            }

            public void increaseArsenal() {
                int counter = 1;
                while (counter < arsenal.length) {
                    arsenal[counter] = getWeapon();
                    System.out.println("Мы здесь власть! " + counter + ": " + arsenal[counter]);
                    counter++;
                }
            }

            @Override
            public Opposition prepare() {
                AggressiveProtester tesak = new AggressiveProtester();
                tesak.giveNewWeapon("Knife");
                tesak.increaseArsenal();
                return tesak;
            }
        }
        return new AggressiveProtester();
    }

    public static void main(String[] args) {
        AlexN navalny = new AlexN();
        navalny.protest().prepare();
    }
}
