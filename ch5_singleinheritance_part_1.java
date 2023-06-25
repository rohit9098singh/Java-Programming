class parent
{
    int x;
    public void setx(int x)
    {
       this.x=x;    
    }
    public int getx()
    {
        return x;
    }
    public void print()
    {
        System.out.println("i am in parent class right now");
    }
}    
   class child extends parent
   {
      int  y;
      public void sety(int y)
    {
       this.y=y;    
    }
    public int gety()
    {
        return y;
    }
    public void printme()
    {
        System.out.println("i child class right now");
    }

   } 


public class ch5_singleinheritance_part_1 {
    public static void main(String[] args) {
       child children=new child();
       children.setx(6);
       children.sety(12);
       System.out.println("the value of x "+children.getx());
       children.print();
       System.out.println("the value of y is "+children.gety());
       children.printme();       


    }
    
}
