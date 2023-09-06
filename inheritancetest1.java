import java.util.Scanner;
class Faculty{
 private String name;
 private double salary;
 public Faculty(String name, double salary) {
 this.name = name;
 this.salary = salary;
 }
 public double bonus(float percent){
 return (percent/100.0)*salary;
 }
 // Define method getDetails()
 public void getDetails()
 {
    System.out.println("name"+name+"salary"+salary);
 }
 // Override method getDetails(float percent)
 public void getDetails(float percent)
 {
    System.out.println("name"+name+"salary"+salary);
    System.out.println("bonus ="+bonus(percent));
 }
}
class Hod extends Faculty{
 private String personalAssistant;
 public Hod(String name, double salary, String pa) {
 super(name, salary);
 this.personalAssistant = pa;
 }
 
 // Override method getDetails()
 public void getDetails()
 {
    super.getDetails();
    System.out.println("personal Assistsnce="+personalAssistant);
 }
 // Override method bonus(float percent)
 public double bonus(float percent)
 {
    double oldval=super.bonus(percent);
    double newval=oldval-super.bonus(percent)*0.5;
    return newval;
 }
 // Override method getDetails(float percent)
 public void getDetails(float percent)
 {
    getDetails();
    System.out.println("bonus of the hod is"+bonus(percent));
 }
}
public class inheritancetest1{
 public static void main(String[] args) {
 Scanner sc=new Scanner(System.in);
 Faculty obj1 = new Faculty(sc.next(), sc.nextDouble());
 Faculty obj2 = new Hod(sc.next(), sc.nextDouble(), sc.next());
    obj1.getDetails();
   System.out.println("Bonus for obj1: " + obj1.bonus(10));
   obj2.getDetails();
   System.out.println("Bonus for obj2: " + obj2.bonus(10));
 }
}
