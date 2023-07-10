import java.util.Scanner;

public class ch1_array_count {
    private static final String Specialchar = null;
    private static final String Alphabet = null;

    public static void main(String[] args) {
        int alphabet = 0, num = 0, space = 0, specialchar = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("eneter your string");
        String st = sc.nextLine();

        int i = 0;
        while (i < st.length()) {
            char ch = st.charAt(i);
            {
                if (ch >='A' && ch <='Z' || ch >='a' && ch <='z') {
                    alphabet++;
                }

                else if (ch >= '0' && ch <= '9') {
                    num++;
                }
                 else if (ch == ' ') {
                    space++;
                }
                 else
                {
                    specialchar++;
                }    
            
            }
            i++;
        }    

            System.out.println("\nAlphabet letters: " + Alphabet);
            System.out.println("Number: " + num);
            System.out.println("Space: " + space);
            System.out.println("Special characters: " + Specialchar);
        
    }
}
