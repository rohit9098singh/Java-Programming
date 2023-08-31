class myAcharya 
{
    private String name;
    private double salary;
   public myAcharya(String name,double salary)
    {
       this.name=name;
       this.salary=salary;
    }
    public void print()
    {
      System.out.println("name "+name);
      System.out.println("salary "+salary);
    }
    public void print(float percent)
    {
        print();
        System.out.println("bonus ="+bonus(percent));
    }
    public double bonus(float percent)
    {
        return (percent/100.0)*salary;
    }
}
class manager extends myAcharya{
    String secretary;
   public manager(String name,double salary,String secretary)
    {
      super(name,salary);
      this.secretary=secretary;
    }
    public void print()
    {
        super.print();
        System.out.println("secretary ="+secretary);
    }
    public void  print(float percent)
    {
        print();
        System.out.println("bonus ="+bonus(percent));

    }
    public double bonus(float percent)
    {
        double oldbonus=super.bonus(percent);
        double mbonus=(oldbonus)+oldbonus*0.5;
        return mbonus;
    
    }

}
public class ch18_now33 {
    public static void main(String[] args) {
        myAcharya obj1=new myAcharya("rohit singh", 400000);
        obj1.print();
        obj1.print(5.2f);
        myAcharya obj2=new myAcharya("romit", 500000);
        obj2.print();
        obj2.print(3.4f);
        System.out.println("=================MANAGER DETAIS======================");
        manager m=new manager("sachin",300000,"vishaka");
        m.print();
        m.print(2.4f);
        

    }
    
}
