package Clase2;

public class Clase2_4 {

    public static void main(String[] args) {
        int[] a = {1,2,3,4,5,6,7,8,9,11,22,33,44,55,66,77,88,99,111,222,333,444,555,666,777};
        int find = 12;

        int low = 0;
        int high = a.length - 1;
        int mid = 0;

        while (low <= high) {
            mid = (low + high) / 2;
            if (a[mid] == find) {
                System.out.println("found " + a[mid]);
                break;
            } else {
                if (a[mid] < find) {
                    low = mid + 1;
                } else {
                    high = mid - 1;
                }
            }
        }

    }

}
