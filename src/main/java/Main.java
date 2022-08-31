import java.util.ArrayList;
import java.util.List;

import static java.util.Arrays.asList;

public class Main {

    public static void main(String[] args) {

        List<Movie> movies = new ArrayList<>();
        movies.add(new Movie("Armor of god", "comedy", Director.directorChan,
                new ArrayList<>(asList(Actor.actorChan, Actor.actorKwan, Actor.actorLadalski)), 1986));
        movies.add(new Movie("Blade Runner", "si-fi", Director.directorScott,
                new ArrayList<>(asList(Actor.actorFord, Actor.actorHauer, Actor.actorYoung)), 1982));
        movies.add(new Movie("Blade Runner 2049", "si-fi", Director.directorVilleneuve,
                new ArrayList<>(asList(Actor.actorFord, Actor.actorGosling, Actor.actorArmas)), 2017));
        movies.add(new Movie("Dune", "si-fi", Director.directorVilleneuve,
                new ArrayList<>(asList(Actor.actorChalamet, Actor.actorFerguson, Actor.actorIsaac)), 2021));
        movies.add(new Movie("Ex Machina", "si-fi", Director.directorGarland,
                new ArrayList<>(asList(Actor.actorIsaac, Actor.actorGleeson, Actor.actorVikander)), 2015));


        int action = 0;
        while (action != 4) {

            Helpers.displayMenu();

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
