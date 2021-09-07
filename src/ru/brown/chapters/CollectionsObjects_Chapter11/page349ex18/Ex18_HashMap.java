package ru.brown.chapters.CollectionsObjects_Chapter11.page349ex18;

/*18. (3) Заполните контейнер HashMap парами «ключ-значение». Выведите результаты,
чтобы продемонстрировать упорядочение по хеш-коду. Извлеките пары, отсортируйте
по ключу и поместите результат в LinkedHashMap. Покажите, что элементы
хранятся в порядке вставки.*/

import ru.brown.chapters.util.Print;

import java.util.*;

public class Ex18_HashMap {
    public static void main(String[] args) {
        Map<String, Gerbil> gerbils = new HashMap();
        gerbils.put("Solo",new Gerbil.Builder(1,"Solo").build());
        gerbils.put("Robo",new Gerbil.Builder(2,"Robo").size(Size.SMALL).build());
        gerbils.put("Bobo",new Gerbil.Builder(3,"Bobo").size(Size.LARGE).build());
        gerbils.put("Frodo",new Gerbil.Builder(4,"Frodo").size(Size.SMALL).build());
        gerbils.put("Rodo",new Gerbil.Builder(5,"Rodo").size(Size.MEDIUM).build());
        gerbils.put("Doro",new Gerbil.Builder(6,"Doro").build());
        gerbils.put("Boro",new Gerbil.Builder(7,"Boro").build());
        gerbils.put("Robot",new Gerbil.Builder(8,"Robot").build());

        Print.print(gerbils);

        TreeMap<String,Gerbil> sortedGerbils = new TreeMap<>(gerbils);
//        Print.print(sortedGerbils);
        /*Извлеките пары, отсортируйте по ключу и поместите результат в LinkedHashMap. Покажите, что элементы хранятся в порядке вставки.*/
        String[] keys = gerbils.keySet().toArray(new String[0]);
        Arrays.sort(keys);
        Map<String, Gerbil> sortedInLinkedMapGerbils = new LinkedHashMap<>();
        Set<String> hashSet = new HashSet<>();
        Set<String> linkedHashSet = new LinkedHashSet<>();
        for (String key: keys){
            sortedInLinkedMapGerbils.put(key,gerbils.get(key));
            hashSet.add(key);
            linkedHashSet.add(key);
        }
//        Print.print(sortedGerbils);
        System.out.println("HashSet");
        Print.print(hashSet);
        System.out.println("LinkedHashSet");
        Print.print(linkedHashSet);

    }
}
