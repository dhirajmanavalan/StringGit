package Dhiraj;

public class Array5 {
    public static void main(String[] args) {

        int[] arr = {10, 20, 30, 40}; // input array
        int sum = 0;                  // sum variable

        for (int i = 0; i < arr.length; i++) { // loop array
            sum = sum + arr[i];                // add elements
        }

        System.out.println("Sum of Array: " + sum); // output
    }
}
