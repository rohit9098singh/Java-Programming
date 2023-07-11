import java.util.ArrayList;
import java.util.Scanner;
import java.util.Collections;
public class ch14_2_ARRAYLIST_UNIQUEVAL {
    public static void main(String[] args) {
        ArrayList<Float> floatval=new ArrayList<>();
        Scanner sc= new Scanner(System.in);
        System.out.println("enter the number of elements ");
        int n=sc.nextInt();
        for(int i=0;i<n;i++)
        {
            System.out.println("enter the element"+i);
            float temp=sc.nextFloat();
            if(!floatval.contains(temp))/*WHAT IT IS DOING IS HUM JO VALUE ENTER KAR RAHE HAI SUPPOSE 1ST BAR ME HUMNE 1.2ENTER
                                         KARAYA IF WILL CHECK  THE IF CONDITION KE FLOATVAL VARIABLE ME KYA 1.2 PRESENT HAI 
                                         NHI HAI CONDITION FALSE HAI BUT EVALUATES TO TRUE BZ OF !OPERATOR AND CONTROL COMES INSIDE
                                         AND ADDS THE VALUE
                                         2)IN SECOND CONDITION SUPPOSE I ENTERD AGAIN 1.2 NOW WHAT HAPPENS IS IT AGAIN CHECK THE IF
                                         CONDITION SAYING THAT IF VARILBALE FLOATVAL KE ANDAR 1.2 EXIST KARTA HAI HA IS BAR KARTA HAI
                                         CONDTION TRUE HAI BUT THIS TIME IT AS EVALUATED TO FALSE BZ OF ! OPERATOR AND CONTROL DOES
                                         NOT COMES INSIDE AND THE DUPLICATE VALUES AND SKIPPED AND VICE VERSA*/
            {
                floatval.add(temp);
            }
        }
        Collections.sort(floatval);
        System.out.println(floatval);

    }
    
}
