import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public class Actor {
    private String name;
    private String surname;

    public String toString() {
        return name + " " + surname ;
    }
}
