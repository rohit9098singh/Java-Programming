import java.util.Scanner;
import java.lang.Math;
class Rectangle{
    float length,breadth;
    Rectangle()
    {
        take_input();
    }
    public void take_input()
    {
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter the length of the rectangle and breadth of recatangle respectively");
      length=sc.nextFloat();
      breadth=sc.nextFloat();
    }
    public void calculation()
    {
        float area=length*breadth;
        float perimeter=2*(length+breadth);
        double diagonals=Math.sqrt(length*length+breadth*breadth);
        System.out.println("the area of rectangle ="+area);
        System.out.println("the perimeter of rectangle ="+perimeter);
        System.out.println("the diadonals="+diagonals);

    }
    /*void diaplay()
    {
        System.out.println("the length and breadth was"+length+""+breadth);
        System.out.println("the area of the traingle "+area);
        System.out.println("the primeter of the triangle "+perimter);
        System.out.println("the digonals is "+diagonals);
    }*/
    
}
public class ch18_now20 {
    public static void main(String[] args) {
        Rectangle r=new Rectangle();

        r.calculation();
    }
    
}
