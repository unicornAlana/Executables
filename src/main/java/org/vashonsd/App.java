package org.vashonsd;

import java.util.Map;

/**
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Executable ex = new BasicGame(System.in, System.out);
        Thread runThread = new Thread(ex);
        runThread.start();
        try {
            runThread.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }
}
