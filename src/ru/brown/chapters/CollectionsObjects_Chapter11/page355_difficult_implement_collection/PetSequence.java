package ru.brown.chapters.CollectionsObjects_Chapter11.page355_difficult_implement_collection;

import ru.brown.chapters.CollectionsObjects_Chapter11.page333.*;

import java.util.Iterator;

public class PetSequence {
    protected Pet[] pets = {new Rat(),
            new Manx(),
            new Cymric(),
            new Mutt(),
            new Pug(),
            new Cymric(),
            new Pug()
    };
}

class NonCollectionSequence extends PetSequence {
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
                //Not implemented
                throw new UnsupportedOperationException();

            }
        };
    }
}
