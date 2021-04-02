package Clase2;

public class Clase2_7 {

    //static int[] a = {1,3,5,7,7,7,9};
    static int[] a = {1,3,5,7,9};

    public static void main(String[] args) {
        int find = 8;

        int low = 0;
        int high = a.length - 1;
        int mid = 0;

        int lowest = getLowestIndex(low, high, mid, find);
        int greatest = getGreatestIndex(low, high, mid, find);

        System.out.println(greatest - lowest + 1);
        System.out.println(greatest + " " +lowest );
    }

    private static int getGreatestIndex(int low, int high, int mid, int find) {
        while (low <= high) {
            mid = (low + high) / 2;
            if (a[mid] <= find) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return high;//<=
    }

    private static int getLowestIndex(int low, int high, int mid, int find) {

        while (low <= high) {
            mid = (low + high) / 2;
            if (a[mid] < find) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }

        return low;//-

    }

}
