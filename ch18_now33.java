class heroEmployee
{
    private String name;
    private double salary;
    public void setName(String name)
    {
        this.name=name;
    }
    public String getName()
    {
        return name;
    }
     public void setSalary(double d)
    {
        this.salary=d ;
    }
    public double getSalary()
    {
        return salary;
    }
    public double bonus(float percent)
     {
       return (percent/100.0)*salary ;
     }
}
class manager extends heroEmployee{
    private String secretary;
    public void  setsecretary(String  secretary)
    {
        this. secretary= secretary;
    }
    public String getsecretary()
    {
        return  secretary;
    }
    public double bonus(float percent)
    {
        double oldvalue=super.bonus(percent);
        double newvalue=oldvalue+(oldvalue*0.5);
        return newvalue;
    }
}
public class ch18_now33 {
    public static void main(String[] args) {
        heroEmployee e=new manager();
        e.setName("ROHIT SINGH");
        e.setSalary(30000.400);
        System.out.println(e.getName());
        System.out.println(e.getSalary());
        System.out.println(e.bonus(12.2f));
        

        manager m=new manager();
        m.setsecretary("KUMAR SANGAKARA");
        System.out.println(m.getsecretary());
         System.out.println(e.bonus(8.2f));


       
    }
    
}
/*Write Java code as instructed. 
• Define class Employee that has the following members:
– Private instance variables String empName, double salary
– Mutator methods to update the instance variables
– Accessor methods to access the instance variables 
– Method public double bonus(float percent) that returns the bonus computed as 
(percent/100.0)*salary 
• Define class EmpTest that has the main method and the following functionalities: 
– Create an Employee object
– Invoke mutator methods to set the values of name and salary 
– Invoke accessor methods to get the details of an Employee 
– Invoke method bonus(float percent) to get the bonus of an Employee
 */