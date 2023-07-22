import java.util.Scanner;
public class ch2_stringbuffer {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        StringBuffer s1=new StringBuffer();
        System.out.println("enter your string");
        //String s=sc.nextLine();//cannot use this 
        s1.append(sc.nextLine());
        s1.setCharAt(3,'d');
        System.out.println(s1);
        s1.insert(2,"abcd");
        System.out.println(s1);
        s1.setLength(20);
         System.out.println(s1);
         sc.close();
        
    }
}
