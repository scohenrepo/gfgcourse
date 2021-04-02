package Clase2;

public class Clase2_2 {

    static int[] a = {1, 2, 3, 4, 5};//    5,3,1,2,4

    public static void reverse(int start, int end) {
        System.out.println(start + " " + end);
        while (start < end) {
            int temp = a[start];
            a[start] = a[end];
            a[end] = temp;
            start++;
            end--;
        }
        for (int i = 0; i < a.length; i++) {
            System.out.printf(a[i] + ", ");
        }System.out.println();
        System.out.println("************************");
    }

    public static void rotate(int d, int n) {
        d = d % n; //aunque d sea mayor a n, sirve
        reverse(0, n-1);
        reverse(0, n-d-1);
        reverse(n-d, n-1);
    }
    //ROTATE ARRAY BY d POSITION TO LEFT (OR RIGHT)
    public static void main(String[] args) {
        rotate(2, a.length);

        for (int i = 0; i < a.length; i++) {
            System.out.printf(a[i] + ", ");
        }

    }

}
