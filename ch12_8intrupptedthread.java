class intrupptedthread_example extends Thread
{
    public void run()
    {
        try 
        {
            for(int i=0;i<5;i++)
            {
                System.out.println("child thread :"+Thread.currentThread().getName());
                Thread.sleep(1000);

            }
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }
}
public class ch12_8intrupptedthread {
    public static void main(String[] args) {
        intrupptedthread_example i=new intrupptedthread_example();
        i.start();
        try
        {
            for(int j=0;j<5;j++)
            {
                i.interrupt();
                System.out.println("main thread"+j);
                Thread.sleep(500);

            }
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }
    
}
