package Clase5;

public class Clase5_3 {
//find ith from x, turned to binary
    public static void main(String[] args) {
        int x = 12; //1100
        int i = 2;

        if ((x & (1 << i)) == 0) {
            System.out.println("0");
        } else {
            System.out.println("1");
        }
        System.out.println((1 << i)); //modifica 1100 por 0100 que es 4 en decimal

    }
}
