package ru.brown.chapters.CollectionsObjects_Chapter11.page346ex16_vocals;

import ru.brown.chapters.util.Print;

import java.util.*;

import static ru.brown.chapters.util.Print.print;

public class VocalsCounter {

    public static void main(String[] args) {
        Set<Character> vocals = new HashSet<>();
//        String wordsNoQuotes = "A, B, C, Collections, D, E, F, G, H, HashSet, I, 3, K, L,\n" +
//                "M, N, Output, Print, Set, SetOperations, String, X, Y, Z, \n" +
//                "add, addAll, added, args, class, contains, containsAll, \n" +
//                "false, from, holding, import, in, java, main, mindview, \n" +
//                "net, new, print, public, remove, removeAll, removed, setl, \n" +
//                "set2, split, static, to, true, util, void";

        String wordsNoQuotes2 = "A statement issued by the Taliban on Sunday appealed for calm in the capital, Kabul, and offered assurances to its residents. It said its fighters were now closing in on the city, and wanted to seize control there \"peacefully.\" \n" +
                "\n" +
                "The statement, issued by spokesman Zabihullah Mujahid, said the group was \"assuring all the banks, businesses, money exchange shops that they will be safe and protected under the Taliban and nobody would touch or bother anyone in Kabul.\"\n" +
                "\n" +
                "\"All the wealthy people, the businessmen, they should be safe and protected. None of the Taliban are allowed to go to any houses or conduct searches on businesses and the Islamic Emirate gives them full protection and they should be safe and not worry,\" Zabihullah said.\n" +
                "Tensions are running high in the capital after key cities including Jalalabad and Mazar-i-Sharif fell to the militant group overnight. Video from the city in the last 24 hours show Afghans waiting en masse at ATMs as people tried to withdraw cash, while photos show long queues at the passport office where others are trying to get their documents in order.\n" +
                "\n" +
                "Zabihullah also said those who had fought against the Taliban had nothing to fear.";
        String words1 = wordsNoQuotes2.replaceAll("(\\w+)", "$1,");


        Set<String> words = new HashSet<String>(Arrays.asList(words1.split(",")));

        Collections.addAll(vocals, 'A', 'E', 'I', 'O', 'U', 'Y');
        HashMap<Character, Integer> vocalCounter = new HashMap();
        vocalCounter.put('A', 0);
        vocalCounter.put('E', 0);
        vocalCounter.put('I', 0);
        vocalCounter.put('O', 0);
        vocalCounter.put('U', 0);
        vocalCounter.put('a', 0);
        vocalCounter.put('e', 0);
        vocalCounter.put('i', 0);
        vocalCounter.put('o', 0);
        vocalCounter.put('u', 0);
        vocalCounter.put('y', 0);

        for (String word : words) {
            char[] chars = word.toCharArray();
            for (Character c : chars) {
                if (vocalCounter.keySet().contains(c)) {
                    Integer value = vocalCounter.get(c);
                    vocalCounter.put(c, ++value);
                }
            }
        }
        print(vocalCounter);
    }
}

