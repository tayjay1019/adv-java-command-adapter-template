package templatemethod.bookreader;

import java.io.FileNotFoundException;

public abstract class BookReader {

    abstract void initialize();

    public final void readBook() throws FileNotFoundException {
        initialize();
        startReading();
        stopReading();
    }

    abstract void startReading() throws FileNotFoundException;

    abstract void stopReading();
}
