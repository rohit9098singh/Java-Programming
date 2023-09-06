import java.util.*;
class student 
{
    String name;
    double marks[];
    public student(String name,double marks)
    {
      this.name=name;
      this.marks=marks;
    }
}
//Add your code for Class Student here
public class test{
 // Define the method getMax() here
 public static void main(String[] args) {
 Scanner sc = new Scanner(System.in);
 Student[] arr = new Student[3]; 
 for(int i = 0; i < 3; i++){
 String name = sc.next();
 double[] m = {sc.nextDouble(), sc.nextDouble(), sc.nextDouble()};
 arr[i] = new Student(name, m);
 }
 System.out.println(getMax(arr)); 
 }
}

