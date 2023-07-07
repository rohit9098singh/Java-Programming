class employee
{
    void show(){
        System.out.println("this is an employee class");
    }
}
class product
{
    void show1(){
        System.out.println("this is a product class");
}
}
public class ch10_instanceof_oprator {
    public static void main(String[] args) {
        employee parag=new employee();
        boolean b= parag instanceof employee;// kya parag jo hai vo employee class ka instance hai ke nhi
        System.out.println(b);
        product keyboard=new product();
        boolean c=keyboard instanceof product;
        System.out.println(b);
    }
    
}
