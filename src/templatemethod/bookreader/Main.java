package templatemethod.bookreader;

public class Main {

    public static void main(String[] args) {
        BookReader book1 = new ReadFromFile();
        book1.readBook();

        BookReader book2 = new ReadFromArray();
        book2.readBook();
    }
}
