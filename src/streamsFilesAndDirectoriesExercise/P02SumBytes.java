package streamsFilesAndDirectoriesExercise;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;
import java.util.Scanner;

public class P02SumBytes {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);

        String pathToFile = "C:\\Users\\uzer54654\\Desktop\\04. Java-Advanced-Files-and-Streams-Exercises-Resources\\input.txt";
        long sum = 0;

        List<String> allLines = Files.readAllLines(Path.of(pathToFile));
        for (String line : allLines) {
            for (char symbol : line.toCharArray()) {
                sum += symbol;
            }
        }
        System.out.println(sum);
    }
}
