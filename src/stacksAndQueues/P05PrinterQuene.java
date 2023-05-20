package stacksAndQueues;

import java.util.ArrayDeque;
import java.util.Scanner;

public class P05PrinterQuene {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayDeque<String> printerQueue = new ArrayDeque<>();
        String currentInput = scanner.nextLine();

        while (!currentInput.equals("print")) {
            if (currentInput.equals("cancel")) {
                String firstTask = printerQueue.poll();

                if (firstTask == null) {
                    System.out.println("Printer is on standby");
                } else {
                    System.out.println("Canceled " + firstTask);
                }
            } else {
                printerQueue.offer(currentInput);
            }

            currentInput = scanner.nextLine();
        }

        while (!printerQueue.isEmpty()) {
            System.out.println(printerQueue.poll());
        }
    }
}