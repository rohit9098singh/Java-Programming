import java.util.Scanner;
import java.util.Random;
public class game 
{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter 0: for rock paper\nenter 1:paper\nenter 2:scissor");
        int userinput =sc.nextInt();
        Random ran=new Random();
        int computerinput =ran.nextInt();
        if(userinput==0 && computerinput==2 ||userinput==1 && computerinput==0||userinput==2&&computerinput==0)
        {
            System.out.println("you won");

        }
        else 
        {
            System.out.println("computer wins");

        }
        if(computerinput==0)
        {
            System.out.println("computer chose rock");
        }
        if(computerinput==1)
        {
            System.out.println("computer chose paper");
        }
        if(computerinput==2)
        {
            System.out.println("computer chose scissor");
        }    
        sc.close();
    } 

}