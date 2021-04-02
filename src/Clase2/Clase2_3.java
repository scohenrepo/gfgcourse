package Clase2;

public class Clase2_3 {
    //TRAPPING RAIN WATER
    public static void main(String[] args) {
        int[] a = {8, 8, 2, 4, 5, 5, 1};
        int water = 0;
        int[] left = new int[a.length];
        int[] right = new int[a.length];

        //left -> maximum of all elements from 0 to i
        left[0] = a[0];
        for (int i = 1; i < a.length; i++) {
            left[i] = Math.max(left[i-1], a[i]);
        }
        for (int i = 0; i < a.length - 1; i++) {
            System.out.printf(left[i] + " ");
        }
        System.out.println();System.out.println();

        //right -> maximum of all elements from i to a.length-1
        right[a.length-1] = a[a.length-1];
        for (int i = a.length-2; i >= 0; i--) {
            right[i] = Math.max(right[i+1], a[i]);
        }

        for (int i = 0; i < a.length - 1; i++) {
            System.out.printf(right[i] + " ");
        }

        System.out.println();System.out.println();

        for (int i = 0; i < a.length - 1; i++) {
            water += Math.min(left[i], right[i] ) - a[i];

            System.out.printf(water + " ");
        }

        System.out.println(water);
    }

}
