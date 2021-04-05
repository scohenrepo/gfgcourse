package Clase5;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class Clase5_1 {
    //convert from decimal to binary  number
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        int n = 6;

        while (n > 0) {
            list.add(n%2);  //agrego a la lista el resultado de n modulo 2
            System.out.println(list);
            n/=2;  // divido n entre dos
        }
        Collections.reverse(list);
        System.out.println(list);

    }
}
