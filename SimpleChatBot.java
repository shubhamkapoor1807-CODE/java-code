import java.util.Scanner;

public class SimpleChatBot {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String message;

        System.out.println("===== SIMPLE CHAT BOT =====");

        while (true) {

            System.out.print("You: ");
            message = sc.nextLine();

            if (message.equalsIgnoreCase("hello")) {

                System.out.println("Bot: Hi!");

            } else if (message.equalsIgnoreCase("how are you")) {

                System.out.println("Bot: I Am Fine");

            } else if (message.equalsIgnoreCase("bye")) {

                System.out.println("Bot: Goodbye");
                break;

            } else {

                System.out.println("Bot: I Don't Understand");
            }
        }

        sc.close();
    }
}