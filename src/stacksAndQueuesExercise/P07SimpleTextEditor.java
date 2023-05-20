package stacksAndQueuesExercise;

import java.util.ArrayDeque;
import java.util.Scanner;

public class P07SimpleTextEditor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        StringBuilder currentText = new StringBuilder();
        ArrayDeque <String> textStack = new ArrayDeque<>();

        for (int command = 1; command <= n ; command++) {
            String commandInput = scanner.nextLine();

            if (commandInput.startsWith("1")) {
                textStack.push(currentText.toString());
                String textToAppend = commandInput.split("\\s+")[1];
                currentText.append(textToAppend);
            } else if (commandInput.startsWith("2")) {
                textStack.push(currentText.toString());
                int count = Integer.parseInt(commandInput.split("\\s+")[1]);
                int startIndex = currentText.length() - count;
                currentText.delete(startIndex, currentText.length());
            } else if (commandInput.startsWith("3")) {
                int position = Integer.parseInt(commandInput.split("\\s+")[1]);
                System.out.println(currentText.charAt(position - 1));
            } else if (commandInput.startsWith("4")) {
                if (!textStack.isEmpty()) {
                    String last = textStack.pop();
                    currentText = new StringBuilder(last);
                }
            }
        }

    }
}
