class square
{
    int side;
    public int area()
    {
        return side*side;
    }
    public int perimeter()
    {
        return 4*side;
    }
}
public class ch3_oops5 {
    public static void main(String[] args)
    {
      square r =new square();
      r.side=4;
      System.out.println(r.area());
      System.out.println(r.perimeter());
      


    }

    
}
