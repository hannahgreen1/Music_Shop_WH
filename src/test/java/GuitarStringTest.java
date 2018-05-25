import Shop.items.GuitarStrings;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GuitarStringTest {

    GuitarStrings guitarStrings;

    @Before
    public void before(){
        guitarStrings = new GuitarStrings("Elixir 80/20 Bronze Acoustic Guitar Strings", 4, 8.5, "Acoustic");
    }

    @Test
    public void getStringName(){
        assertEquals("Elixir 80/20 Bronze Acoustic Guitar Strings", guitarStrings.getName());
    }

    @Test
    public void getStringType(){
        assertEquals("Acoustic", guitarStrings.getStringType());
    }

    @Test
    public void getBoughtPrice(){
        assertEquals(4, guitarStrings.getBoughtPrice(), 0.01);
    }

    @Test
    public void getSellPrice(){
        assertEquals(8.5, guitarStrings.getSellPrice(), 0.01);
    }
}
