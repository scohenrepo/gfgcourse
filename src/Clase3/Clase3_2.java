package Clase3;

import java.util.HashSet;
import java.util.Set;

public class Clase3_2 {
        //pick 2 elems from array which sum is 0 (zero)
    public static void main(String[] args) {
        int[] arr = {3,-5,2,7,5};

        Set<Integer> mySet = new HashSet<>();

        for(int i=0; i<arr.length;i++){

            if (mySet.contains(-1*arr[i])) {
                System.out.println(arr[i] + " " + (-1*arr[i]));
                break;
            }
            mySet.add(arr[i]);

        }



        /*for(int i=0; i<arr.length;i++){
            for(int j=0; j<i; j++){
                if( arr[i] + arr[j] == 0) {
                    System.out.println(arr[i] + " " + arr[j]);
                }
            }

        }*/

    }

}
