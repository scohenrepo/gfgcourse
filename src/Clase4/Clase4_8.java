package Clase4;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class Clase4_8 {

    static String unordered = "werew";

    public static void main(String[] args) {
        Map<String, Integer> map = new TreeMap<>();

        for (int i = 0; i < unordered.length(); i++) {
            Integer num = map.get(String.valueOf(unordered.charAt(i)));
            map.put(String.valueOf(unordered.charAt(i)), num == null ? 1 : num + 1);
        }
        System.out.println(map);
        System.out.println("***************************************************************************");
        for (Map.Entry ordered : map.entrySet()) {
            int n = (int) ordered.getValue();
            for (int i = 0; i < n; i++) {
                System.out.println(ordered.getKey());
            }

        }

    }


    //I can just use sort of List or Stream

}
