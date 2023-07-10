class yielddemo extends Thread
{
    public void run()
    {
        //Thread.yield();
        for(int i=1;i<5;i++)
        {
            System.out.println(Thread.currentThread().getName()+"-"+i);
        }
    }
}
public class ch12_5yieldmethod {
    public static void main(String[] args) {
        yielddemo d=new yielddemo();
        d.start();
        Thread.yield();
        for(int i=0;i<5;i++)
        {
             System.out.println(Thread.currentThread().getName()+"-"+i);
        }
        
    }
    
}
/*stops the current executing thread and provide chance to the other thread for execution and the schedular may also 
 * totally ignore this request this all depends upon the schedular only
 */