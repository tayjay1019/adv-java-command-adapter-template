package templatemethod.bookreader;

import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class ReadFromUser extends BookReader {
    private boolean exit = false;
    Scanner keyboard = new Scanner(System.in);
    private ArrayList<String> readList = new ArrayList<>();

    @Override
    void initialize() {
        System.out.print("Please type until done/ type 'EXIT' to stop\n>");
        do {
            String temp = keyboard.nextLine();
            if(temp.equals("EXIT")){
                exit = true;
            } else {readList.add(temp);
            System.out.print(">");}
        } while (!exit);
    }

    @Override
    void startReading() throws FileNotFoundException {
        for (int i = 0; i < readList.size(); i++)
        {
            System.out.println(readList.get(i));
        }
    }

    @Override
    void stopReading() {

    }
}
