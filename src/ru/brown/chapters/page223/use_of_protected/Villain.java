package ru.brown.chapters.page223.use_of_protected;

class Villain {
    private String name;

    protected void set(String nm) {
        name = nm;
    }

    public Villain(String name) {
        this.name = name;
    }

    public String toString() {
        return "Я объект Villain и мое имя " + name;
    }

}
