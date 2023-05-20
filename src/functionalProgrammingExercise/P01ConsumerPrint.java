package functionalProgrammingExercise;

import java.util.Scanner;
import java.util.function.Consumer;

public class P01ConsumerPrint {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        String[] inputData = input.split("\\s+");

        Consumer<String> printName = name -> System.out.println(name);

        for (String name: inputData) {
            printName.accept(name);
        }
    }
}
