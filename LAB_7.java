class student
{
    static String collgename="acharya :";
    String name;
    int roll;
    public student(String name ,int roll )
    {
        this.name=name;
        this.roll=roll;
    }
    public void display()
    {
        System.out.println("college name="+collgename +"\nname = "+ name +"\nroll no = "+roll);
    }

}
public class LAB_7 {
    public static void main(String[] args) {
        System.out.println("object sharing static variable :collegename");
        student s=new student("rohit ", 39);
        student s1=new student("dolly" , 4);
        s.display();
        s1.display();

        System.out.println("static variable changed by one object");
        student.collgename="convent:";
        s.display();
        s1.display();

    }
    
}
