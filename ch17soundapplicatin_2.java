import javax.sound.sampled.*;

class SoundUtil {
     private static AudioFormat getAudioFormat() {
        float sampleRate = 44100;
        int sampleSizeInBits = 8;
        int channels = 1;
        boolean signed = true;
        boolean bigEndian = false;
        return new AudioFormat(sampleRate, sampleSizeInBits, channels, signed, bigEndian);
    }

    public static void playSound(int frequency, int duration) {
        try {
            SourceDataLine line = (SourceDataLine) AudioSystem.getLine(new DataLine.Info(SourceDataLine.class, getAudioFormat()));
            line.open(getAudioFormat());
            line.start();

            int bufferSize = (int) (getAudioFormat().getFrameSize() * getAudioFormat().getFrameRate() * (duration / 1000.0));
            byte[] soundData = new byte[bufferSize];
            for (int i = 0; i < soundData.length; i++) {
                double angle = 2.0 * Math.PI * frequency * i / (int) getAudioFormat().getFrameRate();
                soundData[i] = (byte) (Math.sin(angle) * 127.0);
            }

            line.write(soundData, 0, soundData.length);

            line.drain();
            line.close();
        } catch (LineUnavailableException e) {
            e.printStackTrace();
        }
    }
}
    


abstract class YourStudent {
    abstract void dancer();

    public void place() {
        System.out.println("you are dancing in an auditorium");
    }

    abstract void nameofdance();
}

class Fresher extends YourStudent {
    public void dancer() {
        System.out.println("professional dancer");
    }

    public void nameofdance() {
        System.out.println("name of the dance form is = kathak");
    }
}


public class ch17soundapplicatin_2{
    private static void delay(int milliseconds) {
        try {
            Thread.sleep(milliseconds);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    private static void clearConsole() {
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }

    private static void printWithBeepAndDelay(String text, String color, int frequency, int duration) {
        System.out.print(color + text);
        SoundUtil.playSound(frequency, duration);
        delay(500);
    }

    public static void main(String[] args) {
        int duration = 300;
        int colourcode;
        String[] colour = {
            "\033[91m", // red
            "\033[92m", // green
            "\033[93m", // yellow
            "\033[94m", // blue
            "\033[95m", // cyan
            "\033[96m"  // magenta
        };

        printWithBeepAndDelay("this is red colour", colour[0], 1000, 100);
        clearConsole();
        
        printWithBeepAndDelay("this is green colour", colour[1], 1000, 100);
        clearConsole();
        
        printWithBeepAndDelay("this is yellow colour", colour[2], 1000, 100);
        clearConsole();
        
        printWithBeepAndDelay("this is blue colour", colour[3], 1000, 100);
        clearConsole();
        
        printWithBeepAndDelay("this is cyan colour", colour[4], 1000, 100);
        clearConsole();
        
        printWithBeepAndDelay("this is magenta colour", colour[5], 1000, 100);
        clearConsole();
        
        // Resetting color to default
        printWithBeepAndDelay("Back to default color.", "\033[0m", 1000, 100);
        clearConsole();
        
        Fresher f = new Fresher();
        printWithBeepAndDelay("professional dancer", colour[0], 1000, 100);
        clearConsole();
        
        printWithBeepAndDelay("name of the dance form is = kathak", colour[1], 1000, 100);
        clearConsole();
    }
}

