class thiskey
{
    thiskey()
    {
        this(100);
        System.out.println("i am a normal constructor");
    }
    thiskey(int c)
    {
        this(20,100);
        System.out.println("i am a parametrized constructor with value of c ="+c);
    }
    thiskey(int b,int c)
    {
        this(10,20,100);
        System.out.println("i am further overloaded with value of b and  c is="+b+" "+c);
    }
    thiskey(int a ,int b,int c)
    {
        System.out.println("i am third overloaded constructor second timr called by this keyword with a,b,c="+a+" "+b+" "+c);
    }
}
public class ch3_thiskeyword_2 {
    public static void main(String[] args) {
        thiskey key=new thiskey();
    }
    
}
