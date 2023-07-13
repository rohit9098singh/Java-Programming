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
            System.out.println("the excetionn is "+e);
        }
    }
}
public class ch12_8_0intrupt_thread {
    public static void main(String[] args) throws InterruptedException {
        intrupptedthread_example i=new intrupptedthread_example();
        i.start();
        i.interrupt();//EK HE BAR EXECUTE KAETA HAI OR FIR INTERUPT KE VAJHA SE VO EXCEPTION BLOCK ME CHALA JATA HAI OR FIR MAIN KO EXECUTET KARAYEGA
        i.join();
        try
        {
            for(int j=0;j<5;j++)
            {
                System.out.println("main thread"+j);
                Thread.sleep(1000);

            }
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }
    
}
