package IfElse;

import java.util.Scanner;

public class PrintPositiveOnlyIfMinusAlso {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
//        if(a<0){
//
//            System.out.println(a * -1);
//        }
//        else {
//            System.out.println(a);
//        }

      //  =================  OR ======================

        System.out.println(a>=0 ? a : -a );
    }
}
