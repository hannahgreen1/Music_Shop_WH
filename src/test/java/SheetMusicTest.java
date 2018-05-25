import Shop.items.SheetMusic;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SheetMusicTest {

    SheetMusic sheetMusic;

    @Before
    public void before(){
        sheetMusic = new SheetMusic("Four Seasons", 15, 20,                 "Mozart");
    }

    @Test
    public void canGetName(){
        assertEquals("Four Seasons", sheetMusic.getName());
    }

    @Test
    public void canGetBoughtPrice(){
        assertEquals(15, sheetMusic.getBoughtPrice(), 0.01);
    }

    @Test
    public void canGetSellPrice(){
        assertEquals(20, sheetMusic.getSellPrice(), 0.01);
    }

    @Test
    public void canGetAuthor(){
        assertEquals("Mozart", sheetMusic.getAuthor());
    }

}
