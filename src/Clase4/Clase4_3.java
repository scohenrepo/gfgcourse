package Clase4;

public class Clase4_3 {

    public static void main(String[] args) {
        int num = 4;

        System.out.println(printFactorial(num));
    }

    private static int printFactorial(int num) {
        if (num < 0) {
            return  -1;
        }
        if (num == 0) {
            return 1;
        }
        return num*printFactorial(num-1);
    }

}
