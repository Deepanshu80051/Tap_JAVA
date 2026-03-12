package Method;


class calculator1{
      int a=50;
    int b=40;

    int add(){
        int c;
        c=a+b;
       return c;

    }

}

public class NoInputOutput {
    public static void main(String[] args) {
        calculator1 c=new calculator1();
        int aa= c.add();
        System.out.println(aa);
    }
}
