import java.util.concurrent.TimeUnit;

public class  ch0_LoveMesseage{
    public static void main(String[] args) throws InterruptedException {
        String name = "Dolly";

        String[] messageLines = {/*The line String[] messageLines declares a variable named messageLines of type 
            String array (i.e., String[]). This array can hold multiple strings, and each element in the array 
            will be of type String.The purpose of this line in the program is to declare a variable that can store an array of strings. 
            String[] messageLines = new String[5];
                     OR
            String[] messageLines = new String[3];
            messageLines[0] = "Hello,";
            messageLines[1] = "How are you?";
            messageLines[2] = "Have a great day!";*/
            "     dolly  dolly",
            "   dolly      dolly",
            " dolly  dolly   dolly",
            "  dolly       dolly",
            "   dolly     dolly",
            "     dolly dolly",
            "       dolly ",
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

        int duration = 300; /*  Time interval for animation in milliseconds No, the two variables duration
         and colorIndex are not prebuilt or predefined in Java. They are regular variables that the programmer 
        has declared and initialized with specific values in the code. */
        int colorIndex = 0;

        // Display the animated heart and pop-up message
        while (true) {
            // Clear console
            System.out.print("\033[H\033[2J");/* is used to clear the console screen. It uses ANSI escape
             codes to send specific control sequences to the terminal. */
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
