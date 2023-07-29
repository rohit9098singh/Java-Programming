class kgfmines
{
    public int id;//instance variable
    public String name;
    kgfmines(int id,String name)//passed argument are the local variable
    {
        this.id=id;//id=id
        this.name=name;
    }
    void showfunction()
    {
        System.out.println("the enterd id is "+id);
        System.out.println("the eneted name is "+name);
    }
}
public class ch3_thiskeyword_3 {
    public static void main(String[] args) {
        kgfmines kgf=new kgfmines(1, "rahul");
        kgf.showfunction();
    }
    
}
