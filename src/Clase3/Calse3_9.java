package Clase3;

import java.util.HashSet;
import java.util.Set;

public class Calse3_9 {

    static int[] arr = {1,4,20,3,10,5};
    static int[] sums = new int[arr.length];
    public static void main(String[] args) {

        int k = 33;

        Set<Integer> mySet = new HashSet<>();

        sums[0] = arr[0];
        mySet.add(sums[0]);
        System.out.println(sums[0]);
        if(sums[0] == k) {
            System.out.println("There is a subarray which elements sum k = 33");
        }
        for (int i = 1; i < arr.length; i++) {
            sums[i] += sums[i-1] + arr[i];
            int res = sums[i] - k;
            if (mySet.contains(res) || sums[i] == k) {
                System.out.println("There is a subarray which elements sum k");
            }
            System.out.println(sums[i]);
            mySet.add(sums[i]);
        }

    }
}
