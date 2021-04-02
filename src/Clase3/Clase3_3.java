package Clase3;

import java.util.HashSet;
import java.util.Set;

public class Clase3_3 {

    public static void main(String[] args) {
        int[] arr = {3,5,1,6,2,1,3};
        int k = 7;
        Set<Integer> mySet = new HashSet<>();

        for (int i = 0; i < arr.length; i++) {
            int a = k - arr[i];
            if (mySet.contains(a)) {
                System.out.println(arr[i] + " " + a);
                //break;
            }
            mySet.add(arr[i]);

        }
    }

}
