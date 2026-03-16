package Array;

import java.util.Scanner;

public class CountNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter element size");
        int n = sc.nextInt();

        int[] arr = new int[n];

        // Input array
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }

        System.out.println("enter find :");
        int f=sc.nextInt();

        int count=0;
        for(int i=0;i<arr.length;i++){
            if(f==arr[i])
                count++;
        }
        System.out.println(count);




    }
}
