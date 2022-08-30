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
}
