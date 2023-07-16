class showing_overloading
{
    int add()
    {
        return (10+10);
    }
    int add(int x,int y)
    {
        return x+y;
    }
    float add(float a,float b)
    {
        return a+b;
    }
}
public class LAB_5 {
    public static void main(String[] args) {
        showing_overloading o=new showing_overloading();
        System.out.println("using default value for sum ="+o.add());
       System.out.println("using integer value for sum ="+o.add(3,4));
       System.out.println("using float value for sum ="+o.add(4.4f,4.4f));
       
       
    }
    
}
