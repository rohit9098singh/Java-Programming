class buddy
{
    private String name;
    private int id;
    private int salary;

buddy()
{
    id=12;
    salary=40000;
    name="from acharya";
}
buddy(int salary,int id,String name)
{
    this.id=id;
    this.name=name;
    this.salary=salary;
}
public void setid(int id)
{
    this.id=id;
}
public int getid()
{
    return id;
}
public void setname(String name)
{
    this.name=name;
}
public String getname()
{
    return name;
}
public void setsalary(int salary)
{
    this.salary=salary;
}
public int getsalary()
{
    return salary;
}

public class ch4_ovreloadedconstructor {
    public static void main(String[] args) {
        buddy b1=new buddy(40000,1,"hello world");
         System.out.println(b1.getid());
        System.out.println(b1.getsalary());
        System.out.println(b1.getname());
    }
    

    
 }
} 
