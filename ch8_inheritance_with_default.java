interface mycamera
{
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
        
    }
    
}
