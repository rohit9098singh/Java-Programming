class total_earning extends Thread
{
    int total=0;
    public void run()
    {
        synchronized(this)
        {
        for(int i=1;i<=10;i++)
        {
            total=total+100;

        }
        this.notify();//2nd step-aapna kam kar ke vo notify kar dega main ko  invoke hone ke liye
    }
    }
}
public class ch12_wait_notify_meth {
    public static void main(String[] args) throws InterruptedException {
        total_earning t1=new total_earning();
        t1.start();/*WHAT IS EXPECTED IS THAT OUR THREAD CLASS SHOULD EXECUTE AND LOOP SHOULD CONTINUE TILL 10 AND RETURN 1000
        BUT THIS DOES NOT HAPPENS WHAT HAPPENS IS THE MAIN CLASS OUR MADE THREAD BOTH ARE CREATED SIMULTENOUSLY SO BY THE TIME 
        OUR THREAD 0 IS EXECUTING THE TASK MAIN WILL EXECUTE THE PRINT STATEMENT IN THE MAIN BLOCK AND AS A RESULT WE WILL BE GETTING
        0 INSTED OF 1000 SO WE NEED TO CREAT SOME METHOD WILL WILL PAUSE THE MAIN THREAD STSTEMENT TILL THE THREAD 0 IS PERFORMING 
        IT TASK AND AFTER ITS COMPILITION IT SHOULD INVOKE AUTOMATICALLY */
        synchronized(t1)
        {
            t1.wait();//1st step-yaha aate he main thread waiting state me chala jayega
        System.out.println("total earning is ="+t1.total);//3rd step-aab main invoke hoke isko execute karwayega
        }
    }
}
