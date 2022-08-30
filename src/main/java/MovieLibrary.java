import lombok.AllArgsConstructor;
import lombok.Getter;


@AllArgsConstructor
@Getter
public class MovieLibrary {

    static Actor actorFord = new Actor("Harrison", "Ford");
    static Actor actorHauer = new Actor("Rutger", "Hauer");
    static Actor actorYoung = new Actor("Sean", "Young");

    static Actor actorGosling = new Actor("Ryan", "Gosling");
    static Actor actorArmas = new Actor("Ana", "de Armas");

    static Actor actorChalamet = new Actor("Timothee", "Chalamet");
    static Actor actorFerguson = new Actor("Rebecca", "Ferguson");
    static Actor actorIsaac = new Actor("Oscar", "Isaac");

    static Actor actorGleeson = new Actor("Domhnall", "Gleeson");
    static Actor actorVikander = new Actor("Alicia", "Vikander");

    static Actor actorChan = new Actor("Jackie", "Chan");
    static Actor actorKwan = new Actor("Rosamund", "Kwan");
    static Actor actorLadalski = new Actor("Jhon", "Ladalski");

    static Director directorChan = new Director("Jackie", "Chan");
    static Director directorScott = new Director("Ridley", "Scot");
    static Director directorVilleneuve = new Director("Denis", "Villeneuve");
    static Director directorGarland = new Director("Alex", "Garland");

}
