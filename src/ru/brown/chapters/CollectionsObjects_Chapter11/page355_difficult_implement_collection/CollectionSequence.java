package ru.brown.chapters.CollectionsObjects_Chapter11.page355_difficult_implement_collection;

import ru.brown.chapters.CollectionsObjects_Chapter11.page333.*;

import java.util.AbstractCollection;
import java.util.Iterator;

public class CollectionSequence extends AbstractCollection<Pet> {
    private Pet[] pets = {
            new Rat(),
            new Manx(),
            new Cymric(),
            new Mutt(),
            new Pug(),
            new Cymric(),
            new Pug()
    };

    public int size() {
        return pets.length;
    }

    public Iterator<Pet> iterator() {
        return new Iterator<Pet>() {
            private int index = 0;

            public boolean hasNext() {
                return index < pets.length;
            }

            public Pet next() {
                return pets[index++];
            }

            public void remove() {
                //Не реализован
                throw new UnsupportedOperationException();
            }
        };
    }

    public static void main(String[] args) {
        CollectionSequence c = new CollectionSequence();
        InterfaceVsIterator.display(c);
        InterfaceVsIterator.display(c.iterator());
    }
}
