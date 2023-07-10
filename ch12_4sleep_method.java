/*NOTE THAT SLEEP METHOD IS BEING EXTENDED FROM ANOTHER LANGUAGE THEREFORE IT THROWS AN EXCEPTION SO 
 * WE WRITE IT INDIDE TRY CATCH BLOCK
 */
class sleepexample extends Thread {
    public void run() {
        int i = 0;
        try {
            System.out.println(Thread.currentThread().getName());
            for (i = 0; i < 5; i++) {
                Thread.sleep(1000);
                System.out.println(i);
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}

public class ch12_4sleep_method {
    public static void main(String[] args) {
        sleepexample e = new sleepexample();
        e.start();
        
           /*  try {
                System.out.println(Thread.currentThread().getName());
        
                 for(int i=0;i<4;i++)
                  {
                     {
                       Thread.sleep(1000);
                       System.out.println(i);
                     }
                  }  
            }
             catch (Exception r)
             {
                System.out.println(r);
            
             }*/
        
    }

}
