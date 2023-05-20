package advancedExam;

import java.util.*;

public class P01ApocalypsePreparation {
    private static final int PATCH = 30;
    private static final int BANDAGE = 40;
    private static final int MEDKIT = 100;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int patchCount = 0;
        int bandageCount = 0;
        int medkitCount = 0;


        String[] textilesData = scanner.nextLine().split(" ");
        Deque<Integer> textiles = new ArrayDeque<>();
        for (String textile : textilesData) {
            textiles.offer(Integer.parseInt(textile));
        }

        String[] medicamentsData = scanner.nextLine().split(" ");
        Deque<Integer> medicaments = new ArrayDeque<>();
        for (String medicament : medicamentsData) {
            medicaments.push(Integer.parseInt(medicament));
        }

        while (!textiles.isEmpty() && !medicaments.isEmpty()) {
            Integer textile = textiles.poll();
            Integer medicament = medicaments.pop();
            int result = textile + medicament;

            if (result == PATCH) {
                patchCount++;
            } else if (result == BANDAGE) {
                bandageCount++;
            } else if (result >= MEDKIT) {
                medkitCount++;
                int diff = result - MEDKIT;
                if (diff > 0) {
                    medicaments.push(medicaments.pop() + diff);
                }
            } else {
                medicaments.push(medicament + 10);
            }

        }
        if (textiles.isEmpty() && medicaments.isEmpty()) {
            System.out.println("Textiles and medicaments are both empty.");
        } else if (textiles.isEmpty()) {
            System.out.println("Textiles are empty.");
        } else {
            System.out.println("Medicaments are empty.");
        }

        TreeMap<String, Integer> nameCounter = new TreeMap<>();
        nameCounter.put("Bandage", bandageCount);
        nameCounter.put("MedKit", medkitCount);
        nameCounter.put("Patch", patchCount);

        nameCounter.entrySet().stream()
                .sorted(Map.Entry.<String, Integer>comparingByValue().reversed().thenComparing(Map.Entry.comparingByKey()))
                .filter(entry -> entry.getValue() > 0)
                .forEach(entry -> System.out.println(entry.getKey() + " - " + entry.getValue()));

        if (!textiles.isEmpty()) {
            System.out.printf("Textiles left: %s%n", textiles.toString().replaceAll("\\[", "").replaceAll("\\]", ""));
        }

        if (!medicaments.isEmpty()) {
            System.out.printf("Medicaments left: %s%n", medicaments.toString().replaceAll("\\[", "").replaceAll("\\]", ""));
        }

    }
}
