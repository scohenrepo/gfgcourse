package Clase2;

public class Clase2_8 {
    //find if a given number has a perfect square
    public static void main(String[] args) {
        int n = 81;
        int beg = 0;
        int end = n;
        int mid = 0;

        while (beg <= end) {
            mid = (beg + end) / 2;
            if (mid*mid == n) {
                System.out.println(mid);
                break;
            } else {
                if (mid*mid < n) {
                    beg = mid + 1;
                } else {
                    end = mid - 1;
                }
            }
        }
        System.out.println(mid);

    }

}
