class shape
{
    void calculatearea(int r)
    {
        System.out.println("area of the circle="+Math.PI*r*r);
    }
    void calculatearea(float s)
    {
        System.out.println("the area of the square is"+s*s);
    }
    void calculatearea(int l,int b)
    {
        System.out.println("the area of the rectangle is ="+l*b);
    }
    void calculatearea( double b,double h)
    {
        System.out.println("area of the triangle is ="+(b*h)/2);
    }
}
public class ch1_methodoverloading_usinggeometrics_shapes {
    public static void main(String[] args) {
        shape obj=new shape();
        obj.calculatearea(4);
        obj.calculatearea(7.4f);
        obj.calculatearea(3, 5);
        obj.calculatearea(6.2, 3.5);
    }
    
}
