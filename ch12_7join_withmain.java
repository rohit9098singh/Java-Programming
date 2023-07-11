class mainjoinexample extends Thread
{
   static Thread mainthread;
    public void run()
    {
        
        try
        {
        //mainthread.join();
          for(int i=0;i<5;i++)
          {
            System.out.println("child thread:"+i);
            Thread.sleep(1000);
          }
        }
        catch (Exception e)
        {
            System.out.println(e);
        }
    }
}
public class ch12_7join_withmain {
    public static void main(String[] args)  {
        // Thread.currentThread();
        mainjoinexample e1=new mainjoinexample();
        e1.start();
        
        try
        {
          e1.join();
          for(int i=0;i<5;i++)
          {
            System.out.println("main thread:"+i);
            Thread.sleep(1000);
          }
        }
        catch (Exception e)
        {
            System.out.println(e);
        }
    }
    
}
/*not working with the main method that is why uploaded to git hub means the main method should execute first */