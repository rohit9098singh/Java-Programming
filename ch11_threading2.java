class mythread extends Thread
{
  public void run()/*this is the method that you need compulsorily to override when you are overridding  
                     thread class */
  {
    int i=0;
    while (i<20)
    {
      System.out.println("i am thread1 who is cooking");
      i++; 
    }
  }
}
class mythread1 extends Thread
{
  public void run()/*this is the method that you need compulsorily to override when you are overridding  
                     thread class */
  {
    int i=0;
    while(i<20)
    {
    System.out.println("i am thread2 who is chatting with dolly");
    i++;
    }
  }
}

public class ch11_threading2 {
    public static void main(String[] args) {
        mythread t=new mythread();
        t.start();/*for executing the run method we have to call the start method we cannot directly call the methods
                 inside the thread there is an internal codding done in start methids which automatically calls the run methods */
        mythread1 t1=new mythread1();
        t1.start();
    }

}
