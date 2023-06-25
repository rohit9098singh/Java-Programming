class x
{
   public void methodA()
   {
      System.out.println("method of Class A");
   }
}
class y extends x
{
   public void methodB()
   {
      System.out.println("method of Class B");
   }
}
class z extends x
{
  public void methodC()
  {
     System.out.println("method of Class C");
  }
}
class D extends x
{
  public void methodD()
  {
     System.out.println("method of Class D");
  }
}  
public class ch5_hiearchicalinheritance {
    public static void main(String args[])
  {
     y obj1 = new y();
     z obj2 = new z();
     D obj3 = new D();
     //All classes can access the method of class A
     obj1.methodA();
     obj2.methodA();
     obj3.methodA();
     obj1.methodB();
     obj2.methodC();
     obj3.methodD();
  }
}

    
