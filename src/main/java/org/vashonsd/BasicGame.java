package org.vashonsd;

import java.io.InputStream;
import java.io.PrintStream;
import java.util.Scanner;

public class BasicGame extends Executable {
    InputStream input;
    PrintStream output;
    boolean running;

    public BasicGame(InputStream is, PrintStream ps) {
        super(is, ps);
    }

    @Override
    public void run() {
        System.out.println("Here we are!");
        output.println("Welcome to a very simple game.");
        boolean guessed = false;
        while(!guessed) {
            output.println("Try to guess my word! My word is 'swordfish.'");
            Scanner scan = new Scanner(input);
            if(scan.nextLine().equals("swordfish")) {
                guessed = true;
            }
        }
        output.println("Yes! 'Swordfish' is correct!");
        running = false;
    }

    @Override
    public void stop() {
        output.println("Goodbye!");
        running = false;
    }

    @Override
    public boolean isRunning() {
        return running;
    }

    @Override
    public String getName() {
        return "Demo";
    }

    @Override
    public String getDescription() {
        return "A simple game to show functionality.";
    }

    @Override
    public String getAuthor() {
        return "AJ";
    }


}
