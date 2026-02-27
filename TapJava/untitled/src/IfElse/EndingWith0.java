package IfElse;

import java.util.Scanner;

public class EndingWith0 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();

       // int check=a%10;
       // if(check ==0) System.out.println("yes");
       // int check =a%10;
        //if(check ==7) System.out.println("yes");
//        int check =a%100;
//        if(check ==53) System.out.println("yes");
//        else System.out.println("no");

       // int b=a/100;
      //  System.out.println(b);

        if(a>=10 && a<=99) System.out.println("two digit");
        else System.out.println("no two digit");
    }
}
