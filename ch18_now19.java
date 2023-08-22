import java.util.Scanner;
class Triangle
{
    int s1,s2,s3;
    Triangle()
    {
        getinfo();
    }
    public void getinfo()
    {
    Scanner sc=new Scanner(System.in);
    System.out.println("enter the three sides of the traingle");
    s1=sc.nextInt();
    s2=sc.nextInt();
    s3=sc.nextInt();
    
    }
    public void calculate()
    {
        double semiperimeter = (s1 + s2 + s3) / 2.0;
        double area=Math.sqrt(semiperimeter * (semiperimeter - s1) * (semiperimeter - s2) * (semiperimeter - s3));
        System.out.printf("the semiperimeter is =%.2f\n",semiperimeter);
        System.out.printf("the area of the traingle is=%.4f",area);
    }
}
public class ch18_now19 {
    public static void main(String[] args) {
        Triangle t=new Triangle();
        t.calculate();
       

    }
    
}
