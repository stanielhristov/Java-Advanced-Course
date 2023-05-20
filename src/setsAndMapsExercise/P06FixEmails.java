package setsAndMapsExercise;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class P06FixEmails {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String command = scanner.nextLine();
        Map<String, String> emailsData = new LinkedHashMap<>();

        while (!command.equals("stop")) {
            String email = scanner.nextLine();
            emailsData.put(command, email);



            command = scanner.nextLine();
        }

        emailsData.entrySet().removeIf(entry -> entry.getValue().endsWith("uk") || entry.getValue().endsWith("us") || entry.getValue().endsWith("com"));

        emailsData.entrySet().forEach(entry -> System.out.println(entry.getKey() + " -> " + entry.getValue()));



    }
}
