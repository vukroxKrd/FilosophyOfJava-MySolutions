package ru.brown.chapters.CollectionsObjects_Chapter11.page330_array_asList;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class AsListInference {
    public static void main(String[] args) {
        List<Snow> snow1 = Arrays.asList(new Crusty(), new Slush(), new Powder());

        // Не откомпилируется:
        // Компилятор сообщает:
        // получено : java.util.List<Powder>
        // требуется : java.util.List<Snow>
        List<Snow> snow2 = Arrays.asList(new Light(), new Heavy());

        // У Collections.addAll() проблем нет:
        List<Snow> snow3 = new ArrayList<Snow>();
        Collections.addAll(snow3, new Light(), new Heavy());

        // Подсказка с явно указанным аргументом типа:
        List<Snow> snow4 = Arrays.<Snow>asList(new Light(), new Heavy());
    }
}
