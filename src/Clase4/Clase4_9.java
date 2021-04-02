package Clase4;

import java.util.Locale;

public class Clase4_9 {
//check if given array is a palindrom
    public static void main(String[] args) {
        String spaces = "anita lava la tina";
        //String word = spaces.replace(" ", "").toLowerCase();
        String word = "abaa";//
        //un poquito mas limpio, y una variable menos
        for (int i = 0; i < word.length()/2; i++) {
            if (word.charAt(i) != word.charAt(word.length()-i-1)) {
                System.out.println("Not a palindrome");
            } else {
                System.out.println("We've got a winner");
            }
        }

        /*for (int i = 0, j = word.length()-1; i < j; i++, j--) {
            if (word.charAt(i) != word.charAt(j)) {
                System.out.println("Not a palindrome");
            } else {
                System.out.println("We've got a winner");
            }
        }*/

    }

}
