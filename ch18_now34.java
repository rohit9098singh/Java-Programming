class teacher
{
    String name;
    double salary;
    teacher(String name,double salary)
    {
        this.name=name;
        this.salary=salary;
    }
    public void display1()
    {
        System.out.println("i am teacher class method and my name is "+name);
    }
    public void display3()
    {
        System.out.println("i am just the simple method3 of the techer class ");
    }
}
class procter extends teacher{
    int extra;
    procter(String name,double salary,int extra)
    {
      super(name,salary);
      this.extra=extra;
    }
    public void display1()
    {
       System.out.println("hii i am procter class method and my name is "+name);
    }
    public void dislay2()
    {
        System.out.println("salary of the procter is as follow"+salary);
    }

}
class hod extends procter{
    hod( String name,double salary,int extra)
    {
        super(name,salary,extra);
    }
    public void display3()
    {
      System.out.println("hii i am hod of bca department which is diaplaying your dislay method");
    }
}
class principal extends teacher{
    principal(String name,double salary)
    {
      super(name,salary);
    }
    public void display5()
    {
       int a=5;
       int b=4;
       int c=a+b;
       System.out.println("hii i am the principle of Acharya institute "+name);
       System.out.println("salary="+salary);
       System.out.println("the sum of the enterd number is "+c);
    }
}

public class ch18_now34
{
    public static void main(String[] args) {
        /* //Dynamic Method Dispatch = Ref SuperCls , Object creation of childClass
            if method is present in both class -> ChildClass method envoked
            if method is present only in refr cls -> refr cls method wll be envoked
           
    
           if method is defined only in the class whose obj creation at run time -> Erro
           DURING THE DYNAMIC MAETHD DISPATCH OBJECT OF THE CHILD CLASS IS CREATED WHICH IS WRIITEN AT RIGHT WITH THE HELP OF NEW 
           KEYWORD AND REFERNCE IS OF SUPER CLASS */
  

        System.out.println("====================FOR TEACHER OBJECT=============================");
        teacher t=new teacher("Madhav",20000000);
         t.display1();
         t.display3();
        
         System.out.println();
         System.out.println("==================dDYNAMIC MEMORY DISPATCH PROCTER OBJECT=========");
         teacher t1=new procter("rohit",400000,4000);
       //  t1.dislapy2();//it cannot invoke because it is not present the parent class and reason is---->during the compile time the memory is allocatd so since the object is created during the run the firstly there was no method
       //of dispaly2() in child class but will be there once the object is created dynamically... 
         t1.display3();
         t1.display1();
         System.out.println();
         System.out.println("===================HOD OBJECTS=====================================");
         procter p=new hod("RAMAKRISHNA HK",50000.56,4000);
         p.dislay2();
         p.display1();
         p.display3();
         System.out.println();
         System.out.println("===================PRINCIPAL OBJECTS================================");
         teacher t3=new principal("BILAWAL BHUTTO",500000);
         t3.display1();
         t3.display3();
        // t3.dsiplay5();//CANNOT DO THAT BECAUSE DISPLAY5() IS NOT PRESENT IN THE SUPER CLASS

          
        
    }
}