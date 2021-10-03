import java.util.Random;
import java.util.Scanner;

public class RockPaperScissors {

    public static void main(String[] args) {

        // a bit of setup
        Scanner myScanner = new Scanner(System.in);
        Random randomiser = new Random();
        int anotherGame = 1;
        System.out.println("This program lets you play Rock Paper Scissors with the computer.");

        while (anotherGame == 1) {

            System.out.println("How many rounds would you like to play?");

            int rounds = 0;
            boolean runningSmoothly = false;

            while (!runningSmoothly) {
                try {
                    String input = myScanner.nextLine();
                    rounds = Integer.parseInt(input);
                } catch (NumberFormatException ex) {
                }
                if (rounds < 1 || rounds > 10) {
                    System.out.println("Input must be an integer between 1 and 10");
                    System.out.println("How many rounds would you like to play?");
                } else {
                    runningSmoothly = true;
                }
            }

            System.out.println("Grand, " + rounds + " it is then!");

            int playerWinCount = 0;
            int playerLossCount = 0;
            int playerDrawCount = 0;

            for (int i = 0; i < rounds; i++) {
                System.out.println("Round " + (i + 1) + ":");
                System.out.println("1. Rock");
                System.out.println("2. Paper");
                System.out.println("3. Scissors");

                int playerAnswer = 0;
                runningSmoothly = false;

                while (!runningSmoothly) {
                    try {
                        String input = myScanner.nextLine();
                        playerAnswer = Integer.parseInt(input);
                    } catch (NumberFormatException ex) {
                    }
                    if (playerAnswer < 1 || playerAnswer > 3) {
                        System.out.println("Input must be an integer between 1 and 3; try again!");
                    } else {
                        runningSmoothly = true;
                    }
                }
                // playerAnswer is now in {1,2,3}

                int computerAnswer = randomiser.nextInt(3) + 1;     // random number in {1,2,3}

                if (computerAnswer == 1) {
                    System.out.println("The computer chose Rock");
                } else if (computerAnswer == 2) {
                    System.out.println("The computer chose Paper");
                } else {
                    System.out.println("The computer chose Scissors");
                }

                if ((playerAnswer == 1 && computerAnswer == 2) || (playerAnswer == 2 && computerAnswer == 3) || (playerAnswer == 3 && computerAnswer == 1)) {
                    playerLossCount++;
                    System.out.println("You lost!");
                } else if (playerAnswer == computerAnswer) {
                    playerDrawCount++;
                    System.out.println("You drew!");
                } else {
                    playerWinCount++;
                    System.out.println("You won!");
                }
                System.out.println("");
            }

            System.out.println("Overall, you won " + playerWinCount + " round(s), you drew " + playerDrawCount + " round(s), and you lost " + playerLossCount + " round(s).");
            if (playerWinCount == playerLossCount) {
                System.out.println("This game ended in a draw!");
            } else if (playerWinCount > playerLossCount) {
                System.out.println("You won this game!");
            } else {
                System.out.println("You lost this game :(");
            }

            System.out.println("Would you like to play again?");
            System.out.println("1. Again!");
            System.out.println("2. No thanks!");

            runningSmoothly = false;

            while (!runningSmoothly) {
                try {
                    String input = myScanner.nextLine();
                    anotherGame = Integer.parseInt(input);
                } catch (NumberFormatException ex) {
                }
                if (anotherGame < 1 || anotherGame > 2) {
                    System.out.println("Input must either 1 or 2; try again!");
                } else {
                    runningSmoothly = true;
                }
            }

            if (anotherGame == 1) {
                System.out.println("Let's play another game then.");
            } else {
                System.out.println("Thanks for playing!");
            }
        }

    }

}

