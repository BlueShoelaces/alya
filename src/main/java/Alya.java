import lombok.Data;

import java.util.Arrays;
import java.util.List;

@Data
public class Alya {
    private List<?> items;

    public Alya() {
        this.items = Arrays.asList("an item");
    }
}
