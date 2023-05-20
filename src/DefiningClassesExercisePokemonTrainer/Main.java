package DefiningClassesExercisePokemonTrainer;

import java.util.*;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String commandLine = scanner.nextLine();
        Map<String, List<Pokemon>> pokemonByTrainers = new LinkedHashMap<>();

        while (!commandLine.equals("Tournament")) {
            String[] commandData = commandLine.split("\\s+");
            Pokemon pokemon = new Pokemon(commandData[1], commandData[2], Integer.parseInt(commandData[3]));
            pokemonByTrainers.putIfAbsent(commandData[0], new ArrayList<>());
            pokemonByTrainers.get(commandData[0]).add(pokemon);

            commandLine = scanner.nextLine();
        }
        List<Trainer> trainerList = pokemonByTrainers.entrySet()
                .stream()
                .map(t -> new Trainer(t.getKey(), t.getValue()))
                .collect(Collectors.toList());


        String command = scanner.nextLine();
        while (!command.equals("End")) {


            for (Trainer trainer : trainerList) {
                trainer.commandExecuting(command);
            }
            command = scanner.nextLine();
        }

        trainerList.stream()
                .sorted(Comparator.comparingInt(Trainer::getNumberOfBadges).reversed())
                .forEach(System.out::println);
    }
}