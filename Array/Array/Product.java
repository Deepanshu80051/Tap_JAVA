package Array;

import java.util.Scanner;

public class Product {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter element size");
        int n=sc.nextInt();
        int [] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        long pro=1;
        for(int i=0;i<n;i++){
            pro *=arr[i];
        }
        System.out.println(pro);
    }
}
