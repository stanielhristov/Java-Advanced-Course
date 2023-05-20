package stacksAndQueuesExercise;

import java.util.ArrayDeque;
import java.util.Scanner;

public class P01ReverseNumbersWithAStack {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayDeque <String> stack = new ArrayDeque<>();

        String input = scanner.nextLine();
        String [] inputParts = input.split("\\s+");

        for (String number : inputParts) {

            stack.push(number);

        }

        while (!stack.isEmpty()) {
            System.out.print(stack.pop() + " ");
        }




    }
}
