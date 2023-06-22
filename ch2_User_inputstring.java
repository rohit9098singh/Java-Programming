import java.util.Scanner;
public class ch2_User_inputstring {
    public static void main(String[] args)
    {
        int no;
        Scanner sc= new Scanner(System.in);
        System.out.println("enter the number of people inputs that you want to enter");
         no=sc.nextInt();
         String name[]= new String[no];
         for(int i=0;i<no;i++)
         {
           System.out.println("enter the name of your friend\t::"+i++);
           name[i]=sc.next();
         }
         for(int i=0;i<no;i++)
         {
            System.out.println(name[i]);
         }

    }
}
