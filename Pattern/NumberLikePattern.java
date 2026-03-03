package Pattern;

public class NumberLikePattern {
    public static void main(String[] args) {
        int n=5;
        for(int i=0;i<n;i++){
            for(int j=0;j<i+1;j++){
                System.out.print(j+1);
            }
            System.out.println();
        }
    }
}
/*
1
12
123
1234
12345
 */