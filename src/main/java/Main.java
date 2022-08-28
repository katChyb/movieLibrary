import java.util.ArrayList;
import java.util.List;

import static java.util.Arrays.asList;

public class Main {

    public static void main(String[] args) {

        Actor actorFord = new Actor("Harrison", "Ford");
        Actor actorHauer = new Actor("Rutger", "Hauer");
        Actor actorYoung = new Actor("Sean", "Young");

        Actor actorGosling = new Actor("Ryan", "Gosling");
        Actor actorArmas = new Actor("Ana", "de Armas");

        Actor actorChalamet = new Actor("Timothee", "Chalamet");
        Actor actorFerguson = new Actor("Rebecca", "Ferguson");
        Actor actorIsaac = new Actor("Oscar", "Isaac");

        Actor actorGleeson = new Actor("Domhnall", "Gleeson");
        Actor actorVikander = new Actor("Alicia", "Vikander");

        Actor actorChan = new Actor("Jackie", "Chan");
        Actor actorKwan = new Actor("Rosamund", "Kwan");
        Actor actorLadalski = new Actor("Jhon", "Ladalski");

        Director directorChan = new Director("Jackie", "Chan");
        Director directorScott = new Director("Ridley", "Scot");
        Director directorVilleneuve = new Director("Denis", "Villeneuve");
        Director directorGarland = new Director("Alex", "Garland");


        List<Movie> movies = new ArrayList<>();
        movies.add(new Movie("Armor of god", "comedy", directorChan, new ArrayList<>(asList(actorChan, actorKwan, actorLadalski)), 1986));
        movies.add(new Movie("Blade Runner", "si-fi", directorScott, new ArrayList<>(asList(actorFord, actorHauer, actorYoung)), 1982));
        movies.add(new Movie("Blade Runner 2049", "si-fi", directorVilleneuve, new ArrayList<>(asList(actorFord, actorGosling, actorArmas)), 2017));
        movies.add(new Movie("Dune", "si-fi", directorVilleneuve, new ArrayList<>(asList(actorChalamet, actorFerguson, actorIsaac)), 2021));
        movies.add(new Movie("Ex Machina", "si-fi", directorGarland, new ArrayList<>(asList(actorIsaac, actorGleeson, actorVikander)), 2015));


        int action = 0;
        while (action != 4) {
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
