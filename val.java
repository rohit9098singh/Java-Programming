public class val{
public static void main(String[] args) {
    Object ob=new Object();
    Integer value=new Integer(3);
    val op=new val();
    
    System.out.println("the class of ob  is="+ob.getClass());

    
    System.out.println("the class of ob  is="+op.getClass());
    
    System.out.println("the class of ob  is="+value.getClass());


    System.out.println("hash code of ob"+ob.hashCode());
    System.out.println("hash code of value"+value.hashCode());
    System.out.println("hash code op"+op.hashCode());

    System.out.println("string operation of the ob "+ob.toString());
    System.out.println("string operation of the ob "+ob);
    System.out.println("string operation of the ob "+value.toString());
    System.out.println("string operation of the ob "+op.toString());


    System.out.println("equlas method used "+ob.equals(ob));
    System.out.println("equlas method used "+op.equals(ob));
    System.out.println("equlas method used "+value.equals(ob));






}
}