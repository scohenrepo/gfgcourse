package Clase4;

public class Clase4_4 {

    public static void main(String[] args) {
        int num = 8;//Obtener el nth numero en la serie fibonacci

        System.out.println(printFibocci(num));
    }

    private static int printFibocci(int num) {
        //System.out.println("num " + num);
        if (num <= 1) {
            return num;
        }
        return printFibocci(num-1) + printFibocci(num-2);
    }

}
