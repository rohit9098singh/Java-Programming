class method extends Thread
{
    public void run()
    {
        System.out.println("this task is performed by :"+Thread.currentThread().getName());
    }
}
public class ch12_0threadmethods {
    public static void main(String[] args) {

        System.out.println(Thread.currentThread().getName()+" thread ");
         System.out.println("checking wheather main thread  is alive or not::  "+Thread.currentThread().isAlive());
         
        
        method t1=new method();
        t1.start();
        System.out.println("checking wheather thread-1 is alive or not::  "+Thread.currentThread().isAlive());
             

        method t2=new method();
        t2.start();
        System.out.println("checking wheather thread-2 is alive or not::  "+Thread.currentThread().isAlive());
        System.out.println("checking wheather thread-1 is alive or not::  "+t1.isAlive());



    }
    
}
         
