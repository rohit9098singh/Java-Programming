import java.util.Scanner;
public class ch18_now3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        float math,physics,biology,chemistry;
        System.out.println("enetr the number of student whom you want to enter the marks");
        int no_of_student=sc.nextInt();
        float total[]=new float[no_of_student];
        float percentage[]=new float[no_of_student];
        for(int i=0;i<no_of_student;i++)
        {
           System.out.println("enter the marks in math for student "+(i+1)+":");
           math=sc.nextFloat();
           System.out.println("enter the marks in physics s2 for the student"+(i+1)+":");
           physics=sc.nextFloat();
           System.out.println("enter the marks in chemistry for student "+(i+1)+":");
           chemistry=sc.nextFloat();
           System.out.println("enter the marks in  biology for the student"+(i+1)+":");
           biology=sc.nextFloat();

           total[i]=math+physics+chemistry+biology;
           percentage[i]=total[i]/4;

        }
        for(int i=0;i<no_of_student;i++)
        {
            if(total[i]>40&&percentage[i]>40)
            {
                System.out.println("the student is passed with the given percentage ::"+percentage[i]);
            }
            else{
                System.out.println("misfortunately the student is fail ");
            }
        }
        
    }

   
}
