class Abs
{
    Abs()
    {
        System.out.println("i am a normal constructor ");
    }
    Abs(int a)
    {
        this();//it calls the default constructor present  works when we make parametrized object
        System.out.println("i am a parameterized constructor with value of a ="+a);
    }
}
public class ch3_thiskeyword_1 {
    public static void main(String[] args) {
        Abs object=new Abs(100);
        
    }
    
}
