package Clase2;

import java.util.Arrays;
import java.util.List;

public class Clase2_1 {
    //SWAP ARRAY
    public static void main(String[] args) {
        int[] a = {1, 2, 4, 5, 3}; //3,5,4,2,1
        int start = 0;
        int end = a.length - 1;

       // System.out.println(a.length/2);
        while (start < a.length/2) {
            int temp = a[start];
            a[start] = a[end];
            a[end] = temp;
            start++;
            end--;
        }
        if (a.length % 2 != 0)
        a[a.length/2] = a[a.length/2];

        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }



    }

}
