class staff2
{
    private int id;
    private String name;
    public staff2()
    {
        id=45;
        name="DOLLY MOTTI";
    }
    public void setid(int i)
    {
        this.id=i;
    }
    public int getid()
    {
        return id;
    }
    public String getname()
    {
        return name;
    }   
    public void setname(String n)
    {
       this.name=n;
    } 
}
public class ch4_constructor 
{
    public static void main(String[] args)
    {
    staff2 man=new staff2(); 
    System.out.println(man.getid());
    System.out.println(man.getname());
    }


}
