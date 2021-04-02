package Clase3;

import java.util.HashSet;
import java.util.Set;

public class Clase3_5 {
    //sum of the prefixes of an array
    static int[] arr = {3,51,6,642,62};
    public static void main(String[] args) {
        int[] sums = new int[arr.length];
        sums[0] = arr[0];
        System.out.println(sums[0]);
        for (int i = 1; i < arr.length; i++) {
            sums[i] = sums[i-1] + arr[i];
            System.out.println(sums[i]);
        }

       /* int previous = 0;
        for (int i = 0; i < arr.length; i++) {
            previous = previous + arr[i];
            System.out.println(sums[i]);
        }*/
    }


}
