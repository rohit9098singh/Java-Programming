

class base
{
   // int a=4;
    base()
    {
        System.out.println("i am a normal base class constructor");
    }
    base(int a)
    {
        System.out.println("i am an base class overloaded constructor with the vlaue of a is="+a);
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

  class grandchild extends child1
  {
    int c=7*8;
    grandchild()
    {
        System.out.println("i am an normal constructor of grandchld with the vakue of c="+c);
    }
    grandchild(int a,int b,int c)
    {
        super(a,b);
        System.out.println("i am an overloaded constructor with the value of  c is="+c);
    }
  }
public class ch5_multilevelinheritance_constructor {
    public static void main(String[] args) {
       // grandchild ch=new grandchild();
        grandchild ch=new grandchild(20,49,75);
    }
    
}
