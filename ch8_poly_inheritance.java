
    
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
    void pickcall()
    {
        System.out.println("connecting......");
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
        System.out.println("connecting :"+network);
    }
}
public class ch8_poly_inheritance{
    public static void main(String[] args) {
        myphone p=new myphone();
        String [] sr=p.getnetwork();
        for(String e:sr)
        {
            System.out.println(e);
        }
        p.connnectnetwork("vinod");
        p.record();
        p.takesnap();
        p.record4kvideo();
        /*here is only polymorphism which means that hum ek phone ko camaera ke taur pe use kar sakte hai
         * magar vo us waaqt whatsapp nhi use kar sakta kyuke us time pe usko uska right nhi hai isliye
         * vo sirf camera ke andar walle method ko implemet kar raha hai kise or ko karna cahahenge to vo error dega 
         * sabko excess karna ho to fir phone class ka hr object ban lo or agar seperate seperate karna ho to fir sabka 
         * respective object se he hoga         */
        mycamera c=new myphone();
        c.takesnap();
        
    
        };
        
    }
    


