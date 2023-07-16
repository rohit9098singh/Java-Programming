class practice
{
    int add()
    {
        return(10+10);
    }
    int add(int x,int y)
    {
        return(x+y);
    }
    float add(float x, float y)
    {
        return x+y;
    }
}
public class ch0_0practice
{
    public static void main(String[] args) {
        practice c=new practice();
        System.out.println("using the default integer value "+c.add());
        System.out.println("using the parameterized that is the overloaded constructor "+c.add(34,45));
        System.out.println("using the float val es for adding of he values "+c.add(5.4f,4.3f));

    }
   
    
}
