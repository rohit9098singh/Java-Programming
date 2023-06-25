class cylinder
{
    private int radius;
    private int height;
    public void setradius(int r)
    {
        this.radius=r;
    }
    public void setheight(int h)
    {
        this.height=h;
    }
    public int getheight()
    {
        return height;
    }
    public int getradius()
    {
        return radius;
    }
    public double volume()
    {
        return 3.14*radius*height;
    }
    public double surfacearea()
    {
       return 2*314*radius*radius+2*3.14*radius*height;
    }
}
public class ch4_mathproblem {
    public static void main(String[] args) {
        cylinder c=new cylinder();

        c.setradius(21);
        c.setheight(5);
        System.out.println(c.getheight());
        System.out.println(c.getradius());
        System.out.println("the volume of the cylinder is :" + c.volume());
        System.out.println("the surfave area of the cylinnder is :" + c.surfacearea());

    }
    
}
