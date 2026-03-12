package Array;

import java.util.Scanner;

public class basicArray {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);



/*
       int arr[]=new int[5];
        System.out.println("Enter your number");
        for(int i=0;i<5;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("print :");
        for(int i=0;i<5;i++){
            System.out.println(arr[i]);
        }


 */

      /*  // two dimensional array
        int arr[][]=new int[2][5];

        for(int i=0;i<2;i++){
            for(int j=0;j<5;j++){
                arr[i][j]=sc.nextInt();
            }
        }


*/
        // how to create and initialization in same line

       int a[]={10,20,30,50,60,8};
        for(int i=0;i<a.length;i++){
            System.out.println(a[i]);
        }

    }
}
