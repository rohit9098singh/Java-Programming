import java.util.ArrayList;
import java.util.Scanner;
import java.util.Collections;
public class CH14_3ARRAYLIST_FUN {
    public static void main(String[] args) {
        ArrayList <Integer> integers=new ArrayList<>();
        Scanner sc=new Scanner(System.in);
         
        while(true)
         {
            System.out.println("\nENTER YOUR CHOICE\n1:ADD\n2:REMOVE\n3:REPLACE\n4:sort\n5:delete_everything\n6:display\n7:exit");
             int choice=sc.nextInt();
             System.out.println("*************");

          switch(choice)
             {
                case 1:
                {
                   System.out.println("enter the number of element you want to add");
                   int n=sc.nextInt();
                   for(int i=0;i<n;i++)
                     {
                       System.out.println("enter your "+i+"element");
                       int s=sc.nextInt();
                       integers.add(s);
                    
                     }
                     System.out.println(integers);
                      break;
                }
                case 2:
                {
                    System.out.println("enyter the element you want to remove");
                    int e=sc.nextInt();
                    if(integers.contains(e))
                    {
                        integers.remove(Integer.valueOf(e));
                    } 
                    else
                    {
                        System.out.println("elemet not found");
                    }   
                        System.out.println(integers);
                        break;
                    
                }
                case 3:
                {
                    System.out.println("enter the index u want to replace");
                    int ind=sc.nextInt();
                    System.out.println("enter the value u want to replace");
                    int val=sc.nextInt();
                    integers.set(ind,val);
                    

                }
                case 4:
                {
                    Collections.sort(integers);
                    System.out.println(integers);
                }
                case 5:
                {
                    integers.clear();
                    System.out.println(integers);
                    
                }
                case 6:
                {
                    System.out.println("LIST"+integers);
                }
                case 7:
                {
                  System.out.println("*******thanks for using*******");
                }
                
            }
            if(choice==7)
            {
                break;
            }
             


        }
        
    

    }
 }
    

