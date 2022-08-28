import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Helpers {

    public static int getNumberFromUser() {
        Scanner scanner = new Scanner(System.in);
        while (!scanner.hasNextInt()) {
            System.out.println("This is not a number! Please try again:");
            scanner.nextLine();
        }
        return scanner.nextInt();
    }

    public static void getMovieByDate(List<Movie> movies) {
        System.out.println("Enter two years of film releases to display the names of movies published between these dates:");
        System.out.println("Please provide first, earlier year:");
        int userInputYear1 = Helpers.getNumberFromUser();
        System.out.println("Please provide second, later year:");
        int userInputYear2 = Helpers.getNumberFromUser();
        for (Movie m : movies) {
            if (m.getPublishingDate() > userInputYear1 && m.getPublishingDate() < userInputYear2) {
                System.out.println("Your movie published between these dates are: "
                        + "Title: " + m.getTitle() + ", "
                        + "Director: " + m.getDirector().getName() + " " + m.getDirector().getSurname() + ", "
                        + "Genre: " + m.getGenre() + ", "
                        + "Actors: " + m.getActors().toString() + ", "
                        + "Publishing Date: " + m.getPublishingDate());
            } else {
                System.out.println("Sorry, we didn't found any matches, please try again.");
            }
        }
    }

    public static void getRandomMovie(List<Movie> movies) {
        System.out.println("Random movie picked for you is: ");
        int randomMovie = new Random().nextInt(movies.size());
        System.out.println(movies.get(randomMovie).toString());
    }

    public static void getMovieByActorNameSurname(List<Movie> movies) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the name and surname of the actor to display names of the movies he played in:");

        System.out.println("Please provide actor name:");
        String userInputActorName = scanner.next();

        System.out.println("Please provide actor surname:");
        String userInputActorSurname = scanner.next();
        System.out.println("Your movie(s) for given actor: ");

        for (Movie m : movies) {
            for (int i = 0; i < movies.get(i).getActors().size(); i++) {
                if (m.getActors().get(i).getName().equals(userInputActorName) && m.getActors().get(i).getSurname().equals(userInputActorSurname)) {
                    System.out.println(
                            "Title: " + m.getTitle() + ", "
                                    + "Director: " + m.getDirector().getName() + " " + m.getDirector().getSurname() + ", "
                                    + "Genre: " + m.getGenre() + ", "
                                    + "Actors: " + m.getActors().get(i).getName() + " " + m.getActors().get(i).getSurname() + ", "
                                    + "Publishing Date: " + m.getPublishingDate());
                } else {
                    System.out.println("Sorry, we didn't found any matches, please try again.");
                }
            }
        }
    }

}
