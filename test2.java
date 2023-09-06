import java.util.*;
class Employee24{
 String name;
 String[] projects;
 public Employee24(String name,String[] projects)
 {
    this.name=name;
    this.projects=projects;
 }
 public Employee24(Employee24 e)
 {
    this.name=e.name;
    this.projects=e.projects;
 }
//***** Define constructor(s) here
 public void setName(String n) {
 name = n;
 }
 public void setProject(int index, String proj) {
 projects[index] = proj;
 }
 public String getName() {
 return name;
 }
 public String getProject(int indx) {
 return projects[indx];
 }
}
public class test2 {
 public static void main(String[] args) {
 Scanner sc = new Scanner(System.in);
 String[] proj = {"PJ1", "PJ2", "PJ3"};
 Employee24 e1 = new Employee24("Surya", proj);
 Employee24 e2 = new Employee24(e1);
 e2.setName(sc.next());
 e2.setProject(0, sc.next());
 System.out.println(e1.getName() + ": " + e1.getProject(0));
 System.out.println(e2.getName() + ": " + e2.getProject(0));
 }
}
