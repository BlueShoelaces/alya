import lombok.Data;

@Data
public class Bunny {

    private String message = "You snuggle the bunny. You feel safe.";

    public String snuggle() {
        return message;
    }
}
