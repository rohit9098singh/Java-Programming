class automatically{
    float a=12.00f;
    automatically()
    {
        System.out.println("now pick up your call please");
    }
}
class auto extends automatically
{
    //super.a--->helps us to call the variables methods of the parent class even  though if you have the same variable in 
    //child class by writing super only it means that you want the parent class object
    float a=2.00f;
    auto()
    {
        System.out.println("put your into silent mode since the timing is now "+super.a);
    }
}
public class ch3_superkeyword0 {
    public static void main(String[] args) {
        auto aut=new auto();
    }
    
}
