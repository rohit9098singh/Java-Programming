import java.util.Random;
import java.util.Scanner;

//import javax.swing.BoundedRangeModel;
public class Game {
    
    public static void main(String[] args)
  {    
    Scanner sc=new Scanner(System.in);
    Random ran=new Random();
    System.out.println("enter your choice user\n 0: for stone \n 1: for paper\n 2:for scissor");
    int userinput=sc.nextInt();
    //int bound;
    int computerinput=ran.nextInt();

    if(userinput==computerinput)
    {
        System.out.println("draw");
    }
    else if(userinput==0&&computerinput==2||userinput==1&&computerinput==0||userinput==2&&computerinput==1)
    {
        System.out.println("you won");

    }
    else
    {
       System.out.println("you loos the computer wins");
 
    }
    if(computerinput==0)
    {
        System.out.println("computer chose: stone");

    }
    else if(computerinput==1)
    {
        System.out.println("computer chose: paper");

    }
    else if(computerinput==2) 
    {
        System.out.println("computer chose: scissor");


    }
    
    
sc.close();
    
    }



}
