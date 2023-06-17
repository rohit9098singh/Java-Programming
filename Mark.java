import java.util.Scanner;
public class Mark {
    public static void main(String[] string)
    {
      try (Scanner sc = new Scanner(System.in)) {
        System.out.println("enter the mark");
        int phy=sc.nextInt();
        System.out.println("enter the  mark obtained in english");
        int eng=sc.nextInt();
        System.out.println("enter the  mark obtained in math");
        int math=sc.nextInt();
        float per=(math+eng+phy)/300*100;
        System.out.println("your obtained percentage is :");
        System.out.print(per);
      }


    }
}
