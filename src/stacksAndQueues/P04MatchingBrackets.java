package stacksAndQueues;

import java.util.ArrayDeque;
import java.util.Scanner;

public class P04MatchingBrackets {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayDeque<Integer> indexes = new ArrayDeque<>();

        String input = scanner.nextLine();

        for (int i = 0; i < input.length() ; i++) {
            if (input.charAt(i) == '(') {
                indexes.push(i);
            } else if (input.charAt(i) == ')') {
                int openBracketIndex = indexes.pop();


                String expression = input.substring(openBracketIndex, i + 1);
                System.out.println(expression);
            }
        }
    }
}
