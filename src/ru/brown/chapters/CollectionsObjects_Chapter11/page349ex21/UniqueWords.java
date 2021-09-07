package ru.brown.chapters.CollectionsObjects_Chapter11.page349ex21;

/*21. Используя контейнер Map<string,Integer>, создайте по образцу UniqueWords.java программу для подсчета вхождений слов в файле.
Отсортируйте результаты методом Collections.sort() со вторым аргументом String.CASE_lNSENSlTlVE_ORDER (для получения алфавитной сортировки) и выведите результат.*/

import ru.brown.chapters.util.Print;

import java.util.*;

public class UniqueWords {
    public static void main(String[] args) {

        String text = "(CNN) — When British traveler Zoe Stephens flew into the South Pacific island nation of Tonga last March, she was only planning to stay for the weekend.\n" +
                "Originally from Crosby, Merseyside in the UK, the 27-year-old had been living in China for two and a half years, before taking some time out to travel around the Asia and onto Fiji.\n" +
                "Keen to escape talk of the virus, which had been dominating news reporting wherever she went, she booked a flight to Tonga, a Polynesian country made up of over 170 South Pacific islands.\n" +
                "However, nearly 18 months later, she's still stuck on the tiny archipelago, which happens to be one of the few places in the world that has remained entirely Covid-free.\n" +
                "\"I'm probably one of the few people in the world that has never had to wear a mask before,\" Stephens tells CNN Travel.\n" +
                "\"I haven't worn a mask during this whole pandemic. I think it's gonna be pretty weird to go into a world where so many people are wearing them.\"\n" +
                "During her time in Tonga, which has a population of just over 100,000, Stephens has begun a master's degree in international communications online and is currently living in a beach home while house sitting for a family who cannot return to the island due to travel restrictions." +
                "But while living on a remote island might sound like the ideal way to see out a global pandemic, and Stephens does feel \"lucky\" to be there, it seems the experience hasn't been quite as fabulous as it might sound.\n" +
                "\"There's not many people that can relate to being stuck on an island without your friends or your family, in a country that you didn't deliberately end up in,\" Stephens tells CNN Travel.\n" +
                "\"Or being locked out of the country that you live in, and then not being able to get back. And being scared to go back to your home country because of a weird virus that's going around. So it's pretty isolating.\"\n" +
                "She also points out that while Tonga has so far avoided any coronavirus cases, those who live here have still been hugely impacted by the virus.\n" +
                "\"We haven't had Covid here, but you still have the feel of it around,\" she explains. \"It's not like we're unaffected by everything.\"\n" +
                "Like many people around the world, Stephens was initially unfazed when she first heard about coronavirus back in early 2020.\n" +
                "But things took a turn when she left China to visit South Korea and confirmed cases began to increase in the country while she was away.\n" +
                "As the situation became more serious and borders closures were implemented, Stephens chose to continue traveling in order to avoid having to quarantine when she returned to China.\n" +
                "But she realized something was amiss almost immediately after flying into Tonga from Fiji, when her taxi driver told her that the South Pacific country had just reported its first Covid-19 cases.\n" +
                "\"I just thought it was a miscommunication,\" she says. \"But I got to the hostel and they were like, \"we don't want to take you, you've just come from Fiji.' So, it was pretty instant.\"\n" +
                "Stephens soon discovered that Tonga would be going into lockdown, and she would not be able to leave for a while.\n" +
                "\"It took about a week before flights stopped coming in completely,\" she says. \"We had a three-week lockdown, which was really, really intense. You could only leave your home once a week to go and get groceries and you had your car registration and name taken down.\n" +
                "\"Everything in the entire country was closed. Shops, restaurants, everything apart from the odd one or two shops.\"";

        String wordsNoSymbols = text.replaceAll("[,.;!?\"-()+']", "");
//        Print.print(wordsNoSymbols);
        String commaSeparatedWords = wordsNoSymbols.replaceAll("(\\w+)", "$1,");
        Print.print(commaSeparatedWords);

        Set<String> uniqueWords = new HashSet<String>(Arrays.asList(commaSeparatedWords.split(",")));
        List<String> wordsToCount = new ArrayList<String>(Arrays.asList(commaSeparatedWords.split(",")));

//        Map<String, Integer> wordsCounter = new HashMap();
        Map<String, Integer> wordsCounter = new TreeMap<>(String.CASE_INSENSITIVE_ORDER);

        for (String key : uniqueWords) {
            wordsCounter.put(key, 0);
        }
        for (String word : wordsToCount) {
            if (wordsCounter.keySet().contains(word)) {
                Integer value = wordsCounter.get(word);
                wordsCounter.put(word, ++value);
            }
        }
        Print.print(wordsCounter);
    }
}

