package setsAndMapsExercise;

import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

public class P02SetsOfElements {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] lengthOfSets = scanner.nextLine().split(" ");
        int firstSetLength = Integer.parseInt(lengthOfSets[0]);
        int secondSetLength = Integer.parseInt(lengthOfSets[1]);

        Set<Integer> numbersOfFirstSet = new LinkedHashSet<>();
        Set<Integer> numbersOfSecondSet = new LinkedHashSet<>();

        for (int i = 0; i < firstSetLength; i++) {
            int number1 = Integer.parseInt(scanner.nextLine());
            numbersOfFirstSet.add(number1);
        }

        for (int i = 0; i < secondSetLength; i++) {
            int number2 = Integer.parseInt(scanner.nextLine());
            numbersOfSecondSet.add(number2);
        }

        numbersOfFirstSet.retainAll(numbersOfSecondSet);

        numbersOfFirstSet.forEach(number -> System.out.print(number + " "));


    }
}
