class diff_employee
{
    int id;
    int salary;
    String name;
    public void printdetials()
    {
        System.out.println("id is :"+id);
    }
    public String getname()
    {
        return name;
    }   
    public void setname(String n)
    {
       name=n;
    }
    public void setsalary(int n)
    {
        salary=n;
    }
    public int getsalary()
    {
        return salary;
    }

}
public class ch3_oops4 {
    public static void main(String[] args)
    {
      diff_employee e1=new diff_employee();
      e1.setname("rohit singh");
      e1.setsalary(10000);
      System.out.println(e1.getname());
      System.out.println(e1.getsalary());
    }
    
}
