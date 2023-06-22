import java.util.Scanner;

import javax.crypto.interfaces.DHPrivateKey;
public class Method_overloading {
    void add()
    {
        Scanner sc=new Scanner(System.in);
        int a,b;
        System.out.println("eneter the value of a ,b");
        a=sc.nextInt();
        b=sc.nextInt();
        int c=a+b;
        System.out.println("the sum of the two number are "+c);
    }
    void add(int a,int b,int c)
    {
        Scanner sc=new Scanner(System.in);
         System.out.println("eneter the value of a,b,c");
        a=sc.nextInt();
        b=sc.nextInt();
        c=sc.nextInt();
        int d=a+b+c;
        System.out.println("the sum of the three number are "+d);
    }
    void add(int a,int b,int c,int d)
    {
        Scanner sc=new Scanner(System.in);
         System.out.println("eneter the value of a,b,c,d");
        a=sc.nextInt();
        b=sc.nextInt();
        c=sc.nextInt();
        d=sc.nextInt();
        int e=a+b+c+d;
        System.out.println("the sum of the four number are "+e);

    }
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int a,b,c,d;
        Method_overloading obj=new  Method_overloading();
        obj.add();
        obj.add(a,b,c);
        obj.add(a,b,c,d);
        

    }
        
    }
    

