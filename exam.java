
import java.util.ArrayList;
import java.util.Scanner;

public class exam {
    public static void main(String[] args) {
        ArrayList<Integer> integers = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter the number of elements you want to add");
        int n = sc.nextInt();
        
        for (int i = 0; i < n; i++) {
            System.out.println("Enter your " + (i + 1) + " element");
            int s = sc.nextInt();  
            integers.add(s);
        }
        
        System.out.println("Enter the element you want to remove");
        int e = sc.nextInt();
        if (integers.contains(e)) {
            integers.remove(Integer.valueOf(e));
        } else {
            System.out.println("Element not found");
        }
        
        System.out.println(integers);
        
        System.out.println("Enter the index you want to replace");
        int ind = sc.nextInt();
        
        if (ind >= 0 && ind < integers.size()) {
            System.out.println("Enter the value you want to replace");
            int val = sc.nextInt();
            integers.set(ind, val);
        } else {
            System.out.println("Invalid index");
        }
        
        // Print the updated ArrayList
        System.out.println("Updated ArrayList:");
        for (int i = 0; i < integers.size(); i++) {
            System.out.println("Element " + i + ": " + integers.get(i));
        }
    }
}
 
