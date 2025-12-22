package Dhiraj;

public class String2 {

    public static void main(String[] args) {

        java.lang.String str = "Java is very easy"; // input sentence
        int count = 1;                   // word counter

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == ' ') {  // space indicates new word
                count++;
            }
        }

        System.out.println("Word Count: " + count); // output
    }
}
