/*NOTE GENERICS DOES NOT WORKS FOR LOWER CASE THAT IS WHY THEY ARE USED IN UPPER CASE WHILE SPECIFYING DURING OBJECT CREATION */



class printer <T>/*here T represent the type of thing that this printer is going to be hold and print */
{
    T thingstoprint;//here T represent the data type whic could bbe anythig and it will take also and thingstoprint is variable
    
    public  printer( T thingstoprint)
    {
        this.thingstoprint=thingstoprint;
    }
    public void print()
    {
        System.out.println(thingstoprint);
    }
}
public class CH15_1GENERICS {
    public static void main(String[] args) {
        printer <Integer> integerprinter= new printer<>(23);//IN THE ANGULAR BRACKET WE MSUT SPECIFY THAT IT IS TAKING AN INTEGER
        integerprinter.print();
        
        printer <Double> doubleprinter= new printer<>(32.1);
        doubleprinter.print();

        printer <String> stringprinter=new printer<>("rohit singh");
        stringprinter.print();

        printer <Float> floatprinter=new printer<>(76.45f);
        floatprinter.print();
    }
    
}
