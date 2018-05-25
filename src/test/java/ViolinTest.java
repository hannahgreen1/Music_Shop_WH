import Shop.instruments.InstrumentType;
import Shop.instruments.MaterialType;
import Shop.instruments.Violin;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ViolinTest {

    Violin violin;

    @Before
    public void before(){
        violin = new Violin(InstrumentType.STRING, MaterialType.WOOD, "red", 150.00, 100, "musiiiic");
    }

    @Test
    public void hasInstrumentType(){
        assertEquals(InstrumentType.STRING, violin.getType());
    }

    @Test
    public void hasMaterialType(){
        assertEquals(MaterialType.WOOD, violin.getMaterial());
    }

    @Test
    public void hasColour(){
        assertEquals("red", violin.getColour());
    }

    @Test
    public void canGetAge(){
        assertEquals(100, violin.getAge());
    }

    @Test
    public void canGetPrice(){
        assertEquals(150.00, violin.getPrice(), 0.01);
    }

}
