package Clase5;

public class Clase5_4 {
    //tell if give number is power of 2
    public static void main(String[] args) {
        int x = 16;

        if ((x & (x - 1)) == 0) {
            System.out.println("es potencia");
        } else {
            System.out.println("no es potencia");
        }
    }
}
