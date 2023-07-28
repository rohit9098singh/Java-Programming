class hclemployee
{
    private int  id;
    private String name;
    public hclemployee()
    {
        id=45;
        name="rahul";
        System.out.println("i am simple constructor without any overload method");
        System.out.println("here id of the unkown employee is "+id);
        System.out.println("the name of the unknown employee  "+name);
    }
    public hclemployee(int id,String name)
    {
       this.id=id;
       this.name=name;
    }
   /*  public void setname(String name)
    {
        this.name=name;
    }*/
    public String getname()
    {
        return name;
    }
    /*  public void setid(int id)
    {
        this.id=id;
    }*/
    public int getid()
    {
        return id;
    }
}
public class ch4_constructoroverloading {
    public static void main(String[] args) {
        hclemployee rahul=new hclemployee(1, "amit");
        System.out.println(rahul.getid());
        System.out.println(rahul.getname());

        hclemployee e=new hclemployee();
        
    }
    
}
