import java.util.Scanner;
public class String_func {
    public static void main(String[] args)
    {
      //Scanner sc =new Scanner(System.in); 
      //System.out.println("enter your string ");
      //String st=sc.nextLine();
      String st=new String("Rohit");


      int l=st.length();  
      System.out.println("the length of the string is "+l);

      String lcase=st.toLowerCase();
      System.out.println("your enterd string is converted into lower case "+lcase);

      String ucase=st.toUpperCase();
      System.out.println("your enterd string is converted into upper case "+ucase); 

       System.out.println(st.substring(2));
       System.out.println(st.substring(1,4));

       System.out.println(st.replace('R','d'));

       System.out.println(st.startsWith("Roh"));
       System.out.println(st.endsWith("roh"));

       /*String nonTrimmed="Rohit";
       System.out.println(nonTrimmed);

      String trimmedstring= nontrimmed .trim();
      System.out.println(trimmedstring);*/
       
       System.out.println(st.charAt('3'));
       System.out.println(st.indexOf("o"));

       
    }
    
}
