class thiskey
{
    thiskey()
    {
        this(100);
        System.out.println("i am a normal constructor");
    }
    thiskey(int a)
    {
        System.out.println("i am a parametrized constructor with value of a ="+a);
    }
}
public class ch3_thiskeyword_2 {
    public static void main(String[] args) {
        thiskey key=new thiskey();
    }
    
}
