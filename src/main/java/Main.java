import java.util.ArrayList;
import java.util.List;

import static java.util.Arrays.asList;

public class Main {

    public static void main(String[] args) {

        List<Movie> movies = new ArrayList<>();
        movies.add(new Movie("Armor of god", "comedy", MovieLibrary.directorChan,
                new ArrayList<>(asList(MovieLibrary.actorChan, MovieLibrary.actorKwan, MovieLibrary.actorLadalski)), 1986));
        movies.add(new Movie("Blade Runner", "si-fi", MovieLibrary.directorScott,
                new ArrayList<>(asList(MovieLibrary.actorFord, MovieLibrary.actorHauer, MovieLibrary.actorFord)), 1982));
        movies.add(new Movie("Blade Runner 2049", "si-fi", MovieLibrary.directorVilleneuve,
                new ArrayList<>(asList(MovieLibrary.actorFord, MovieLibrary.actorGosling, MovieLibrary.actorArmas)), 2017));
        movies.add(new Movie("Dune", "si-fi", MovieLibrary.directorVilleneuve,
                new ArrayList<>(asList(MovieLibrary.actorChalamet, MovieLibrary.actorFerguson, MovieLibrary.actorIsaac)), 2021));
        movies.add(new Movie("Ex Machina", "si-fi", MovieLibrary.directorGarland,
                new ArrayList<>(asList(MovieLibrary.actorIsaac, MovieLibrary.actorGleeson, MovieLibrary.actorVikander)), 2015));


        int action = 0;
        while (action != 4) {
            System.out.println(" ");
            System.out.println("Welcome in Movie Library program, select your action:");
            System.out.println("1 - Enter two years of film releases to display the names of movies published between these dates:");
            System.out.println("2 - View all information about random movie");
            System.out.println("3 - Enter the name and surname of the actor to display names of the movies he played in");
            System.out.println("4 - End program");

            action = Helpers.getNumberFromUser();
            switch (action) {
                case 1:
                    Helpers.getMovieByDate(movies);
                    break;
                case 2:
                    Helpers.getRandomMovie(movies);
                    break;
                case 3:
                    Helpers.getMovieByActorNameSurname(movies);
                    break;
                case 4:
                    break;
                default:
                    System.out.println("Unfortunately, you selected an option out of range (1-4), your option is: " + action);
            }
        }
        System.out.println("Thank you for using our program");

    }
}
