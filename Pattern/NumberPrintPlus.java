package Pattern;

public class NumberPrintPlus {
    public static void main(String[] args) {
        int n=5;
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                System.out.print(i+j+1);
            }
            System.out.println();
        }
    }
}
/*
12345
23456
34567
45678
56789
 */