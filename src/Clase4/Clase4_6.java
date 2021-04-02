package Clase4;

public class Clase4_6 {
    static int[] num = {1,2,4,2};
    public static void main(String[] args) {


        System.out.println(sumDigitsOfArray(0));
    }

    private static int sumDigitsOfArray(int i) {

        if (i == num.length) {
            return 0;
        }
        return num[i] + sumDigitsOfArray(i+1);
    }

}
