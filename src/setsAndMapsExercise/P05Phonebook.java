package setsAndMapsExercise;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class P05Phonebook {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Map<String, String> phonebook = new HashMap<>();
        String text = scanner.nextLine();

        while (!text.equals("search")) {

            String[] textParts = text.split("-");
            String name = textParts[0];
            String phoneNumber = textParts[1];
            phonebook.put(name, phoneNumber);


            text = scanner.nextLine();
        }
        String name = scanner.nextLine();

        while (!name.equals("stop")) {
            if (phonebook.containsKey(name)) {
                System.out.println(name + " -> " + phonebook.get(name));
            } else {
                System.out.printf("Contact %s does not exist.%n", name);
            }


            name = scanner.nextLine();
        }



    }
}
