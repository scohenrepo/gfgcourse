package Clase3;

import java.util.HashSet;
import java.util.Set;

public class Clase3_4 {
//sorted array
    static int[] arr = {3,6,7,8,9,10,24};
    public static void main(String[] args) {

        int k = 15;
        Set<Integer> mySet = new HashSet<>();

        for (int i = 0; i < arr.length; i++) {
            //if no elements in array is negative, I can break loop when a[i] is greater that k
            if (arr[i] > k) {
                System.out.println(arr[i] + " ARR[i] other elements are greater than k");
                break;
            }
            int a = k - arr[i];
            if (mySet.contains(a)) {
                System.out.println(arr[i] + " a " + a);
            } else {
                int b = binarySearch(a, i + 1);
                System.out.println(arr[i] + " b " + b);
            }
            mySet.add(arr[i]);

        }
    }

    private static int binarySearch(int a, int startPointer) {
        int endPointer = arr.length - 1;
        while (startPointer <= endPointer) {
            int midPointer = (startPointer + endPointer) / 2;
            if (arr[midPointer] < a) {
                startPointer = midPointer + 1;
            } else {
                endPointer = midPointer - 1;
            }
        }
        return endPointer;
    }

}
