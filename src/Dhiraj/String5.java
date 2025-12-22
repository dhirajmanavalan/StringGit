package Dhiraj;

import java.lang.*;

public class String5 {

    public static void main(String[] args) {

        java.lang.String str = "education";   // input string
        int count = 0;              // vowel counter

        for (int i = 0; i < str.length(); i++) {     // loop through string
            char ch = str.charAt(i);                  // get each character

            if (ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u') {
                count++;                              // increase count
            }
        }

        System.out.println("Vowel Count: " + count); // output
    }
}




