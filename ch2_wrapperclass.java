public class ch2_wrapperclass {
    public static void main(String[] args) {
        int myint=4;
        float myfloat=4.56f;
        boolean flag=true;
        
        //AUTOBOXING
        Integer autoboxingint=myint;
         float autoboxingfloat=myfloat;
          boolean autoboxingboolean=flag;

        //autounboxing

        int a=autoboxingint;
        float b=autoboxingfloat;
        boolean c=autoboxingboolean;
         
        //printing all
        System.out.println("Primitive int: " + myint);
        System.out.println("Primitive float: " + myfloat);
        System.out.println("Primitive boolean: " + flag);

        System.out.println("Autoboxed Integer: " + autoboxingint);
        System.out.println("Autoboxed float: " + autoboxingfloat);
        System.out.println("Autoboxed Boolean: " + autoboxingboolean);

        System.out.println("Auto-unwrapped int: " + a);
        System.out.println("Auto-unwrapped double: " + b);
        System.out.println("Auto-unwrapped boolean: " + c);
        
    }
    
}
