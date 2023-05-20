package DefiningClassesExerciseOpinionPoll;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Person> peopleList = new ArrayList<>();
        int peopleCount = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < peopleCount; i++) {
            String[] input = scanner.nextLine().split("\\s+");
            String name = input[0];
            int age = Integer.parseInt(input[1]);

            Person person = new Person(name, age);
            peopleList.add(person);

        }
        peopleList = peopleList.stream().filter(person -> person.getAge() > 30).collect(Collectors.toList());

        peopleList.sort(Comparator.comparing(person -> person.getName()));

        for (Person person: peopleList) {
            System.out.println(person.toString());
        }
    }
}
