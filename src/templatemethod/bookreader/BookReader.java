package templatemethod.bookreader;

public abstract class BookReader {

    abstract void initialize();

    public final void readBook() {
        initialize();
        startReading();
        stopReading();
    }

    abstract void startReading();

    abstract void stopReading();
}
