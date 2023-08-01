class making_add_constructor
{
    private int x,y,z;
    making_add_constructor()
    {
        System.out.println("this is a default constructor ");
        
    }
    making_add_constructor(int x,int y,int z)
    {
       this.x=x;
       this.y=y;
       this.z=z;
    }
   public int perform_add()
    {
       return x+y+z;
    }
    public int subtract()
    {
        return (x-(y-z));
    }
}
class making_mul_div_class extends making_add_constructor
{
    private int a,b,c;
       making_mul_div_class()
       {
        super();//you write or not it will automatically writes all this
        System.out.println("this is the second default constructor");
       }
       making_mul_div_class(int a,int b,int c)
       {
        super(a,b,c);
        this.a=a;
        this.b=b;
        this.c=c;
       }
       public float divide()
       {
        return a/(b/c);
       }
       public int multiply()
       {
        return a*b*c;
       }
}
public class ch3_superkeyword2 {
    public static void main(String[] args) {
        making_mul_div_class m=new making_mul_div_class(30, 20, 10);
        System.out.println("sum of the given number are "+m.perform_add());
        System.out.println("the subtracted value of the eneted number is as follow "+m.subtract());
        System.out.println("on dividing the given expression the resultant value is as follow "+m.divide());
        System.out.println("the product of the given number are as follow "+m.multiply());

        making_mul_div_class nuw =new making_mul_div_class();
    }
    
}
