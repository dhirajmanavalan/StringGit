package Dhiraj;

public class String4 {

    public static void main(String[] args) {

        java.lang.String str = "Dhiraj";          // input string
        java.lang.String rev = "";                // empty string for reverse

        for (int i = str.length() - 1; i >= 0; i--) { // loop from last char
            rev = rev + str.charAt(i);                // append character
        }

        System.out.println("Reversed string: " + rev); // output
    }

}
