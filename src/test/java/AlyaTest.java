import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

public class AlyaTest {

    @Test
    public void startsWithOneItem() {
        Alya alya = new Alya();
        int numberOfStartingItems = alya.getItems().size();
        assertThat(numberOfStartingItems, is(1));
    }
}