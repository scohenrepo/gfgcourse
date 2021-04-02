package Clase3;

public class Clase3_10 {

    static int[] arr = {3,5,1,8,13};
    public static void main(String[] args) {
        int sum = arr[0];
        int l = 0;
        int r = 0;
        int k = 14;

        while (r < arr.length) {
            if (sum == k) {
                break;
            } else {
                if (sum < k) {
                    r++;
                    sum+=arr[r];
                } else {
                    sum-=arr[l];
                    l++;
                }
            }
        }
        if (r < arr.length) {
            System.out.println(r +" "+ l);
            for (int i = l; i <= r; i++) {
                System.out.println(arr[i]);
            }

        }


    }

}
