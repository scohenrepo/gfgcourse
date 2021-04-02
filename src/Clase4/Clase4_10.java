package Clase4;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class Clase4_10 {
//anagrams
    static String a = "abca";
    static String b = "baab";
    public static void main(String[] args) {
        //UN ARREGLO DE FRECUENCIAS
        int[] freq = new int[26];

        for (int i = 0; i < a.length(); i++) {
            freq[a.charAt(i) -  'a']++;
            freq[b.charAt(i) -  'a']--;
        }

        for (int i = 0; i < a.length(); i++) {
            if (freq[i] != 0) {
                System.out.println("No es anagramaAAAAAAAAAAAAAAAAAAA");
            }
        }
        //DOS ARREGLO DE FRECUENCIAS


        int[] freqA = new int[26];
        int[] freqB = new int[26];

        for (int i = 0; i < a.length(); i++) {
            freqA[a.charAt(i) -  'a']++;
            freqB[b.charAt(i) -  'a']++;
        }
        for (int i = 0; i < a.length(); i++) {
           if (freqA[i] != freqB[i]) {
               System.out.println("No es anagrama");
           }
        }
//MAPAS
        Map<String, Integer> aMap = new HashMap<>();
        Map<String, Integer> bMap = new HashMap<>();

        if (a.length() != b.length()) {
            System.out.println("Nope");
        } else {
            for (int i = 0; i < a.length(); i++) {
                Integer num = aMap.get(String.valueOf(a.charAt(i)));
                aMap.put(String.valueOf(a.charAt(i)), num == null ? 1 : num + 1);
                num = bMap.get(String.valueOf(b.charAt(i)));
                bMap.put(String.valueOf(b.charAt(i)), num == null ? 1 : num + 1);
            }
        }

        for (Map.Entry ordered : aMap.entrySet()) {
            String n = (String) ordered.getKey();
            if ( aMap.get(n) != bMap.get(n)) {
                System.out.println("Not an anagram");
                break;
            }

        }


    }

}
