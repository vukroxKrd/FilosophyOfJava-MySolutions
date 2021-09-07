package ru.brown.chapters.CollectionsObjects_Chapter11.page349ex24;

import java.util.*;
import java.util.regex.Pattern;

public class E24_MapOrder2 {

    public static Map countryCapitalMap(String input) {
        Map<String, String> data = new HashMap<String, String>();
        Pattern p = Pattern.compile("[\\{\\}\\=\\, \\n]++");
        String[] split = p.split(input);
        for (int i = 0; i + 2 <= split.length; i += 2) {
            data.put(split[i], split[i + 1]);
        }
        return data;
    }

    public static void main(String[] args) {

        String input = "ALGERIA=Algiers, ANGOLA=Luanda, BENIN=Porto-Novo, \n" +
                "BOTSWANA=Gaberone, BURKINA FASO=Ouagadougou, \n" +
                "BURUNDI=Bujumbura, CAMEROON=Yaounde, CAPE VERDE=Praia, \n" +
                "CENTRAL AFRICAN REPUBLIC=Bangui, CHAD=N'djamena, \n" +
                "COMOROS=Moroni, CONGO=Brazzaville, DJIBOUTI=Dijibouti, \n" +
                "EGYPT=Cairo, EQUATORIAL GUINEA=Malabo, ERITREA=Asmara, \n" +
                "ETHIOPIA=Addis Ababa, GABON=Libreville, THE GAMBIA=Banjul, \n" +
                "GHANA=Accra, GUINEA=Conakry, BISSAU=Bissau, COTE D'IVOIR \n" +
                "(IVORY COAST)=Yamoussoukro, KENYA=Nairobi, LESOTHO=Maseru} \n" +
                "{ALGERIA=Algiers, ANGOLA=Luanda, BENIN=Porto-Novo, \n" +
                "BISSAU=Bissau, BOTSWANA=Gaberone, BURKINA FASO=Ouagadougou, \n" +
                "BURUNDI=Bujumbura, CAMEROON=Yaounde, CAPE VERDE=Praia, \n" +
                "CENTRAL AFRICAN REPUBLIC=Bangui, CHAD=N'djamena, \n" +
                "COMOROS=Moroni, CONGO=Brazzaville, COTE D'IVOIR (IVORY \n" +
                "COAST)=Yamoussoukro, DJIBOUTI=Dijibouti, EGYPT=Cairo, \n" +
                "EQUATORIAL GUINEA=Malabo, ERITREA=Asmara, ETHIOPIA=Addis \n" +
                "Ababa, GABON=Libreville, GHANA=Accra, GUINEA=Conakry, \n" +
                "KENYA=Nairobi, LESOTHO=Maseru, THE GAMBIA=Banjul";

        Map<String, String> countryAndCapital = E24_MapOrder2.countryCapitalMap(input);

        Map<String, String> m1 = new LinkedHashMap<String, String>(countryAndCapital);
        System.out.println(m1);
        String[] keys = m1.keySet().toArray(new String[0]);

        Arrays.sort(keys);

        Map<String, String> m2 = new LinkedHashMap<String, String>();
        for (String key : keys)
            m2.put(key, m1.get(key));
        System.out.println(m2);
    }
}