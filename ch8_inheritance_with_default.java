/*When we say that interface methods are implicitly public, it means that the methods declared within an interface are automatically considered public by default.

This has implications for how these methods can be accessed and implemented. Here's what it means in reference to the interface:

Accessible from any implementing class: Any class that implements the interface can access the public methods declared within the interface. These methods are part of the contract defined by the interface, and implementing classes are required to provide an implementation for these methods.

Public access level: The public access modifier allows the methods to be accessed from any other class or interface within the same package or from any other package. This makes the interface methods widely accessible to other parts of the codebase.

Implementation requirement: Any class that implements the interface must provide a concrete implementation for all the public methods declared within the interface. Failure to do so will result in a compilation error. This ensures that the classes adhering to the interface contract will have the required behavior defined by those methods.

By having interface methods implicitly public, it promotes encapsulation and abstraction in object-oriented programming. Interfaces define a set of behaviors or services that can be implemented by different classes, and the public access level ensures that these behaviors are accessible and usable throughout the codebase.
 */


interface mycamera
{
    int a=80;
  void takesnap();
  void record();
  private void greet()//this cannot be accessed from any where but the  use is if our default code increses then we can write it in private method and call it in default method
  {
    System.out.println("gretting u with all good health");
  }
  default public void record4kvideo()
  {
    greet();//allowed to call this default method get invoked automatically
    System.out.println("recording in 4k ");
  }
}
interface mywifi
{
    String [] getnetwork();
    void connnectnetwork(String network);

}
class cellphone
{
    void cellno(int number)
    {
        System.out.println("connecting "+number);
    }
}
class myphone extends cellphone implements mycamera,mywifi
{
    @Override
    public void takesnap()
    {
        System.out.println("take a beautiful picture");
    }
    @Override
    public void record()
    {
        System.out.println("you have recording option");
    }
    @Override
    public String[] getnetwork()
    {
        System.out.println("gettig network list");
        String[] network={"remesh","vinod","aman"};
        return network;
    }
    @Override
    public void connnectnetwork(String network)
    {
        System.out.println("connecting"+network);
    }
}
public class ch8_inheritance_with_default {
    public static void main(String[] args) {
        myphone p=new myphone();
        String [] sr=p.getnetwork();
        for(String e:sr)
        {
            System.out.println(e);
        }
        p.record();
        p.takesnap();
        p.record4kvideo();
        System.out.println(myphone.a);//the variable that we declare in the interface are automatically consider as the final methods 
        /*and that methods can be called by two one by the object. and another by the class name but when we call by object name it shows a slight error
         * to avoid that we should call it by the name of the class
         */
       // mycamera c=new myphone();
        //c.takesnap();
        };
        
    }
    

