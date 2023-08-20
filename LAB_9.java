import java.util.*;
class morningemployee
{
    String name;
    Date appdate;
    public morningemployee(String name,Date appdate)
    {
        this.name=name;
        this.appdate=appdate;
    }
    
    public void display()
    {
        System.out.println("EMPLOYEE NAME="+name+"\tAPPOINTMENT DATE="+appdate.getDate()+"/"+appdate.getMonth()+"/"+appdate.getYear());
    }
}
public class LAB_9 {
    public static void main(String[] args) {
        morningemployee e[]=new morningemployee[10];
        e[0]=new morningemployee("rohit",new Date(1999,12,12));
        e[1]=new morningemployee("aman",new Date(2000,4,21));
        e[2]=new morningemployee("mayank",new Date(2000,12,24));
        e[3]=new morningemployee("anirudh",new Date(2000,3,21));
        e[4]=new morningemployee("rohit",new Date(1989,10,12));
        e[5]=new morningemployee("rohan",new Date(2010,8,21));
        e[6]=new morningemployee("vineet",new Date(2099,12,12));
        e[7]=new morningemployee("vinod",new Date(2030,10,21));
        e[8]=new morningemployee("nishant",new Date(1902,1,30));
        e[9]=new morningemployee("naveen",new Date(2015,06,31));
        for(int i=0;i<e.length;i++)
        {
            e[i].display();  
        }
        for(int i=0;i<e.length;i++)
        {
            for(int j=i+1;j<e.length;j++)
            {
              if(e[i].appdate.after(e[j].appdate))
              {
                morningemployee t=e[i];
                e[i]=e[j];
                e[j]=t;


              }
            }
        }      
              System.out.println("List of employees seniority wise");
               for(int k=0;k<e.length;k++)
               {
              e[k].display();
               }

            }
        

    }
    

