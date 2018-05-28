import Shop.Shop;
import Shop.instruments.Guitar;
import Shop.instruments.ISell;
import Shop.instruments.InstrumentType;
import Shop.instruments.MaterialType;
import Shop.items.Items;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ShopTest {

    Shop shop;
    Items items;
    ISell item;
    Guitar guitar;

    @Before
    public void before() {
        shop = new Shop("Ray's Music Exchange");
        guitar = new Guitar(InstrumentType.STRING, MaterialType.WOOD, "Yellow", 6, 500, "Lala");
    }

    @Test
    public void hasName() {
        assertEquals("Ray's Music Exchange", shop.getName());
    }

    @Test
    public void stockStartsEmpty() {
        assertEquals(0, shop.stockCount());
    }

//    @Test
//    public void canAddToStock() {
//        Shop.addToStock(guitar);
//        assertEquals(1, shop.stockCount());
//    }

    @Test
    public void canAddGuitarToStock() {
        item = new Guitar(InstrumentType.STRING, MaterialType.WOOD, "Yellow", 6, 500, "Lala");
        shop.addToStock(item);
        assertEquals(1, shop.stockCount());
    }

    @Test
    public void canRemoveItemFromStock() {
        shop.addToStock(item);
        shop.removeFromStock(item);
        assertEquals(0, shop.stockCount());
    }

}
