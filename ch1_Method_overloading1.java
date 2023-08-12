import java.util.Scanner;
public class ch1_Method_overloading1 {
    void add(int a ,int b)
    {
        
        int c=a+b;
        System.out.println("the sum of the two number are "+c);
    }
    void add(int a,int b,int c)
    {
        
        int d=a+b+c;
        System.out.println("the sum of the three number are "+d);
    }
    void add(int a,int b,int c,int d)
    {
        Scanner sc=new Scanner(System.in);
       
        int e=a+b+c+d;
        System.out.println("the sum of the four number are "+e);

    }
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int a,b,c,d;
          System.out.println("eneter the value of a,b,c,d");
        a=sc.nextInt();
        b=sc.nextInt();
        c=sc.nextInt();
        d=sc.nextInt();
        ch1_Method_overloading1 obj=new  ch1_Method_overloading1();
        obj.add(a,b);
        obj.add(a,b,c);
        obj.add(a,b,c,d);
        

    }
        
    }
    

