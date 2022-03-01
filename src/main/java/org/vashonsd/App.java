package org.vashonsd;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        //Executable e = new SimpleGame();
        //e.start(System.in, System.out);

        Executable g= new HorridGame();
        g.start(System.in, System.out);
    }
}
