package Clase3;

public class Clase3_7 {

    static int[] arr = {3,51,6,642,62};
    static int[] sums = new int[arr.length];
    public static void main(String[] args) {
        calcularSumOfAllPrefixes();

        //q queries
        /** while (q--)
         *      if(l == 0)
         *          output => pre[r]
         *      else
         *          output =>    pre[r]  -  pre[l-1]
         * // ans = pre[r] - pre[l] + in[l]
         */

    }

    private static void calcularSumOfAllPrefixes() {
        sums[0] = arr[0];
        System.out.println(sums[0]);
        for (int i = 1; i < arr.length; i++) {
            sums[i] = sums[i-1] + arr[i];
            System.out.println(sums[i]);
        }
    }
}
