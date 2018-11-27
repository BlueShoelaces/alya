import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

public class AlyaTest {

    @Test
    public void alyaStartsWithOneItem() {
        Alya alya = new Alya();
        int numberOfStartingItems = alya.getItems().size();
        assertThat(numberOfStartingItems, is(1));
    }

    @Test
    public void alyaStartsWithBunny() {
        Alya alya = new Alya();
        Bunny firstItem = alya.getItems().get(0);
        assertThat(firstItem.getMessage(), is(new Bunny().getMessage()));
    }
}