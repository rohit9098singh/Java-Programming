class circle
{
   public int r;
   circle(int r)
   {
    this.r=r;
   }
   public double area()
   {
      return 3.14*this.r*this.r;
   }
}
class cylinder1 extends circle
{
   public int height;
   cylinder1(int r,int h)
   {
     super(r);
     System.out.println("i am cylinder class constructor");
     this.height=h;
   }
   public double volume()
   {
    return 3.14*r*r*this.height;
   }
}

public class ch5_inheritance_via_cylinderandcircle {
    public static void main(String[] args) {
        circle c=new circle(54);
       // cylinder1 c1=new cylinder1(12,32);
        //System.out.println(c1.volume());
        System.out.println(c.area());

    }
    
}
