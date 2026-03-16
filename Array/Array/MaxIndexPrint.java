package Array;

import java.util.Scanner;

public class MaxIndexPrint {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter element size");
        int n=sc.nextInt();
        int [] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int max=Integer.MIN_VALUE;
        int index=0;
        for(int i=0;i<n;i++){
            if(max<arr[i]){
                max=arr[i];
                index=i;
            }


        }
        System.out.println(index);
    }
}
