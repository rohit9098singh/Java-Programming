import java.util.*;
class firstyear
{
    String coursename;
    String faculty;
    int stdcount;
    String student[]=new String[50];
    String marks[]=new String[50];
    firstyear()
    {
        getinfo();
    }
    public void getinfo()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the name of  the course");
        coursename=sc.nextLine();
        System.out.println("enter the name of the faculty there");
        faculty=sc.nextLine();
        System.out.println("enter the total number of student");
        stdcount=sc.nextInt();
        System.out.println("enter the total marks of each student");
        for(int i=0;i<stdcount;i++)
        {
            marks[i]= sc.nextLine();
        }
        System.out.println("enter the name of the studnet");
        for(int i=0;i<stdcount;i++)
        {
            student[i]=sc.nextLine();
        }

    }
    public void beststudent()
    {
        int best=0, k=-1;
        for(int i=0;i<stdcount;i++)
        {
            if(marks[i]>best)
            {
            best=marks[i];
            k=i;
            }
        }
        System.out.println("best student="+student[k]);
    }


}
public class l1
{
    public static void main(String[] args) {
        firstyear f=new firstyear();
        f.beststudent();
    }
}