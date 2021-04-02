package Clase3;

import java.util.HashSet;
import java.util.Set;

public class Clase3_8 {
    //subarray that sums 0
    static int[] arr = {0, 5,6,1,-12,8,7,-7};
    static int[] sums = new int[arr.length];
    public static void main(String[] args) {
        Set<Integer> mySet = new HashSet<>();

        sums[0] = arr[0];
        mySet.add(sums[0]);
        System.out.println(sums[0]);
        if(sums[0] == 0) {
            System.out.println("There is a subarray which elements sum zero");
        }
        for (int i = 1; i < arr.length; i++) {
            sums[i] += sums[i-1] + arr[i];
            if (mySet.contains(sums[i]) || sums[i] == 0) {
                System.out.println("There is a subarray which elements sum zero");
            }
            System.out.println(sums[i]);
            mySet.add(sums[i]);
        }

    }
}
