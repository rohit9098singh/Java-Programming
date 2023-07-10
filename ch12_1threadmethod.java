class th extends Thread
{
    public void run()
    {
        if(Thread.currentThread().isDaemon())
        {
            System.out.println("deamon thread");
        }
        else 
        {
            System.out.println(Thread.currentThread().getName());
        }
    }
}
public class ch12_1threadmethod {
    public static void main(String[] args) {
        System.out.println("this is main thread");/*YOU HAVE COMPULSARY DO ANY WORK IN MAIN BZ U ARE MAKING A DEMON
                                                     THREAD AS IT PROVIDE SERVICE TO THE ONE IN WHOES BACKGROUND IT IS RUNNING
                                                      AGAR MAIN ME KUCH HOGA HE NHI TO VO SERVICE KISE PROVIDE KAREGA*/
        th t=new th();
        t.setDaemon(true);/*must always writen before start bz ince thread is started you cannot make it deamon */
        t.start();

    }
}
