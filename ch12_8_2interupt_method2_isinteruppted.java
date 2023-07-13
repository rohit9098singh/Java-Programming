class hero1 extends Thread{
    public void run()
    {
        System.out.println(Thread.currentThread().isInterrupted());/*HERE IT IS CALLED LIKE THIS BECAUSE IT IS NOT A STATIC METHOD
        INTERUPPTED WAS STATIC METHOD THAT IS WHY IS CALLED DIRECTLY BUT IT IS NOT A STATIC METHOD WILL BE CALLED LIKE THIS ONLY
        NOW WORKING-it is not going to change the interupted status it will be true only and will not allow to execute the programme
        rather will go to the exception block and if we print the status again it will be same only i.e true*/
        try{
            for(int i=0;i<5;i++)
            {
                System.out.println(i);
                System.out.println(Thread.currentThread().isInterrupted());/*IN PREVIOUS METHOD IT USE TO RETURN A DIFFERENT 
                BOOLEAN VALUE HERE SINCE IT USE TO ALTER THE ACTUAL BOOLEAN VALUE TO ALTER INTRUPT() FUNCTION BUT NOT HERE ITS ALWAYS
                RETURNS THE SAME BOOLEAN VALUE EVEN IT IS CALLED MULTIPLE TIME */
                Thread.sleep(1000);
                
            }
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }
}
public class ch12_8_2interupt_method2_isinteruppted {
    public static void main(String[] args) {
        hero1 h=new hero1();
        h.start();
        h.interrupt();
    }
    
}
