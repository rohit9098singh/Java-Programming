interface sample
{
    void meth1();
    void meth2();
}
interface derived extends sample
{
    void meth3();
    void meth4();
}
class morederived implements derived
{
   public void meth1()
   {
    System.out.println("we are the 1st method of the sample class");
   }
   public void meth2()
   {
    System.out.println("we are the 2nd method of the sample class");
   }
   public void meth3()
   {
    System.out.println("we are the 3rd method of the derived class");
   }
   public void meth4()
   {
    System.out.println("we are the 4th method of the derived class");
   }
}
/*a interface can impement the the interface method by means of (extends) keyword but when it comes to the class it implements the interface for its method
 */
public class ch8_interferenceinheritance2 {
    public static void main(String[] args) {
        morederived d=new morederived();
        d.meth1();
        d.meth2();
        d.meth3();
        d.meth4();
    }
    
}
