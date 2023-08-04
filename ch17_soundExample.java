import javax.sound.sampled.*;

public class ch17_soundExample {
    public static void main(String[] args) {
        try {
            // Set the note frequency and duration
            int frequency = 1000;  // Frequency in Hertz (Hz)
            int duration = 100;    // Duration in milliseconds (ms)
            int pause = 500;       // Pause duration between beeps in milliseconds (ms)
            int numBeeps = 5;      // Number of beeps

            // Open a new audio line
            SourceDataLine line = (SourceDataLine) AudioSystem.getLine(new DataLine.Info(SourceDataLine.class, getAudioFormat()));
            line.open(getAudioFormat());
            line.start();

            // Generate the sound data
            int bufferSize = (int) (getAudioFormat().getFrameSize() * getAudioFormat().getFrameRate() * (duration / 1000.0));
            byte[] soundData = new byte[bufferSize];
            for (int beep = 0; beep < numBeeps; beep++) {
                for (int i = 0; i < soundData.length; i++) {
                    double angle = 2.0 * Math.PI * frequency * i / (int) getAudioFormat().getFrameRate();
                    soundData[i] = (byte) (Math.sin(angle) * 127.0);
                }
                // Play the sound
                line.write(soundData, 0, soundData.length);

                // Pause between beeps
                try {
                    Thread.sleep(pause);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }

            // Close the audio line
            line.drain();
            line.close();
        } catch (LineUnavailableException e) {
            e.printStackTrace();
        }
    }

    private static AudioFormat getAudioFormat() {
        float sampleRate = 44100;  // Samples per second
        int sampleSizeInBits = 8;  // 8 bits per sample
        int channels = 1;          // Mono
        boolean signed = true;     // Indicates whether the data is signed
        boolean bigEndian = false; // Indicates whether the data is stored in big-endian format

        return new AudioFormat(sampleRate, sampleSizeInBits, channels, signed, bigEndian);
    }
}
