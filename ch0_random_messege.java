import java.util.Random;

public class ch0_random_messege {
    public static void main(String[] args) {
        String[] messages = {
            "Hello!",
            "How are you?",
            "Have a great day!",
            "What's up?",
            "Enjoy your weekend!",
            "Good luck!",
            "Take care!"
        };
        
        // Create an instance of the Random class
        Random random = new Random();
        
        // Generate a random index within the range of the messages array
        int index = random.nextInt(messages.length);
        
        // Get the random message
        String randomMessage = messages[index];
        
        // Print the random message
        System.out.println(randomMessage);
        
            
    }
}

