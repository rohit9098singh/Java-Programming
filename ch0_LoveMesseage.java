import java.util.concurrent.TimeUnit;

public class  ch0_LoveMesseage{
    public static void main(String[] args) throws InterruptedException {
        String name = "Dolly";

        String[] messageLines = {
            "     ❤️  ❤️",
            "   ❤️      ❤️",
            "  ❤️   ❤️   ❤️",
            "  ❤️       ❤️",
            "   ❤️     ❤️",
            "     ❤️ ❤️",
            "       ❤️",
        };

        String[] colors = {
            "\033[91m", // Red
            "\033[93m", // Yellow
            "\033[92m", // Green
            "\033[94m", // Blue
            "\033[95m", // Magenta
            "\033[96m", // Cyan
        };

        String loveMessage = "I want to meet you desperately, " + name + "!";

        int duration = 300; // Time interval for animation in milliseconds
        int colorIndex = 0;

        // Display the animated heart and pop-up message
        while (true) {
            // Clear console
            System.out.print("\033[H\033[2J");
            System.out.flush();

            // Change color for the heart and the message
            String color = colors[colorIndex];
            colorIndex = (colorIndex + 1) % colors.length;

            // Display the animated heart
            for (String line : messageLines) {
                System.out.println(color + line);
            }

            // Move the cursor up to overwrite the heart with the new frame
            System.out.print("\033[" + messageLines.length + "A");

            // Display the pop-up message
            System.out.println(color + loveMessage);
            System.out.flush();

            // Add a slight pause for the animation effect
            TimeUnit.MILLISECONDS.sleep(duration);
        }
    }
}
