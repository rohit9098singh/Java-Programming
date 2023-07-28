class working
{
    int a=40;
    static int b=90;
    void dosomething()
    {
        this.a=400;
        this.b=800;
        System.out.println(a);
        System.out.println(b);
        
    }
}

public class ch3_thiskeyword_4 {
    public static void main(String[] args) {
        

        working w=new working();
        w.dosomething();
    }
}
