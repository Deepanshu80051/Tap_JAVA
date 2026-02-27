package IfElse;

import java.util.Scanner;

public class T3Type5Question {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
            if(a%3==0 && a%5==0) System.out.println("BTM");
        else if(a%3==0) System.out.println("Tap");
       else  if(a%5==0) System.out.println("acad");


    }
}
