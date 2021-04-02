package Clase4;

public class Clase4_2 {

    public static void main(String[] args) {
        int num = 4;

        printFactorial(num, 1);
    }

    private static void printFactorial(int num, int i) {

        if (num == i) {
            System.out.println(i + " ");
            return;
        }
        System.out.println(i + " ");
        printFactorial(num, i+1);
    }

}
