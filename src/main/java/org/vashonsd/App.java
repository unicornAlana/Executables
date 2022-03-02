package org.vashonsd;

import java.io.InputStream;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 *
 */
public class App 
{
    public static Map<String, Executable> executables = new HashMap<>();
    static InputStream input;
    static PrintStream output;

    public static void main( String[] args )
    {
        input = System.in;
        output = System.out;
        addExecutable(new bruhleImpl());
        addExecutable(new HorridGame());
        addExecutable(new game());
        printOptions();
    }

    public static void printOptions() {
        for (Executable e : executables.values()) {
            output.println(e.getName()
                    + ": "
                    + e.getDescription()
                    + " (" + e.getAuthor() + ")");
        }
    }
    public static void addExecutable(Executable e) {
        executables.put(e.getName(), e);
    }
}
