package ru.brown.chapters.CollectionsObjects_Chapter11.page349ex17;

import ru.brown.chapters.util.Print;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/*Возьмите класс Gerbil из упражнения 1 и поместите его в контейнер Мар. Используйте объект String,
содержащий имя каждого объекта Getbil, в качестве ключа для связывания с объектом Gerbil (значение), помещаемым в таблицу.
Получите Iterator для keySet() и используйте его для перемещения по Map, с выборкой объекта Gerbil для каждого ключа,
выводом ключа и вызовом метода hop().*/
public class Test {
    public static void main(String[] args) {
        Map<String,Gerbil> gerbils = new HashMap();
            gerbils.put("Solo",new Gerbil.Builder(1,"Solo").build());
            gerbils.put("Robo",new Gerbil.Builder(2,"Robo").size(Size.SMALL).build());
            gerbils.put("Bobo",new Gerbil.Builder(3,"Bobo").size(Size.LARGE).build());
            gerbils.put("Frodo",new Gerbil.Builder(4,"Frodo").size(Size.SMALL).build());

        Iterator<String> iterator = gerbils.keySet().iterator();
        while (iterator.hasNext()){
            Gerbil gerbil = gerbils.get(iterator.next());
            Print.print(gerbil);
            gerbil.hop();
        }

    }
}
