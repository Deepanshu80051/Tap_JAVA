package Loops;
import java.util.*;
public class PrintReverse {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        // Reverse
//        for(int i=n;i>0;i--){
//            System.out.println(i);
//        }

        // Even Number
//        for(int i=2 ;i<=n;i=i+2)
//            System.out.println(i);

        // multiple of 3 and 5

//        for(int i=1;i<=n;i++){
//            if(i%3==0 || i%5 == 0)
//                System.out.println(i);


        // factor and count factor
  int count =0;
        for(int i=1;i<=n;i++){
            if(n%i==0)

            {

                System.out.print(i + " ");
                count++;
            }


        }
        System.out.println("count : " + count);



    }




}
