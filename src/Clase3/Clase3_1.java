package Clase3;

import java.util.HashSet;
import java.util.Set;

public class Clase3_1 {
    //non duplicated elements in an array
    public static void main(String[] args) {
        int[] array = {3,5,1,2,6,1,3};

        Set<Integer> arr = new HashSet<>();
        for (int i = 0; i < array.length; i++) {
            arr.add(array[i]);
        }
        System.out.println(arr.size());
    }
}
/**
 *
 * for(i=0; i<n;i++){
 *     for(k=0; j<i; j++){
 *         if arr[i] == arr[j]
 *         count++
 *     }
 *
 * }
 *
 *
 *
 */
