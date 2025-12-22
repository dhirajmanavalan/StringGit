package Dhiraj;

public class Array3 {
    public static void main(String[] args) {

        int[] arr = {10, 45, 2, 89, 34}; // initialize array

        int max = arr[0]; // assume first element as max

        for (int i = 1; i < arr.length; i++) { // loop from second element
            if (arr[i] > max) {               // compare current with max
                max = arr[i];                 // update max
            }
        }

        System.out.println("Maximum element: " + max); // output result
    }
}
