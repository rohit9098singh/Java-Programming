interface cycle
{ 
    /**public void move()  
    {
        System.out.println("cycle is in movememnt");
    }*/
    void applybreak();
    void increasespeed();
}
class herocycle implements cycle
{
    void blowhorn()
    {
        System.out.println("peeeee.........");
    }
    public void applybreak()
    {
        System.out.println("applying break for your safty");
    }
    public void increasespeed()
    {
        System.out.println("increasing speed because you are in highway");
    }
}
public class ch8_interference_1 {

    public static void main(String args[])
    {
        herocycle h=new herocycle();
        h.applybreak();
        h.blowhorn();
        h.increasespeed();
    }
}
