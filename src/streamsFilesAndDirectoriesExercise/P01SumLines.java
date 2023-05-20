package streamsFilesAndDirectoriesExercise;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

public class P01SumLines {
    public static void main(String[] args) throws IOException {

        String pathToFIle = "C:\\Users\\uzer54654\\Desktop\\04. Java-Advanced-Files-and-Streams-Exercises-Resources\\input.txt";
        List<String> allLines = Files.readAllLines(Path.of(pathToFIle));


        for (String lines:allLines) {
            int sum = 0;
            for (char symbol:lines.toCharArray()) {
                sum += (int) symbol;
            }
            System.out.println(sum);
        }
    }
}
