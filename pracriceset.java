import java.util.Scanner;
public class pracriceset{
  public static void main(String[] args) {
    float s1,s2,s3,s4;
    Scanner sc=new Scanner(System.in);
    System.out.println("enter the number of student ");
    int number=sc.nextInt();
    float total[]=new float[number];
    float[] percentage=new float[number];
    for(int i=1;i<=number;i++)
    {
      System.out.println("enter the mark of math of studnet "+i);
      s1=sc.nextInt();

      System.out.println("eneter the marks of physics of student"+i);
      s2=sc.nextInt();

      System.out.println("enter the marks of biology of student"+i);
      s3=sc.nextInt();

      System.out.println("enetr the marks of history of student"+i);
      s4=sc.nextInt();

      total[i]=s1+s2+s3+s4;
      percentage[i]=total[i]/4;
    }
    for(int i=1;i<=number;i++)
    {
      if(total[i]>40 && percentage[i]>40)
      {
        System.out.println("pass");
      }
      else{
        System.out.println("fail");
      }
    }

    
  }
}