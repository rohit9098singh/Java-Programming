

class base
{
   // int a=4;
    base()
    {
        System.out.println("i am a normal base class constructor");
    }
    base(int x)
    {
        System.out.println("i am an base class overloaded constructor with the vlaue of a is="+x);
    }

}
class child1 extends base{
    int b=5;
    child1()
    {
     System.out.println("i am a normal child class constructor");
    }
    child1(int a ,int b)
    {
        super(a);
        System.out.println("i am an overloaded child class constructor with the value of b="+b);
    }

    

}
public class ch5_inheritance_constructor {
    public static void main(String[] args) {
        child1 ch=new child1(20,30);
    }
    
}
