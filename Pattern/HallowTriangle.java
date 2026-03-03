package Pattern;

public class HallowTriangle {
    public static void main(String[] args) {
        int n=5;
        for(int i=0;i<n;i++){

                for(int j=0;j<=i;j++){
                    if(i==0 || i==n-1 || i==1){
                    System.out.print(" ");
                }
                    System.out.println();

            }
           /* else if(i==2 || i==3){
                System.out.println();
            }

            */
        }
    }
}
