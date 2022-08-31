import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public class Director {

    private String name;
    private String surname;

    public String toString() {
        return name + " " + surname ;
    }

    static Director directorChan = new Director("Jackie", "Chan");
    static Director directorScott = new Director("Ridley", "Scot");
    static Director directorVilleneuve = new Director("Denis", "Villeneuve");
    static Director directorGarland = new Director("Alex", "Garland");
}
