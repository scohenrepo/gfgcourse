package Clase2;

import java.math.RoundingMode;
import java.text.DecimalFormat;

public class Clase2_9 {
    static int n = 5;
    private static DecimalFormat df = new DecimalFormat("0.00");
    //find square of a given number with up to 2 decimal points
    public static void main(String[] args) {

        int beg = 0;
        int end = n;
        int mid = 0;
        float num = 0f;
        float e = 0.01f;

        int factor = getSqr(beg, end, mid, n);
        if ((factor * factor) == n) {
            System.out.println("Perfect sqr " + factor);
        } else {
            if ((factor * factor) > n) {
                factor--;
            }
            num = calculateDecimals(factor, e);
        }
        //df.setRoundingMode(RoundingMode.DOWN); //rounds down
        System.out.println("Result " + df.format(num));
    }

    private static float calculateDecimals(int factor, float e) {
        float beg = (float)factor;
        float end = factor + 1;
        float mid = 0;
        int count = 0;
        while (beg <= end) {
            mid = (float)(beg + end) / (float)2;
            if (Math.abs(mid * mid - factor) < e) {
                return mid;
            } else {
                if (mid * mid < factor) {
                    beg = mid + e/10;
                } else {
                    end = mid - e/10;
                }
            }

            System.out.println("while " + count);
            count++;
        }
        return mid;
    }

    private static int getSqr(int beg, int end, int mid, int n) {
        while (beg <= end) {
            mid = (beg + end) / 2;
            if (mid * mid == n) {
                return mid;
            } else {
                if (mid * mid < n) {
                    beg = mid + 1;
                } else {
                    end = mid - 1;
                }
            }
        }
        return mid;
    }
}
