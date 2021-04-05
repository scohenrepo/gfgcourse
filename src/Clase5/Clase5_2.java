package Clase5;

public class Clase5_2 {
    //given 2 arrays, both are exactly the same except for 1  number, find that number
    //otra solucion simple es sumar los elementos del primer arreglo y luego del segundo
    //y restar la suma del segundo al primero

    //DUDA, ESTO FUNCION CON STRINGS TAMBIEN????
    public static void main(String[] args) {
        int[] one = {3,4,2,5,3};
        int[] two = {2,4,3,5};
        int total = 0;
        for (int i = 0; i < one.length; i++) {
            total^=one[i];
        }
        for (int i = 0; i < two.length; i++) {
            total^=two[i];
        }
        System.out.println(total);
        System.out.println("***************************");
        int n = 6;
        System.out.println(1>>n);

    }
}
