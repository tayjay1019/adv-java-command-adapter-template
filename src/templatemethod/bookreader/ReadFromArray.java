package templatemethod.bookreader;

public class ReadFromArray extends BookReader {

    private Franky theBook;

    @Override
    void initialize() {
        theBook = new Franky();
    }

    @Override
    void startReading() {
        theBook.outputBook();
    }

    @Override
    void stopReading() {

    }
}
