import java.util.Scanner;

public class Game {

    boolean theUserWon;

    //Initialising the Constructor
    Game() throws Exception {

        theUserWon = getResult();

    }

    private boolean getResult() throws Exception {

        //Giving 10 attempts to player
        StringBuilder rightLetters = new StringBuilder(" ");
        StringBuilder wrongLetters = new StringBuilder();
        int wrongLettersCounter = 0;
        int mistakesAllowed = 9;

        //Getting a random movie
        MovieSelection selectedMovieSelection = new MovieSelection();
        String MovieSelection = selectedMovieSelection.movieSelection;

        //Introduction to the Game
        System.out.println("Welcome to my Game: Guess The Movie!");
        System.out.println("The rules are simple, the computer randomly picks up a movie title from the file.");
        System.out.println("You have to try to figure out the movie by guessing one letter at a time.");
        System.out.println("If you are unable to guess the movie in 10 try(s), you lose!");
        System.out.println("Press enter when you have guessed the whole movie!");
        System.out.println("Let's get Started, Good Luck!");
        System.out.println();

        while (wrongLettersCounter <= mistakesAllowed) {

            String revealTheMovie = MovieSelection.replaceAll("[^" + rightLetters + "]", "_ ");
            System.out.println("The Movie you are currently guessing: " + revealTheMovie);
            System.out.println("Guess a letter: ");
            Scanner scanner = new Scanner(System.in);
            String newLetter = scanner.nextLine();

            //Check if the player entered the correct letter
            if (MovieSelection.contains(newLetter)) {

                rightLetters.append(newLetter);
                System.out.println("You have guessed " + wrongLettersCounter + " wrong letters: " + wrongLetters);

            } else {

                if (!newLetter.matches("[a-z]")) {

                    System.out.println("That is not a letter. Please enter a valid letter!");
                    wrongLettersCounter--;

                } else if (newLetter.contains(newLetter)) {

                    System.out.println("Wrong Letter.");
                    wrongLetters.append(newLetter);
                    wrongLettersCounter++;

                    System.out.println("You have guessed " + wrongLettersCounter + " wrong letters: " + wrongLetters);

                } else {

                    System.out.println();

                }

            }

                if (revealTheMovie.equals(MovieSelection)) {

                    theUserWon = true;
                    break;

                }

            }

            return theUserWon;

        }

    }
