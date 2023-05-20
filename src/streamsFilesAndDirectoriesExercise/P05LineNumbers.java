package streamsFilesAndDirectoriesExercise;

import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;
import java.util.Scanner;

public class P05LineNumbers {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);

        String pathToFile = "C:\\Users\\uzer54654\\Desktop\\04. Java-Advanced-Files-and-Streams-Exercises-Resources\\inputLineNumbers.txt";
        List<String> allLines = Files.readAllLines(Path.of(pathToFile));

        PrintWriter writer = new PrintWriter("output_line_numbers.txt");
        int lineNumber = 1;
        for (String line: allLines) {
            writer.println(lineNumber + " " + line);
            lineNumber++;
        }
        writer.close();
    }
}
