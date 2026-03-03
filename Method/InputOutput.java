package Method;


class cla{
    int c;
    int add(int a,int b){
        c=a+b;
       return c;
    }


}

public class InputOutput {
    public static void main(String[] args) {
        cla cc=new cla();
       int bb= cc.add(50,40);
        System.out.println(bb);
    }
}
