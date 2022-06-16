import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;

public class MovieSelection {

    static String movieSelection;

    //Initialising the Constructor
    MovieSelection() throws Exception {

        this.movieSelection = getmovieSelection();

    }


    public static String getmovieSelection() throws Exception {

        ArrayList<String> allMovies = new ArrayList<>();

        try {

            File myFile = new File("movies.txt");
            Scanner scanner = new Scanner(myFile);

            while (scanner.hasNextLine()) {

                String movieLine = scanner.nextLine();
                allMovies.add(movieLine);

            }

        } catch (Exception e) {

            System.out.println("File Not Found.");
            System.exit(1);

        }

        // Getting random movie from the list
        return movieSelection = allMovies.get((int) (Math.random() * allMovies.size()));

    }
}
