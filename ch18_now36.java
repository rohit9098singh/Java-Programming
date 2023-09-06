class conventEmolyee
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
    public void setSalary(double salary)
    {
        this.salary=salary;
    }
    public double getSalary()
    {
        return salary;
    }
    public double bonus(float percent)
    {
        return (percent/100.0)*salary;
    }
}
class manager extends conventEmolyee
{
    private String secretary;
    public void display()
    {
        System.out.println("i am in manager class");
    }
    public void setSecretary(String name)
    {
        this.secretary=secretary;
    }
    public String  getSecretary()
    {
        return secretary;
    }
    public double bonus(float percent)
    {
        return super.bonus(percent)*1.5;//1.5 because 0.5*0.5=2.5
    }
}
class director extends manager{
    public void display()
    {
        System.out.println("i am director of the college");
    }
}
public class ch18_now36 {
    public static void main(String[] args) {
        conventEmolyee e=new manager();
        e.setName("AMANDEEP SINGH");
        e.setSalary(150000.5f);
        System.out.println(e.getName()+"\n"+e.getClass());

        manager m=new manager();
        m.setSecretary("RAJEEV SINGH");
        m.setName("AMAN SINGH");
        m.setSalary(40000f);
        System.out.println(m.getName()+"\n"+m.getSecretary()+"\n"+m.getSalary());
        
        conventEmolyee c=new manager();
        c.setName("ramesh");
        c.setSalary(3000f);
        




    }
    
}
/*1 //1. Write Java code as instructed. 
2 //• Define class Employee that has the following members.
3 //– String name, double salary as private instance variables 
4 //– Mutator methods to update the instance variables of an Employee 
5 //– Accessor methods to access the instance variables of an Employee
6 //– Method public double bonus(float percent) that returns the bonus 
7 //computed as (percent/100.0)*salary 
8 //• Define class Manager that extends class Employee and has the 
9 //following members.
10 //– String secretary as private instance variable 
11 //– Mutator method to update the instance variable
12 //– Accessor method to access the instance variable 
13 //– Override public double bonus(float percent) that returns the bonus 
14 //of a Manager as 50 percent extra bonus than a regular employee 
15 //• Define class InheritanceTest that has the main method.
16 //– Create object obj1 of Manager using an Employee class reference 
17 //variable – Mutator methods to set the values of name and salary –
18 //Create object obj2 of Manager using an Manager class reference 
19 //variable – Mutator method to set the value of secretary for obj2 –
20 //Accessor methods for name and salary using obj1 – Invoke method 
21 //bonus(float percent) using obj1 – Accessor method of secretary using 
22 //obj2 */