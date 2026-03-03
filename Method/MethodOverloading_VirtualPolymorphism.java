package Method;

public class MethodOverloading_VirtualPolymorphism {

    void add(int a,int b){
        System.out.println(a+b);
    }
    void add(int a,int b,int x){
        System.out.println(a+b);
    }
    void add(int a,float b){
        System.out.println(a+b);
    }


    public static void main(String[] args) {
      int a=10,b=5,x=44;
       float c=11.5f;

        MethodOverloading_VirtualPolymorphism s=new MethodOverloading_VirtualPolymorphism();
        s.add(a,b);
    }
}
