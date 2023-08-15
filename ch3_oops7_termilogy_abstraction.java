abstract class abst{
    abstract public void dosomething();
    void randomly()
    {
        System.out.println("here we are not doing much just writing my java exam");
    }
    void count()
    {
        System.out.println("just calculated the first five natural number");
        for (int i=0;i<4;i++)
        {
            System.out.println(i);
        }
    }

}
class bar extends abst
{
    public void dosomething()
    {
        super.randomly();
        super.count();
        System.out.println("i am presently calculating the no of even number between 1 and hundred");
        for(int i=1;i<=100;i++)
        {
            if(i%2==0)
            {
                System.out.println(i);
            }
        }
    }
    public void in_child()
    {
        System.out.println("thanks for making my object and not of the super class");
    }
}
public class ch3_oops7_termilogy_abstraction {
    public static void main(String[] args) {
        bar b= new bar();
        b.dosomething();
        b.in_child();
    }
    
}
