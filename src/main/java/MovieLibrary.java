import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.ArrayList;
import java.util.List;

import static java.util.Arrays.asList;

@AllArgsConstructor
@Getter
public class MovieLibrary {


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

    Director directorChan = new Director("Jackie","Chan");

 //   Movie movieArmorOfGod = new Movie("Armor of god","comedy", directorChan, new ArrayList<>(asList(actorChan,actorKwan,actorLadalski)), 1986);
    List<Movie> movies = new ArrayList<>();
    movies.add(new Movie());


}
