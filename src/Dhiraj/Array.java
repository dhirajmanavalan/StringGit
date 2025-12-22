package Dhiraj;

public class Array {
    public static void main(String[] args) {

        int[] arr = {10, 45, 2, 89, 34}; // array initialization
        int max = arr[0];               // assume first element as max

        for (int i = 1; i < arr.length; i++) { // loop through array
            if (arr[i] > max) {                // compare values
                max = arr[i];                  // update max
            }
        }

        System.out.println("Maximum Element: " + max); // output
    }

}
