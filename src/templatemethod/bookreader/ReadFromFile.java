package templatemethod.bookreader;

public class ReadFromFile extends BookReader {

    @Override
    void initialize() {
        // Modify this method to open the file prideprejudice.txt (included with project)
        System.out.println("Open an input file");
    }

    @Override
    void startReading() {
        // Modify this method to read lines from the file and print each line to standard output
        System.out.println("Loop writing out each record");
    }

    @Override
    void stopReading() {
        // Modify this method to close the file
        System.out.println("Close input file");
    }
}
