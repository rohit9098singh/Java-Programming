class joinexample extends Thread
{
  public void run()
  {
    try 
    {
        for(int i=0;i<5;i++)
        {
            System.out.println(Thread.currentThread().getName()+":"+i);
            Thread.sleep(2000);
        }
    }
    catch(Exception e)
    {
        System.out.println(e);
    }
  }
}
public class ch12_6jointhread_method {
    public static void main(String[] args) throws Exception {
        joinexample e=new joinexample();
        e.start();
        e.join();
        try 
    {
        for(int i=0;i<5;i++)
        {
            System.out.println(Thread.currentThread().getName()+":"+i);
            Thread.sleep(2000);
        }
    }
    catch(Exception r)
    {
        System.out.println(r);
    }


        
    }
    
    
}
/*join is attched with that object which  we want to execute first like here we wanted to execute the thread 0 first
 * so we attched join with that only
 */
