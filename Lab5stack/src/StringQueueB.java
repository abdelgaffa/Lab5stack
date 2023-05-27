import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class StringQueueB {
    public static void main(String[] args) {
        Queue<String> queue = new LinkedList<>();
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the lines (enter 'stop' to end): ");
        String line = scanner.nextLine();
        while (!line.equalsIgnoreCase("stop")) {
            queue.offer(line);
            line = scanner.nextLine();
        }

        int maxIndex = findMaxIndex(queue);
        cyclicShift(queue, maxIndex);

        System.out.println("Queue after cyclic shift:");
        while (!queue.isEmpty()) {
            String element = queue.poll();
            System.out.println(element);
        }

        scanner.close();
    }

    public static int findMaxIndex(Queue<String> queue) {
        int maxIndex = -1;
        int maxLength = -1;

        int index = 0;
        for (String element : queue) {
            if (element.length() > maxLength) {
                maxLength = element.length();
                maxIndex = index;
            }
            index++;
        }

        return maxIndex;
    }

    public static void cyclicShift(Queue<String> queue, int rotations) {
        for (int i = 0; i < rotations; i++) {
            String element = queue.poll();
            queue.offer(element);
        }
    }
}
