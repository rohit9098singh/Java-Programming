
public class ch11thread4 {
    public static void main(String[] args) {
        System.out.println("hello world i am your");
        System.out.println(Thread.currentThread().getName()+"thread");
        Thread.currentThread().setName("ROHIT");
        System.out.println("now i have manipulated the main thread name it is "+Thread.currentThread().getName());
    }

}
/*WE HAVEN'T CREATED ANY THREAD OVER HERE BZ ONE THREAD IS AUTOMATICALLY MADE BY JVM THAT IS MAIN THREAD */