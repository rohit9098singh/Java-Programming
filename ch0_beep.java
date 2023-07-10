import java.awt.Toolkit;

public class ch0_beep {
    public static void main(String[] args) {
        int durationInSeconds = 60;
        int beepDelayInMillis = 1000; // 1 second

        long endTime = System.currentTimeMillis() + (durationInSeconds * 1000);

        while (System.currentTimeMillis() < endTime) {
            Toolkit.getDefaultToolkit().beep();
            try {
                Thread.sleep(beepDelayInMillis);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}