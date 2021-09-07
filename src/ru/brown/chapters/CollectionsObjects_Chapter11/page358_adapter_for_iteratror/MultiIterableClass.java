//package ru.brown.chapters.CollectionsObjects_Chapter11.page358_adapter_for_iteratror;
//
//import java.util.*;
//
//public class MultiIterableClass extends IterableClass {
//    public Iterable<String> reversed() {
//        return new Iterable<String>() {
//            public Iterator<String> iterator() {
//                return new Iterator<String>() {
//                    int current = words.length - 1;
//
//                    public boolean hasNext() {
//                        return current > -1;
//                    }
//
//                    public String next() {
//                        return words[current--];
//                    }
//
//                    public void remove() {
//                        //Нереализован
//                        throw new UnsupportedOperationException();
//                    }
//                };
//            }
//        };
//
//        public Iterable<String> randomized () {
//            return new Iterable<String>() {
//                public Iterator<String> iterator() {
//                    List<String> shuffled =
//                            new ArrayList<String>(Arrays.asList(words));
//                    Collections.shuffle(shuffled, new Random(47));
//                    return shuffled.iterator();
//                }
//            };
//        }
//    }
//
