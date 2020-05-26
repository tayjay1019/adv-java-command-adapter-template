package templatemethod.bookreader;

import java.io.FileNotFoundException;

public class Main {

    public static void main(String[] args) throws FileNotFoundException {
        //BookReader book1 = new ReadFromFile();
        //book1.readBook();

        //BookReader book2 = new ReadFromArray();
        //book2.readBook();

        BookReader book3 = new ReadFromUser();
        book3.readBook();
    }
}
