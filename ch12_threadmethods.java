class mythread extends Thread
{
    public void run()
    {
        System.out.println("this task is performed by :"+Thread.currentThread().getName());
    }
}
public class ch12_threadmethods {
    public static void main(String[] args) {

        System.out.println(Thread.currentThread().getName());
         System.out.println(Thread.currentThread().isAlive());

        mythread t1=new mythread();
        t1.start();
        System.out.println(Thread.currentThread().isAlive());

        mythread t2=new mythread();
        t2.start();
        System.out.println(Thread.currentThread().isAlive());


         

    }
    
}
