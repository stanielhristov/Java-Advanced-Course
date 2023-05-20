package setsAndMapsExercise;

import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

public class P01UniqueUsernames {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int count = Integer.parseInt(scanner.nextLine());
        Set<String> words = new LinkedHashSet<>();

        for (int i = 0; i < count; i++) {
            String text = scanner.nextLine();
            words.add(text);
        }

        for (String items:words) {
            System.out.println(items);
        }
    }
}
