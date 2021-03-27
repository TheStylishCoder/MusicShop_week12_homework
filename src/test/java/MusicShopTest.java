import behaviours.ISell;
import org.junit.Before;
import org.junit.Test;
import stock.instruments.AcousticGuitar;
import stock.instruments.InstrumentType;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class MusicShopTest {

    MusicShop musicShop;
    AcousticGuitar acousticGuitar;

    @Before
    public void before(){
        musicShop = new MusicShop("Ray's Music Exchange");
        acousticGuitar = new AcousticGuitar("Gibson Songwriter", 1900, 2499, "rosewood", "brown", InstrumentType.GUITAR, 6);
    }

    @Test
    public void shopHasName(){
        assertEquals("Ray's Music Exchange", musicShop.getName());
    }

    @Test
    public void stockCountStartsAt0(){
        assertEquals(0, musicShop.getStockCount());
    }

    @Test
    public void canAddStockItemToStockList(){
        musicShop.addToStockList(acousticGuitar);
        assertEquals(1, musicShop.getStockCount());
    }

    @Test
    public void canRemoveStockFromStockList(){
        musicShop.addToStockList(acousticGuitar);
        musicShop.removeFromStockList();
        assertEquals(0, musicShop.getStockCount());
    }

}
