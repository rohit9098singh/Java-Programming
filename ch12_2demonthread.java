class demonexamlpe implements Runnable
{
    public void run()
    {
        int i=0;
        while(i<10)
        {
            try
            {
            System.out.println("demon thread executing here ");
            Thread.sleep(1000);
            }
            catch(Exception e)
            {
                System.out.println(e);
            }
        }
        System.out.println("demon thread task is over");
    }
}
public class ch12_2demonthread {
    public static void main(String[] args) {
        demonexamlpe d =new demonexamlpe();
        Thread t=new Thread(d);
        t.setDaemon(true);
        t.start();

        for(int i=0;i<5;i++)
        {
            try{
                System.out.println("main thread task");
                Thread.sleep(1000);
                System.out.print(+i+":");
            }
                  catch(Exception e)
            {
                System.out.println(e);
            }
            
        }
        System.out.println("main thread task is over");

    }
    
}
