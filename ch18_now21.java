class mansion
{
    String name,phoneno;  
    int id,salary;  
    public mansion(int id,String name,int salary, String phoneno)  
    { 
        this.salary=salary;  
        this.phoneno=phoneno;  
        this.id=id;  
        this.name=name;  
    } 
   public  mansion(int id,String phoneno)  
    { 
        this.id=id; 
        this.phoneno=phoneno; 
    } 
    public mansion(String name,int salary,String phoneno) 
    { 
        this.name=name; 
        this.salary=salary; 
        this.phoneno=phoneno; 
    } 
    public mansion(int id,String name,String phoneno) 
    {
        this.id=id;
        this.name=name;
        this.phoneno=phoneno;
    }
    public void display()
    {
        
        System.out.println(id+"\t\t"+name+"\t\t"+salary+"\t\t"+phoneno);
    }
}
public class ch18_now21 {
    public static void main(String[] args) {
        System.out.println("id\t\tname\t\tsalary\t\tphoneno");
        mansion s=new mansion(1,"ram",1000,"95724397");
        s.display();
        mansion s1=new mansion(2,"9572439");
        s1.display();
        mansion s2=new mansion("shyam",20000,"9572439");
        s2.display();
        mansion s3=new mansion(3,"10000","95724397");
        s3.display();
        
    }
    
}
