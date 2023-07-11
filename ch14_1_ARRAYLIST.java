import java.util.ArrayList;
import java.util.Collections;
public class ch14_1_ARRAYLIST {
    public static void main(String[] args) {
        ArrayList <Integer> integers=new ArrayList<>();
        //ADDING
        integers.add(1);
        integers.add(2);
        integers.add(3);
        integers.add(4);
        System.out.println(integers);
        System.out.println();
        
        
        //ADDING AT PARTICULAR INDEX
        System.out.println("performing the adding at particular index operation");
        integers.add(1,5);
        integers.add(0,8);
        System.out.println(integers);
        System.out.println();
        

        //GETTING THE INDEX OF THE ELEMENT
        System.out.println("perfoming the getting elment operation");
        System.out.println("element at index 0 ="+integers.get(0));
         System.out.println("element at index 0 ="+integers.get(4));
          System.out.println();
        
          //REPLACING THE ELEMENTS
          System.out.println("performing the replace operation");
         integers.set(1,20);
          integers.set(3,30);
          System.out.println(integers);
          System.out.println();
        
        // REMOVING THE ELEMETS
         System.out.println("performing remove");
        integers.remove(1);//by index
        integers.remove(2);//we can also do it by name since it is a integers type it is taking as index only
        System.out.println(integers);
        System.out.println();
        
       //REMOVING EVERYTHING 
       System.out.println("removing everything ");
        integers.clear();
        System.out.println(integers);
        System.out.println();
        
       //SORTING OF THE ELEMENTS IN ARRAYLIST
       
        System.out.println(integers);
        Collections.sort(integers);
        System.out.println(integers);
        
        
        

    }
    
}
