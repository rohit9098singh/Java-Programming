class thoseStudent
{
    String name;
    double salary;
    thoseStudent(String name,double salary)
    {
        this.name=name;
        this.salary=salary;
    }
    thoseStudent(thoseStudent e)
    {
        this.name=e.name;
        this.salary=e.salary; 
    }
    public void display()
    {
        System.out.println(name+"\t\t"+salary);
    }

}
public class ch18_now31 {
    public static void main(String[] args) {
        System.out.println("name\t\tsalary");
        thoseStudent s=new thoseStudent("rahul",345000.0);
        s.display();
        thoseStudent s1=new thoseStudent(s);
        s1.display();
    }
    
}
