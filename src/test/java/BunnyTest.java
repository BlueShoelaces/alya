import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

public class BunnyTest {

    @Test
    public void alyaCanSnuggleBunny() {
        Bunny bunny = new Bunny();
        String actualMessage = bunny.snuggle();
        assertThat(actualMessage, is("You snuggle the bunny. You feel safe."));
    }
}