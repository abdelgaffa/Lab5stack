import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class StringQueue {
    public static void main(String[] args) {
        Queue<String> queue = new LinkedList<>();
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the string: ");
        String input = scanner.nextLine();

        String[] commands = input.split("\\s*\\*\\s*");
        for (String command : commands) {
            if (command.matches("[A-Z]")) {
                queue.offer(command);
            } else if (command.equals("*")) {
                String element = queue.poll();
                if (element != null) {
                    System.out.println("Dequeued: " + element);
                }
            }
        }

        scanner.close();
    }
}
