public class ch18_now26 {
    public static void main(String[] args) {
        int a=1;

        if (System.out.printf("Hello, World!\n") == null)
    {
      System.out.println("this block never gets executed as condition inside the if block never satisfy");
    }
        
    }
}
/*on commimg to println its return type is void but printf returns printstream
 * therefore printf returns the object of printstream and in condition we are checking that wheather it is null or not which will always be a false
 */