class goodemployee
{
    int id;
    int salary;
    String name;
    public void printdetails()
    {
      System.out.println("the enterd id is :"+id);
      System.out.println("the eneterd name is :"+name);
    }
    int get_salary()
    {
        return salary;
    }
}
public class ch3_oops3 {

    public static void main(String[] args)
    {
      goodemployee e1=new goodemployee();
      goodemployee e2=new goodemployee();
      goodemployee e3=new goodemployee();
      e1.id=1;
      e1.name="nishnat";
      e1.salary=20000;
      e1.printdetails();
      int s1=e1.get_salary();
      System.out.println("the salary of "+e1.name+" is " +s1);

      e2.id=2;
      e2.name="nisha";
      e2.salary=30000;
      e2.printdetails();
      int s2=e1.get_salary();
      System.out.println("the salary of "+e2.name+" is " +s2);

      e3.id=3;
      e3.name="tisha";
      e3.salary=40000;
      e3.printdetails();
      int s3=e1.get_salary();
      System.out.println("the salary of "+e3.name+" is " +s3);
      
      

    }

}
