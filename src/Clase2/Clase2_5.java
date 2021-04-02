package Clase2;

public class Clase2_5 {
    //sorted array, tell the greatest index of a number less than or equal to "find"
    // find index of the number just greater than "find"
    //Answer is that index - 1
    //INDICE DEL NUMERO CON VALOR MENOR O IGUAL QUE X
    public static void main(String[] args) {
        //int[] a = {1,3,5,7,7,7,9};
        int[] a = {1,3,5,7,9};
        int find = 8;

        int low = 0;
        int high = a.length - 1;
        int mid = 0;

        while (low <= high) {
            mid = (low + high) / 2;
            if (a[mid] <= find) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }

        System.out.println(high);
    }

}
