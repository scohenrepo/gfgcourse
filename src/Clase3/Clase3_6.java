package Clase3;

public class Clase3_6 {

    //sum of the prefixes of an array inside a range
    static int[] arr = {3,51,6,642,62};
    public static void main(String[] args) {
        int[] sums = new int[arr.length];
        int l = 1;
        int r = 3;
        int count = 0;
        for (int i = l; i <= r; i++) {

            count += arr[i];

            System.out.println(count);
        }

        /*int count = 0;
        sums[count] = arr[l];
        System.out.println(sums[0]);
        for (int i = l + 1; i < r + 1; i++) {

            count++;
            sums[count] = sums[count-1] + arr[i];

            System.out.println(sums[count]);
        }*/

    }

}
