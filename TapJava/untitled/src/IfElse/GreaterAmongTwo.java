package IfElse;

import java.util.Scanner;

public class GreaterAmongTwo {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
//        int one=sc.nextInt();
//        int two=sc.nextInt();
//       int ans= one>two ? one : two;
//        System.out.println(ans);

        //=======================================
        int one=sc.nextInt();
        int two=sc.nextInt();
        int three=sc.nextInt();
        int four=sc.nextInt();
        if(one > two && one > three && one > four) System.out.println(one);
        if(two > one && two > three && two > four) System.out.println(two);
        if(three > two && three > one && three > four) System.out.println(three);
        else System.out.println(four);
    }
}
