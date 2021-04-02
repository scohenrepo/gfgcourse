package Clase4;

import java.util.HashMap;
import java.util.Map;

public class Clase4_11 {
//given 2 arrays make them anagrams
static String a = "abb";
    static String b = "baa";
    public static void main(String[] args) {
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
