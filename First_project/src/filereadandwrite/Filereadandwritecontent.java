package filereadandwrite;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Filereadandwritecontent {
    public static void main(String[] args) {
        String inputFile ="H:\\spring-selenium-workspace\\First_project\\src\\filereadandwrite\\input.txt";
        String outputFile="H:\\spring-selenium-workspace\\First_project\\src\\filereadandwrite\\output.txt";

        try {
            // Read file contents
            BufferedReader reader = new BufferedReader(new FileReader(inputFile));
            StringBuilder content = new StringBuilder();
            String line;
            while ((line = reader.readLine()) != null) {
                content.append(line).append("\n");
            }
            reader.close();

            System.out.println("Contents of " + inputFile + ":");
            System.out.println(content.toString());

            // Modify file contents
            String newContent = "This is the new content that will be written to the file.";
            BufferedWriter writer = new BufferedWriter(new FileWriter(outputFile));
            writer.write(newContent);
            writer.close();

            System.out.println("Successfully written new content to " + outputFile);
        } catch (IOException e) {
            System.out.println("An error occurred: " + e.getMessage());
        }
    }
}
