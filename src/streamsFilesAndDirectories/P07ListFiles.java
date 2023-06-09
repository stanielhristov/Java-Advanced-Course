package streamsFilesAndDirectories;

import java.io.File;

public class P07ListFiles {
    public static void main(String[] args) {
        String folderPath = "C:\\Users\\uzer54654\\Desktop\\04. Java-Advanced-Files-and-Streams-Lab-Resources";

        File file = new File(folderPath);

        File[] nestedFiles = file.listFiles();

        for (File nestedFile : nestedFiles) {
            if (nestedFile.isFile()) {
                System.out.printf("%s: [%d]%n", nestedFile.getName(), nestedFile.length());
            }
        }
    }
}