package Clase4;

import java.util.HashMap;
import java.util.Map;

public class Clase4_11 {
    //given 2 arrays make them anagrams
    static String a = "abcc";
    static String b = "ddab";
    public static void main(String[] args) {
        //UN ARREGLO DE FRECUENCIAS
        int[] freq = new int[26];
        int sum = 0;

        for (int i = 0; i < a.length(); i++) {
            freq[a.charAt(i) -  'a']++;
            freq[b.charAt(i) -  'a']--;
        }

        for (int i = 0; i < a.length(); i++) {
            if (freq[i] != 0) {
                sum = sum + Math.abs(freq[i]);

            }
        }
        System.out.println("Hay que agregar " + sum);
    }

}
