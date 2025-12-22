package Dhiraj;

public class Array4 {
    public static void main(String[] args) {

        int[] arr = {1, 1, 2, 2, 3, 4, 4}; // sorted array
        int[] temp = new int[arr.length]; // temp array
        int j = 0;                         // index for temp

        temp[j++] = arr[0];                // store first element

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] != arr[i - 1]) {    // check duplicate
                temp[j++] = arr[i];        // store unique value
            }
        }

        for (int i = 0; i < j; i++) {      // print unique elements
            System.out.print(temp[i] + " ");
        }
    }
}
