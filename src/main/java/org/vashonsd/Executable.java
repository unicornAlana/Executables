package org.vashonsd;

import java.io.InputStream;
import java.io.PrintStream;

public abstract class Executable implements Runnable {
    InputStream input;
    PrintStream output;
    boolean running;
    String name;
    String description;
    String author;

    public Executable(InputStream is, PrintStream ps) {
        input = is;
        output = ps;
        running = true;
    }

    public abstract void stop();

    public boolean isRunning() {
        return running;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public String getAuthor() {
        return author;
    }
}
