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

public class Ch0_ColourCode_c {
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
        System.out.println(colour[1] + "this is green colour");
        System.out.println(colour[2] + "this is yellow colour");
        System.out.println(colour[3] + "this is blue colour");
        System.out.println(colour[4] + "this is cyan colour");
        System.out.println(colour[5] + "this is magenta colour");

        // Resetting color to default
        System.out.println("\033[0m" + "Back to default color.");

        Fresher f = new Fresher();
        System.out.println(colour[0]);
        f.dancer();

        // Play the sound after displaying the dance name
        SoundUtil.playSound(1000, 100);

       // System.out.print("\033[H\033[2J");
       // System.out.println(colour[1]);
        f.nameofdance();
    }
}


