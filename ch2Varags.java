import java.util.Scanner;
public class ch2Varags {
    float average(float...arr)
    {
       float total =0;
       for(float e:arr)
       {
       total =total+e;
       }
    float average=total/arr.length;
    return average;
    }
    public static void main(String [] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("eneter how many elements do u want");
        int n=sc.nextInt();
        float arr[]=new float[n];
        System.out.println("eneter your elements");
        for(int i=0;i<n;i++)
        {
          arr[i]=sc.nextFloat();
        }
        ch2Varags obj= new ch2Varags();
       System.out.println("average is:"+obj.average(arr));
    }
    
}   
