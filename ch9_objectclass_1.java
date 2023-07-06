/*
OBJECT CALSS ARE PRESENT IN JAVA.LANG PACKAGE
EVERY CLASS IN JAVA IS DERIVED FROM THE OBJECT CLASS BECAUSE IT IS THE TOPMOST CLASS
EVERY CLASS IN JAVA EXTENDS THE OBJECT CLASS BUT IT IS NOT KNOWN TO DONE AUTOMATICLLY BY THE JVM
FIRST METHOD WE WILL SEE IS GETCLASS() METHOD WHICH  IS USED TO RETURN THE CLASS NAME OF THE OBJECT
SECOND IS THE HASHCODE() METHOD
THIRD IS THE TOSTRING() METHOD */
/*NOTE BUT IF I IMPLEMENT THOSE METHODS ON MY OWN SAY  */
public class ch9_objectclass_1 {
    public static void main(String[] args) {
        Object ob=new Object();//it belongs to  java.lang package
        ch9_objectclass_1 c=new ch9_objectclass_1();
        Integer i=new Integer(2);
       System.out.println(ob.getClass());
        System.out.println(c.getClass());
        System.out.println(i.getClass());
        System.out.println("");


        System.out.println("hash code of o="+ob.hashCode());
        System.out.println("hash code of c="+c.hashCode());
        System.out.println("hash code of i="+i.hashCode());
        System.out.println("");
        
        //GENERAL SYNTAX-getClass().getName() + '@' + Integer.toHexString(hashCode())
        System.out.println("string opration"+ob.toString());//OB.TOSTRING() METHOD AND DOWN OB METHOD BOTH PRINTS THE SAME THING 
        System.out.println("string opration"+ob);// IF WE DONT ATTACH THE TOSTRING METHOD JVAM AOUTOMATICALLY ATTACHES IT 
        System.out.println("string opration"+c.toString());
        System.out.println("string operation"+i.toString());
        
    }
    
}
