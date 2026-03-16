package Array;

import java.util.Scanner;

public class SkipIndexMul {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter element size");
        int n = sc.nextInt();

        int[] arr = new int[n];

        // Input array
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }

        int mul = 1;

        // Multiply all elements
        for(int i = 0; i < n; i++){
            mul *= arr[i];
        }

        int[] res = new int[n];

        // Skip index multiplication
        for(int i = 0; i < n; i++){
            res[i] = mul / arr[i];
        }

        // Print result
        for(int i = 0; i < n; i++){
            System.out.println(res[i]);
        }
    }
}