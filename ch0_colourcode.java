 abstract class yourstudent
{
    abstract void dancer();
    public void place()
    {
        System.out.println("you are dancing in a auditoriam");
    }
    abstract void nameofdance();
}
class fresher extends yourstudent
{
   public void dancer()
   {
      System.out.println("profeshnal dancer");
   }
   public void nameofdance()
   {
      System.out.println(" name of the dance form is = kathak");
   }
   
}
public class ch0_colourcode {
    public static void main(String[] args) {
        String [] colour={
            "\033[91m",//red 
            "\033[92m",//green
            "\033[93m",//green
            "\033[94m",//blue
            "\033[95m",//cyan
             "\033[96m"};//magneta
             System.out.println(colour[0]+"this is red colour");
             System.out.println(colour[1]+"this is green colour");
            System.out.println(colour[2]+"this is yellow colour");
             System.out.println(colour[3]+"this is blue colour");
             System.out.println(colour[4]+"this is cyan colour");
            System.out.println(colour[5]+"this is magnita colour");
            // Resetting color to default
        System.out.println("\033[0m"+"Back to default color.");
            fresher f=new fresher();
            System.out.println(colour[0]);
            f.dancer();
            System.out.print("\033[H\033[2J");//IT BASICALLY REMOVE ALL PREVIOUS OUTPUT OF THE PROGRAMME
            //NOTE-->H is used in order all the space of the previous output if not given it will remove all the
            //previous output but doesnot remove their space
            //System.out.flush();
           System.out.println( colour[1]);
           f.nameofdance();
        
    }
    
}
