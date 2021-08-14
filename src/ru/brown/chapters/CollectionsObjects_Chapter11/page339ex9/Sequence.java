package ru.brown.chapters.CollectionsObjects_Chapter11.page339ex9;

import org.apache.commons.lang3.ClassUtils;
import ru.brown.chapters.util.Print;

import java.util.*;

/*Задание в книге(стр.339):
"9. (4) Измените пример innerdasses/Sequence.java так, чтобы контейнер Sequence работал с Iterator вместо Selector."*/
public class Sequence {

    PrimitiveTypeChecker typeChecker;
    private ArrayList<Object> items;
    private int next = 0;

    public Selector selector() {
        return new SequenceSelector();
    }

    public void test() { System.out.println("Sequence.test()"); }
    public Sequence(int size) {
        items = new ArrayList<>(size);
    }
    public void add(Object x) {
            items.add(x);
    }

    /*С основным заданием я справился тут, но мне интересно реализовать удаление через Итератор*/
    public void display(Iterator<Object> iterator){
        while (iterator.hasNext()){
            Object o = iterator.next();
            Print.print(o);
        }
    }
    /*Проблема с  этим методом - delete не удаляет элемент, как я того хочу*/
    public Collection remove(Collection<Object> collection, Object o){
        //Эта переменная - рудимент. Я патался возвращать true после удаления элемента.
        boolean result = false;
        Iterator<Object> iterator = collection.iterator();
        while (iterator.hasNext()){
            Object object = iterator.next();
            if (!ClassUtils.isPrimitiveWrapper(object.getClass())){
                if (object.equals(o)){
                    iterator.remove();
                    result = true;
                    break;
                }
            } else if (ClassUtils.isPrimitiveWrapper(object.getClass())){
                if (object == o){
                    iterator.remove();
                    result = true;
                    break;

                }
            }
        }
        return collection;
    }

    private class SequenceSelector implements Selector {

        private int i = 0;

        public Sequence getSequence(){
            return Sequence.this;
        }

        public SequenceSelector getNewSeqSelector(){
            Sequence sequence = getSequence();
            SequenceSelector selector = sequence.new SequenceSelector();
            return selector;
        }

        public boolean end() {
            return i == items.size();
        }
        public Object current() {
            return items.get(i);
        }
        public void next() {
            if (i < items.size()) i++;
        }
    }

    public static void main(String[] args) {
        Sequence sequence = new Sequence(10);
        sequence.add(new TextLine("Slava"));
        sequence.add(new TextLine("Liza"));

        /*Хочу написать метод, который бы принимал коллекцию, или итератор и объект для удаления и возвращал бы (в случае успешного удаления)
        * коллекцию элементов без удаленного элемента, или булево значение
        * проблема с методом delete.
        * Подключили библиотелку Common Utils 3, чтобы проверять примитив мой тип, или нет. Элементы в списке проходят проверку, но лишний не удаляется
        * В чем мой косяк, помогите разобраться, плз.*/
        sequence.display(sequence.items.iterator());
        List<Object> list = sequence.items;
        list = (List<Object>) sequence.remove(list, "Slava");
        Print.print("After delete");
        sequence.display(list.iterator());


        //        for (int i = 0; i < 10; i++)
//            sequence.add(Integer.toString(i));
//        Selector selector = sequence.selector();
//        while (!selector.end()) {
//            System.out.print(selector.current() + " ");
//            selector.next();
//        }
//        // cast and test:
//        ((SequenceSelector)selector).getSequence().test();
    }
}