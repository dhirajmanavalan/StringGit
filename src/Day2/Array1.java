package Day2;

import java.util.Scanner;

public class Array1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();        // size of array
        int[] ar = new int[n];       // array creation

        // taking input
        for (int i = 0; i < ar.length; i++) {
            ar[i] = sc.nextInt();
        }

        // printing array elements
        for (int i = 0; i < ar.length; i++) {
            System.out.print(ar[i] + " ");
        }
    }
}
