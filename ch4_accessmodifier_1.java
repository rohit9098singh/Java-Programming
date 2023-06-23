class staff
{
    private int id;
    private String name;
    public void setname(String n)
    {
       name=n;  
    }
    public String getname()
    {
        return name;
    }
    public void setid(int i)
    {
        id=i;
    }
    public int getid()
    {
        return id;
    }
}
public class ch4_accessmodifier_1 {
    public static void main(String[] args)
{
    staff st=new staff();
    /*  st.id=54;    
    st.name="rohit"*/// both gives an error since the id and name are the pjrivate members cannot be accessed directly without a method

    st.setid(+1);
    st.setname("rohit");
    System.out.println(st.getid());
    System.out.println(st.getname());
}
    
}
