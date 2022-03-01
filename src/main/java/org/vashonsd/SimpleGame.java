package org.vashonsd;

import java.io.InputStream;
import java.io.PrintStream;
import java.util.Scanner;

public class SimpleGame implements Executable {
    private String name;
    private String description;
    private String author;

    @Override
    public void start(InputStream is, PrintStream ps) {
        Scanner scan = new Scanner(is);
        ps.println("What would you like to say?");
        String response = scan.nextLine();
        ps.println(response + " is a fine thing to say.");
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
