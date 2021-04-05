package Clase5;

public class Clase5_5 {
    //given sorted array, interchage highest with lowest
    //1,2,3,4,5   -->   5,1,4,2,3
    static int[] arr = {1,2,3,4,5};
    static int[] other = new int[arr.length];
    public static void main(String[] args) {
        int start = 0;
        int end = arr.length-1;
        int index = 0;

        while (start <= end) {
            index = swap(arr[start], arr[end], index);
            start++;
            end--;
        }

        for (int i = 0; i < arr.length; i++) {
            System.out.println(other[i]);
        }
    }

    private static int swap(int i, int i1, int s) {
        System.out.println("i " + i + " i1 " + i1);
        other[s] = i1;
        if ( s+1 < arr.length)
            other[s+1] = i;
        return s+2;
    }

}
