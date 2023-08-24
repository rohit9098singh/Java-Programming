class PG
{
    String name;
    PG()
    {
        System.out.println("name = unknown");
    }
    PG(String name)
    {
        this.name=name;
        System.out.println("name ="+name);
    }

}
public class ch18_now22 {
    public static void main(String[] args) {
        PG s =new PG();
        PG s1=new PG("KUMAR SHANGAKARA");
        
    }
    
}
