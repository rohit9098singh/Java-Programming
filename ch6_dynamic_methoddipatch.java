

class phone
{
    void showtime()
    {
        System.out.println("the time is 8 am now");
    }
    void on()
    {
       System.out.println("normal phone on's");
    }

}
class smartphone extends phone{
    void on()
    {
        System.out.println("smart phone on's");
    }
    void musicplayer()
    {
        System.out.println("playing music");
    }

}
public class ch6_dynamic_methoddipatch {

    public static void main(String[] args) 
    {
        phone obj=new smartphone();//we can make a object of the child with the refrece of parent class but  cannot make child class as reference for parent
        phone p=new phone();// allowed
        smartphone s=new smartphone();//allowed
       // smartphone sp=new phone;//not allowed just bz we cannot  call a simple as smartphone right but in above call we can call smartphone as phone
        obj.showtime();//allowed
        obj.on() ;//allowed
        //obj.musicplayer();//not allowed kyu ke refrence phone class ka hai ise khali hm overided method call karsakte hai
    }
    
}
