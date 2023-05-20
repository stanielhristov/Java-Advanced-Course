package setsAndMapsExercise;

import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class P03PeriodicTable {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int count = Integer.parseInt(scanner.nextLine());
        Set<String> uniqueElements = new TreeSet<>();

        for (int i = 0; i < count; i++) {
            String[] chemicalElements = scanner.nextLine().split("\\s+");

            for (String element: chemicalElements) {
                uniqueElements.add(element);
            }
        }

        for (String element:uniqueElements) {
            System.out.print(element + " ");
        }


    }
}
