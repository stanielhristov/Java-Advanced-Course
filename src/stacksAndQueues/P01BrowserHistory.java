package stacksAndQueues;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

public class P01BrowserHistory {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Deque<String> history = new ArrayDeque<>();

        String currentCommand = scanner.nextLine();

        while (!currentCommand.equals("Home")) {
            if (currentCommand.equals("back")) {
                if (history.isEmpty() || history.size() == 1) {
                    System.out.println("no previous URLs");

                    currentCommand = scanner.nextLine();
                    continue;
                }

                history.pop();
            } else {
                history.push(currentCommand);
            }

            System.out.println(history.peek());

            currentCommand = scanner.nextLine();

        }
    }
}
