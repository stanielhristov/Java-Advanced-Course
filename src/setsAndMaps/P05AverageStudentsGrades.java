package setsAndMaps;

import java.util.ArrayList;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class P05AverageStudentsGrades {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Map<String, ArrayList<Double>> students = new TreeMap<>();

        int count = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < count; i++) {
            String[] input = scanner.nextLine().split(" ");
            String student = input[0];
            double grade = Double.parseDouble(input[1]);

            students.putIfAbsent(student, new ArrayList<>());
            students.get(student).add(grade);
        }

        students.entrySet().stream().forEach(entry -> {
                    double sum = 0;
                    for (int i = 0; i < entry.getValue().size(); i++) {
                        sum += entry.getValue().get(i);
                    }
                    double avgSum = sum / entry.getValue().size();

                    System.out.print(entry.getKey() + " -> ");
                    entry.getValue().forEach(e -> System.out.printf("%.2f ", e));
                    System.out.printf("(avg: %.2f)%n", avgSum);
                });
    }
}
