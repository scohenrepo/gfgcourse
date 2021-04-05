package Clase4;

public class Clase4_7 {//prefix sum

    public static void main(String[] args) {
        int[] arr = new int[5];
        int[][] q = {{1, 3, 10}, {2, 4, 5}};
        int base = 0;
        System.out.println(q[0][2]);
        while (base < q.length) {
            arr[q[0][base]] += q[0][2];

        }
    }

}
