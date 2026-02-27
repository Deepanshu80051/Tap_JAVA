package IfElse;

import java.util.Scanner;

public class DivisibleBy3And5 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();

        //if(a%3==0 && a%5==0) System.out.println("yes");

        if(a%2==0 && a%5==0 && a%10 ==0) System.out.println("yes");
        else System.out.println("no");
    }
}
