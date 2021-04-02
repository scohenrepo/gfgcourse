package Clase4;

public class Clase4_5 {

    public static void main(String[] args) {
        int num = 1242;

        System.out.println(sumDigits(num));
    }

    private static int sumDigits(int num) {

        if (num == 0) {
            return 0;
        }
        return (num%10) + sumDigits(num/10);
    }

}
