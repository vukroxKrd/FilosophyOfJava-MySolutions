package ru.brown.chapters.CollectionsObjects_Chapter11.page339ex11_iterator_method;

import ru.brown.chapters.util.Print;

import java.util.*;

public class Kindergarten {
    private List<Child> group;
    private Set<Child> group2;
    private Queue<Child> group3;

    public Collection<Child> createListGroup (Child...children) {
        return this.group = new ArrayList<>(Arrays.asList(children));
    }

    public Collection<Child> createSetGroup (Child...children) {
        return this.group2 = new HashSet<Child>(Arrays.asList(children));
    }

    public Collection<Child> createQueGroup (Child...children) {
        return this.group3 = new ArrayDeque(Arrays.asList(children));
    }

    public List<Child> getGroup() {
        return group;
    }

    public Set<Child> getGroup2() {
        return group2;
    }

    public Queue<Child> getGroup3() {
        return group3;
    }


    public static void main(String[] args) {
        Child child1 = new Child("Liza");
        Child child2 = new Child("Sonya");
        Child child3 = new Child("Sasha");
        Child child4 = new Child("Vasya");
        Child child5 = new Child("Vasya");
        Child child6 = new Child("Petya");
        Child child7 = new Child("Petya");
        Kindergarten kindergarten = new Kindergarten();
        ArrayList<Child> group1 = (ArrayList<Child>) kindergarten.createListGroup(child1,child2, child3, child4, child5,child6,child7);
        HashSet<Child> group2 = (HashSet<Child>) kindergarten.createSetGroup(child1,child2, child3, child4, child5,child6,child7);
        ArrayDeque<Child> group3 = (ArrayDeque<Child>) kindergarten.createQueGroup(child1,child2, child3, child4, child5,child6,child7);
        ItarMethod.printAny(group1);
        Print.print("SET group print");
        ItarMethod.printAny(group2);
        Print.print("QUE group print");
        ItarMethod.printAny(group3);

    }
}
