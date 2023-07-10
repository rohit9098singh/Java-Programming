class work extends Thread
{
    public void run()
    {
        System.out.println("the priority of this thread is :"+Thread.currentThread().getPriority());
    }
}
public class ch12_priority_thread {
    public static void main(String[] args) {
        work w= new work();
        w.start();
        System.out.println("main thread original priority :"+Thread.currentThread().getPriority());


        Thread.currentThread().setPriority(10);
        System.out.println("main thread changed priority:"+Thread.currentThread().getPriority());
    
    }
    
}
