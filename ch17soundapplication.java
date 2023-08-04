
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
/*getAudioFormat() method:

This method returns an AudioFormat object, which describes the characteristics of the audio data to be played.
It configures the audio format with a sample rate of 44100 samples per second (Hz), a sample size of 8 bits, a single audio 
channel (mono), signed data (values can be positive and negative), and data stored in little-endian format.
playSound(int frequency, int duration) method:

This method generates a simple sine wave sound of a given frequency and duration using the specified audio format.
It opens a SourceDataLine, which is used to play audio data, with the configured audio format.
It calculates the necessary buffer size to store the sound data based on the given duration.
It generates the sound data by creating a sine wave for the given frequency and populates the sound data array.
It writes the sound data to the SourceDataLine, plays the sound, and then closes the line after playing the sound.
If any issues occur during the process, it prints the stack trace of the exception.
In summary, the SoundUtil class provides a method to play simple sine wave sounds of a given frequency and duration using 
the SourceDataLine and the specified audio format. The getAudioFormat method helps configure the desired audio format for the sound playback.*/
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

 public class ch17soundapplication {
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

        System.out.println(colour[0] + "this is red colour");
        SoundUtil.playSound(1000, 100);
        delay(500);

       // clearConsole();
        System.out.println(colour[1] + "this is green colour");
        SoundUtil.playSound(1000, 100);
        delay(500);

       // clearConsole();
        System.out.println(colour[2] + "this is yellow colour");
        SoundUtil.playSound(1000, 100);
        delay(500);

       // clearConsole();
        System.out.println(colour[3] + "this is blue colour");
        SoundUtil.playSound(1000, 100);
        delay(500);

       // clearConsole();
        System.out.println(colour[4] + "this is cyan colour");
        SoundUtil.playSound(1000, 100);
        delay(500);

       // clearConsole();
        System.out.println(colour[5] + "this is magenta colour");
        SoundUtil.playSound(1000, 100);
        delay(500);

        // Resetting color to default
       // clearConsole();
        System.out.println("\033[0m" + "Back to default color.");
        SoundUtil.playSound(1000, 100);
        delay(500);

       // clearConsole();
        Fresher f = new Fresher();
        System.out.print(colour[0]);
        f.dancer();
        SoundUtil.playSound(1000, 100);
        delay(500);

       // clearConsole();
        System.out.println(colour[1]);
        f.nameofdance();
        SoundUtil.playSound(1000, 100);
        delay(500);

       // clearConsole();
    }
}
