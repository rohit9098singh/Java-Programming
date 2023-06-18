import java.util.Scanner;
public class Mark {
    public static void main(String[] string)
    {
      try (Scanner sc = new Scanner(System.in)) {
        System.out.println("enter the mark physics ");
        int phy=sc.nextInt();
        System.out.println("enter the  mark obtained in english");
        int eng=sc.nextInt();
        System.out.println("enter the  mark obtained in math");
        int math=sc.nextInt();
        int total= phy+eng+math;
        float per=total/3;
        System.out.println("your obtained percentage is :");
        System.out.print(per);
      }


    }
}
