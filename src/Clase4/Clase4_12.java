package Clase4;

public class Clase4_12 {
    //given 2 arrays check if second string is sbusequence
    static String a = "abcd";
    static String b = "bd";
    public static void main(String[] args) {
        int len1 = a.length();
        int len2 = b.length();
        int i = 0;
        int j = 0;
        if (a.length() < b.length()) {
            System.out.println("nope");
        } else {
            while (i < len1 && j < len2) {
                if (a.charAt(i) == b.charAt(j)) {
                    j++;
                }
                i++;
            }

            if (j == len2) {
                System.out.println("true subset j " + j );
            } else {
                System.out.println("false subset j " + j );
            }
        }

    }

}
