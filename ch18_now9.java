class example{
    String name="rahul";
    int a,b;
    public void add(int a, int b)
    {
        System.out.println(+(a+b));
    }
    public int additon(int a ,int b)
    {
        return a+b;
    }
    public void display()
    {
        System.out.println("name="+name);
    }
}
public class ch18_now9 {
    public static void main(String[] args) {
        example e =new example();
        e.add(10,20);
        e.add(20,30);
        e.display();
    }
    
}
