package String;

import java.util.StringTokenizer;

public class Basicstring {


    static int indeffind(String a){
        int c=0;
        for(int i=0;i<a.length();i++){
            if(a.charAt(i)=='A'){
                c++;
                if(c==2)
                    return i;
            }

        }
        return -1;
    }



    public static void main(String[] args) {
        String s1="Java";
        String s2="Java";

        String a="TAPbACADEMY";
       int ans= indeffind(a);
        System.out.println(ans);


        //if(s1==s2) System.out.println("refence are equal");
      //  else System.out.println("refrence are not equal");

       // if(s1.equals(s2)) System.out.println("value are equal");

        String s3=new String("Java");
        if(s1==s3) System.out.println("values are equal");



        // concat
        String s4="JAVA";
        String s5="PYTHON";

        String s6=s4.concat(s5);
        String s7=s4.concat(s5);

        if(s6==s7) System.out.println("reference are equal");
        else System.out.println("reference are not equal ");


        // compare to

        String aa="SACHIN";
        String b="SAVRAV";
        System.out.println(a.compareTo(b));

        //
        String s="JAVA";
        
      // stringbuffer -

        StringBuffer st=new StringBuffer();
        System.out.println(st.capacity());
        st.append("JAVA");
        System.out.println(st.length());
        st.append("JAVA SCRIPT");
        System.out.println(st.length());
        st.append(" Advance java");
        System.out.println(st);
        System.out.println(st.length());
        System.out.println(st.capacity());
        st.trimToSize();
        System.out.println(st.capacity() + " " +st.length());

     // string tokenizer

        StringTokenizer ss= new StringTokenizer("JAVA SQL BABA"," ");
        System.out.println(ss.hasMoreTokens());
        System.out.println(ss.nextToken());



    }
}
