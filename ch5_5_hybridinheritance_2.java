class rohit
{
    int a;
}
class rahul extends rohit
{
    int b;
}
class sourabh extends rohit
{
    public int c;
    sourabh()
    {
        a=12;
        c=14;
    }
    void sum()
    {
        System.out.println("the sum of two numbers are as follow :"+(a+c));
    }
}
class ayush extends rahul
{
    int d;
    ayush()
    {
        a=2;
        b=23;
        d=2;
    }
    void mult()
    {
        System.out.println("the product of the numbers are as follow :"+(a*b*d));
    }
}

public class ch5_5_hybridinheritance_2 {
    public static void main(String[] args) {
        ayush a=new ayush();
        a.mult();

        sourabh s=new sourabh();
        s.sum();
    }
    
}
