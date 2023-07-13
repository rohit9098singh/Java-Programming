class medical extends Thread
{
    public void run()
    {
        try 
        {
            System.out.println("start memdical procedure");
            Thread.sleep(1000);
            System.out.println("medical completed");
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }
}
class drivingtest extends Thread{
    public void run()
    {
        try
        {
            System.out.println("start driving");
            Thread.sleep(2000);
            System.out.println("driving  test completed");
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }
} 
    class officersigh extends Thread{
        public void run()
        {
          try{
            System.out.println("officers takes the file ");
            Thread.sleep(3000);
            System.out.println("officers completes the signature and returns the file");
          }
          catch(Exception e)
          {
            System.out.println(e);
          }
    }

    }
public class ch12_6jointhread_2 {
    public static void main(String[] args) throws InterruptedException {//throws added because of join method
        medical m=new medical();
        m.start();
        m.join(1000,250);
        drivingtest d= new drivingtest();
        d.start();
        d.join(2000,250);
        officersigh s=new officersigh();
        s.start();
    }
    
}
