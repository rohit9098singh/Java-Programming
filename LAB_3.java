public class LAB_3 {
    public static void main(String[] args) {
        int a=5;
        int b=0;
        try{
            System.out.println(a/b);
        }
        catch(ArithmeticException e)
        {
            System.out.println("division is not possible");
        }
    }
    
}
