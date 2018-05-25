import Shop.instruments.Guitar;
import Shop.instruments.InstrumentType;
import Shop.instruments.MaterialType;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GuitarTest {

    Guitar guitar;

    @Before
    public void before(){
        guitar = new Guitar(InstrumentType.STRING, MaterialType.WOOD, "brown", 6 ,100.00);
    }

    @Test
    public void hasInstrumentType(){
        assertEquals(InstrumentType.STRING, guitar.getType());
    }

    @Test
    public void hasMaterialType(){
        assertEquals(MaterialType.WOOD, guitar.getMaterial());
    }

    @Test
    public void hasColour(){
        assertEquals("brown", guitar.getColour());
    }

    @Test
    public void hasNumberOfStrings(){
        assertEquals(6, guitar.getStrings());
    }

    @Test
    public void hasPrice(){
        assertEquals(100.00, guitar.getPrice(), 0.01);
    }
}
