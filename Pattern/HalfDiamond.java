package Pattern;

public class HalfDiamond {
    public static void main(String[] args) {
        int n=5;
        for(int i=0;i<n;i++){

            // space
            for(int space=0;space < n-1-i;space++){
                System.out.print(" ");
            }
            // star
            for(int j=0;j<=i;j++){
                System.out.print("* ");
            }
            System.out.println();
        }

    }
}
