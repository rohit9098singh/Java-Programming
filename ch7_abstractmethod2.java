abstract class parent2
{
    public parent2(){
        System.out.println("welcome you are in the  abstract base calss constructor");
    }
    void display()
    {
        System.out.println("you hava the abstract method further");
    }
    abstract public void greet();
    abstract public void greet2();
}
class child3 extends parent2
{
    public void greet(){
        System.out.println("hello buddy to the young generation ");
    }
    public void greet2()
    {
        System.out.println("namashkar to the old generation ");
    }
}
public class ch7_abstractmethod2 
{
    public static void main(String[] args) {
        child3 c=new child3();
         c.display();
        c.greet();
        c.greet2();
        
        
    }
}
    
    