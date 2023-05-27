import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

public class StringDeck {
    public static void main(String[] args) {
        Deque<String> deck = new ArrayDeque<>();
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the string: ");
        String input = scanner.nextLine();

        String[] commands = input.split("\\s*\\+\\s*|\\s*\\*\\s*");
        for (String command : commands) {
            if (command.matches("[A-Z]")) {
                deck.offerFirst(command);
            } else if (command.matches("[a-z]")) {
                deck.offerLast(command);
            } else if (command.equals("+")) {
                String element = deck.pollFirst();
                if (element != null) {
                    System.out.println("Extracted from the beginning: " + element);
                }
            } else if (command.equals("*")) {
                String element = deck.pollLast();
                if (element != null) {
                    System.out.println("Extracted from the end: " + element);
                }
            }
        }

        scanner.close();
    }
}
