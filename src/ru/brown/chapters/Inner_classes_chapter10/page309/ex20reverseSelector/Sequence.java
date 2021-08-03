package ru.brown.chapters.Inner_classes_chapter10.page309.ex20reverseSelector;

import java.util.Arrays;

public class Sequence {
    private Object[] item;
    private int next = 0;

    public Sequence(int size) {
        item = new Object[size];
    }

    public void add(Object object) {
        if (next < item.length) {
            item[next++] = object;
        }
    }

    public SequenceSelector sequenceSelector() {
        return new SequenceSelector();
    }

    public ReverseSelector reverseSelector() {
        return new ReverseSelector();
    }

    @Override
    public String toString() {
        return "Sequence{" +
                "item=" + Arrays.toString(item) +
                '}';
    }

    private class ReverseSelector implements Selector {
        private int cursor = item.length-1;

        @Override
        public void next() {
            if (cursor >= 0) {
                cursor--;
            }
        }

        @Override
        public Object current() {
            return item[cursor];
        }

        @Override
        public boolean end() {
            return cursor < 0;
        }

    }

    private class SequenceSelector implements Selector {
        private int cursor = 0;

        @Override
        public void next() {
            if (cursor < item.length) {
                cursor++;
            }
        }

        @Override
        public Object current() {
            return item[cursor];
        }

        @Override
        public boolean end() {
           /* if (next < item.length)
                return false;
            else return true;*/
            return cursor == item.length;
        }
    }
}
