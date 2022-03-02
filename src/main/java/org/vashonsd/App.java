package org.vashonsd;

/**
 *
 */
public class App 
{
    public static void main( String[] args ) throws InterruptedException {
        Executable e = new RockPaperScissors();
        e.start(System.in, System.out);
    }
}
