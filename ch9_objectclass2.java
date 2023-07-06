class laptop
{
   String model;
   int price;
   laptop(String model,int price)
   {
    this.model=model;
    this.price=price;
   }

   
}
public class ch9_objectclass2 {
    public static void main(String[] args) {
        
    
    laptop l=new laptop("lenova",40000);
    laptop l2=new laptop("hp",40000);
    boolean result=l.equals(l2);
    System.out.println(result);/*NOTE THAT THIS DOES NOT GIVE THE REQUIRED ANSWER THAT WE NEED 
                                 THAT IS HERE IT RETURNS A FALSE VALUE INSTED OF TRUE VALUE SO TO
                                 RESOLVE THAT WE WILL BE MAKING A EQUALS() METHOD AND MAKE A FORCEFULLY
                                 CONVERSITION WHICH WE WILL SEE IN NEXT PROGRAMME */
    
    }
}
