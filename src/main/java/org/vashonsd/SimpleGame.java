package org.vashonsd;

import java.io.InputStream;
import java.io.PrintStream;

public class SimpleGame implements Executable {
    private String name;
    private String description;
    private String author;

    @Override
    public void start(InputStream is, PrintStream ps) {
        ps.println("You lose.");
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String getDescription() {
        return description;
    }

    @Override
    public String getAuthor() {
        return author;
    }
}
