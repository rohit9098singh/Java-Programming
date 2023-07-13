
 class hero extends Thread{
    public void run()
    {
        System.out.println(Thread.interrupted());/*ISKA KAM BASICALLY YE HOTA HAI KE YE AGAR THREAD INTRUPT HUA HAI TO EXECUTION
        BUT IS METHOD SE HOGA YE YE RETURN TO TRUE HE KAREG MAGAR APNA STATUS KO FALSE ME CONVERT KAR DEGA JISE COMPILER KO LAGEGA 
        KE THREAD KABHI INTERUPT HE NHI HUA THA IS LIYE INTRUPT KARWANE KA BAWAJUD BHI VO PURA EXECUTE HOGA PROGRAME*/
        try
        {
            for(int i=0;i<5;i++)
            {
                System.out.println(i);
                Thread.sleep(1000);
                System.out.println(Thread.interrupted());//NOW IT WILL RETURN FALSE SINCE IT HAS CAHNGED THE STATUS RIGHT
                                                         //TABHI TO WITHOUT INTERUPTION VO LOOP KE ANDAR AAYA NA
            }
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }
 }
 
 public class ch12_8_1interupt_method1_interuppted {
    public static void main(String[] args) {
        hero h=new hero();
        h.start();
        h.interrupt();
    }
   
}

/*NOTE-THAT THE MAIN FUNCTION OF THIS INTERUPPTED METHOD IS TO RISTRICT THE INTERRUPT() METHOD WORK */
