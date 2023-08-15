class encap_example
{
    private String name;
    private int id;
    public void setid(int id)
    {
        this.id=id;
    }
    public int getid(){
        return id;
    }
    public void setname(String name)
    {
        this.name=name;
    }
    public String getname(){
        return name;
    }
}
public class ch3_oops6_termilogy_encapsilation {
    public static void main(String[] args) {
        encap_example e=new encap_example();
        e.setid(34);
        System.out.println("the id of the entered person is::"+e.getid());
        e.setname("ram chandra singh");
        System.out.println("the name of the person is ::"+e.getname());

    }
    
}
