import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.List;

@AllArgsConstructor
@Getter
public class Movie {
    private String title;
    private String genre;
    private Director director;
    private List<Actor> actors;
    private int publishingDate;

    public String toString() {
        return "Title: " + title + ", " + "Genre: " + genre + ", " + "Director: " + director + ", "
                                       + "Actors: " + getActors() + ", " + "Publishing Date: " + publishingDate;
    }
}
