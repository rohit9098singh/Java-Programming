class mygenerics<anydatatype>
{
    private anydatatype data;

    public void setdata(anydatatype data)
    {
        this.data=data;
    }
    public void display()
    {
        System.out.println(data);
    }
}
public class ch15_generics2 { 
    public static void main(String[] args) {

        mygenerics<Integer> g=new mygenerics<>();
        g.setdata(20);
        g.display();

        mygenerics<String> s=new mygenerics<>();
        s.setdata("dolly motii");
        s.display();
        
    }
    
}
