class hello{
    public int a,b;
    hello(int a ,int b)
    {
        this.a=a;
        this.b=b;
        if(a>b)
        {
            System.out.println("a is bigger with value ="+a);

        }
        else{
            System.out.println("b is bigger with the value="+b);
        }
    }
}
public class constructorex
{
    public static void main(String[] args) {
        hello h=new hello(10,20);
        
    }
}