class test extends Thread
{
    public void run()
    {
        System.out.println("thrad is running");
    }
}
public class ch11_thread0 {
    public static void main(String[] args) {
        test t=new test();// 1)performing single task from single thread
        t.start();
        test t2=new test();// 2)performing the same task from multiple thread
        t2.start();
        /*
         * NOTE IF SOMEONE ASK HOW MANY THREADS ARE MADE TILL NOW SO THE ANSWER WILL 3 NOT 2 ONE
         * THREAD IS AUTOMAMTICALLY MADE BY THE JVM AND THE NAME OF IT IS MAIN THRHEAD
         */
          // 3)perfoming multiple task from single thread is not possible in java 
          // 4) performing multiple task from multiple thread is possible but for that diffrent class will have to be made 
          // which extends thread and has that many run methods
    }
    
}
