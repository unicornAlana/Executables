package org.vashonsd;

import java.io.InputStream;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;
import static java.util.concurrent.TimeUnit.SECONDS;

public class RockPaperScissors implements Executable {
    private String name;
    private String description;
    private String author;

    @Override
    public void start(InputStream is, PrintStream ps) throws InterruptedException {
        // uses an arraylist to give a list for the computer to pick randomly from
        ArrayList<String> plays = new ArrayList<>();
        plays.add("rock");
        plays.add("paper");
        plays.add("scissors");
        Scanner scan = new Scanner(System.in);

        String start;
        do {
            //adds a start part to the game
            ps.println("Welcome challenger, are you prepared to face me in Rock, Paper, Scissors?");
            SECONDS.sleep(1);
            ps.println("Remember, do NOT use capitals while playing against me");
            SECONDS.sleep(1);
            ps.println("Type \"start\" to begin");

            start = scan.nextLine();

        }
        while (!start.equals("start"));
        //makes a play again possible
        boolean stop = false;

        while(!stop ) {

            //gets players play
            ps.println("Enter rock, paper, or scissors: ");
            String play = scan.nextLine();

            //gets computer play
            Random r = new Random();
            int randomItem = r.nextInt(plays.size());
            String aiPlay = plays.get(randomItem);

            //compares computer's to player's plays
            if (play.equals("scissors") && aiPlay.equals("rock")) {
                ps.println("I play: " + aiPlay);
                SECONDS.sleep(1);
                ps.println("You have lost");

            } else if (play.equals("scissors") && aiPlay.equals("paper")) {
                ps.println("I play: " + aiPlay);
                SECONDS.sleep(1);
                ps.println("I have been defeated");
            }
            if (play.equals("paper") && aiPlay.equals("rock")) {
                ps.println("I play: " + aiPlay);
                SECONDS.sleep(1);
                ps.println("At long last, I have lost");

            } else if (play.equals("paper") && aiPlay.equals("scissors")) {
                ps.println("I play: " + aiPlay);
                SECONDS.sleep(1);
                ps.println("I emerge victorious");
            }

            if (play.equals("rock") && aiPlay.equals("scissors")) {
                ps.println("I play: " + aiPlay);
                SECONDS.sleep(1);
                ps.println("WHAT!");
                SECONDS.sleep(1);
                ps.println("You actually managed to win");
            }

            else if (play.equals("rock") && aiPlay.equals("paper")) {
                ps.println("I play: " + aiPlay);
                SECONDS.sleep(1);
                ps.println("Are you even trying to win?");
                SECONDS.sleep(1);
                ps.println("Better luck next time");
            }

            //easter egg
            else if (play.equals("sans")) {
                ps.println("Ah");
                SECONDS.sleep(1);
                ps.println("I appear to have been discovered");
                SECONDS.sleep(1);
                ps.println("░░░░░░░░░░░░░░░░██████████████████\n" +
                        "░░░░░░░░░░░░████░░░░░░░░░░░░░░░░░░████\n" +
                        "░░░░░░░░░░██░░░░░░░░░░░░░░░░░░░░░░░░░░██\n" +
                        "░░░░░░░░░░██░░░░░░░░░░░░░░░░░░░░░░░░░░██\n" +
                        "░░░░░░░░██░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░██\n" +
                        "░░░░░░░░██░░░░░░░░░░░░░░░░░░░░██████░░░░██\n" +
                        "░░░░░░░░██░░░░░░░░░░░░░░░░░░░░██████░░░░██\n" +
                        "░░░░░░░░██░░░░██████░░░░██░░░░██████░░░░██\n" +
                        "░░░░░░░░░░██░░░░░░░░░░██████░░░░░░░░░░██\n" +
                        "░░░░░░░░████░░██░░░░░░░░░░░░░░░░░░██░░████\n" +
                        "░░░░░░░░██░░░░██████████████████████░░░░██\n" +
                        "░░░░░░░░██░░░░░░██░░██░░██░░██░░██░░░░░░██\n" +
                        "░░░░░░░░░░████░░░░██████████████░░░░████\n" +
                        "░░░░░░░░██████████░░░░░░░░░░░░░░██████████\n" +
                        "░░░░░░██░░██████████████████████████████░░██\n" +
                        "░░░░████░░██░░░░██░░░░░░██░░░░░░██░░░░██░░████\n" +
                        "░░░░██░░░░░░██░░░░██████░░██████░░░░██░░░░░░██\n" +
                        "░░██░░░░████░░██████░░░░██░░░░██████░░████░░░░██\n" +
                        "░░██░░░░░░░░██░░░░██░░░░░░░░░░██░░░░██░░░░░░░░██\n" +
                        "░░██░░░░░░░░░░██░░██░░░░░░░░░░██░░██░░░░░░░░░░██\n" +
                        "░░░░██░░░░░░██░░░░████░░░░░░████░░░░██░░░░░░██\n" +
                        "░░░░░░████░░██░░░░██░░░░░░░░░░██░░░░██░░████\n" +
                        "░░░░░░░░██████░░░░██████████████░░░░██████\n" +
                        "░░░░░░░░░░████░░░░██████████████░░░░████\n" +
                        "░░░░░░░░██████████████████████████████████\n" +
                        "░░░░░░░░████████████████░░████████████████\n" +
                        "░░░░░░░░░░████████████░░░░░░████████████\n" +
                        "░░░░░░██████░░░░░░░░██░░░░░░██░░░░░░░░██████\n" +
                        "░░░░░░██░░░░░░░░░░████░░░░░░████░░░░░░░░░░██\n" +
                        "░░░░░░░░██████████░░░░░░░░░░░░░░██████████");

            }

            //checks for user input error
            else if (!play.equals("paper") && !play.equals("rock") && !play.equals("scissors") && !play.equals("sans")) {
                ps.println("You have entered a play against the rules, therefore I win.");
                SECONDS.sleep(1);
                ps.println("Next time follow the rules");
            }

            //loops code again if there is a tie
            if (play.equals(aiPlay)) {
                ps.println("I play: " + aiPlay);
                SECONDS.sleep(1);
                ps.println("Alas we draw");
                SECONDS.sleep(1);
                ps.println("Now Again");
                SECONDS.sleep(1);
                ps.print("");

            }

            //Adds a way to play again instead of starting over
            else {
                SECONDS.sleep(1);
                ps.println("Would you like to play again \nyes or no");
                String again = scan.nextLine();

                if (again.equals("no")) {
                    stop = true;
                }
            }

        }
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
