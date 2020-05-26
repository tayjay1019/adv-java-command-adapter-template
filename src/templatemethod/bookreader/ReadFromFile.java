package templatemethod.bookreader;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

public class ReadFromFile extends BookReader {
    private String filename;
    private File file;
    private Scanner keyboard = new Scanner(System.in);
    private Scanner inputFile;

    public ReadFromFile() throws FileNotFoundException {
    }

    @Override
    void initialize() {
        // Modify this method to open the file prideprejudice.txt (included with project)
        System.out.println("--Open an input file--");
        filename = "prideprejudice.txt";
        file = new File(filename);
    }

    @Override
    void startReading() throws FileNotFoundException {
        // Modify this method to read lines from the file and print each line to standard output
        System.out.println("--Loop writing out each record--");
        inputFile = new Scanner(file);
        while (inputFile.hasNext())
        {
            String line = inputFile.nextLine();
            System.out.println(line);
        }
    }

    @Override
    void stopReading() {
        // Modify this method to close the file
        System.out.println("--Close input file--");
        inputFile.close();
    }
}
