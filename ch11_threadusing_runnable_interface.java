class runnablethread implements Runnable
{

    @Override
    public void run() {
        System.out.println("my name is thread 1");
    }

}
class runnablethread1 implements Runnable
{
    public void run()
    {
     System.out.println("my name is thread 2");   
    }
}
public class ch11_threadusing_runnable_interface {
    public static void main(String[] args) 
    {
       runnablethread t1=new runnablethread();
       Thread t=new Thread(t1);
       t.start();
       
       runnablethread t2=new runnablethread();
       Thread s=new Thread(t1);
       s.start();
    }
    
}
/*while immplementing the runnable interface we cannot call directly the start method we can call it form the thread object only */
