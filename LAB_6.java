class Add_Sub
{
    int n1,n2;
    public Add_Sub(int x,int y)
    {
        this.n1=x;
        this.n2=y;
    }
    int add()
    {
        return n1+n2;
    }
    int sub()
    {
        return n1-n2;
    }
}
class Mul_Div extends Add_Sub
{
    int a,b;
    public Mul_Div(int x, int y)
    {
      super(x,y);
      this.a=x;
      this.b=y;
    }
    int mult()
    {
        return a*b;
    }
    float div()
    {
        return a/b;
    }
}
public class LAB_6 {
    public static void main(String[] args) {
        Mul_Div obj=new Mul_Div(20,10);
        System.out.println("addition ="+obj.add());
        System.out.println("subtraction ="+obj.sub());
        System.out.println("product ="+obj.mult());
        System.out.println("divided vlaue="+obj.div());
    }
    
}
