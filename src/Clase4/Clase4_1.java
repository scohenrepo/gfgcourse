package Clase4;

public class Clase4_1 {

    public static void main(String[] args) {
        int num = 4;

        printFactorial(num);
    }

    private static void printFactorial(int num) {
        if (num < 1) {
            return;
        }
        System.out.println(num + " ");
        printFactorial(num-1);
    }
}
