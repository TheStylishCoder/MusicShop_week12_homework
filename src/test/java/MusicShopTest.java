import org.junit.Before;
import org.junit.Test;
import stock.accessories.Pedal;
import stock.instruments.AcousticGuitar;
import stock.instruments.InstrumentType;


import static org.junit.Assert.assertEquals;

public class MusicShopTest {

    MusicShop musicShop;
    AcousticGuitar acousticGuitar;
    Pedal pedal;

    @Before
    public void before(){
        musicShop = new MusicShop("Ray's Music Exchange");
        acousticGuitar = new AcousticGuitar("Gibson Songwriter", 1900, 2499, "rosewood", "brown", InstrumentType.GUITAR, 6);
        pedal = new Pedal("CryBaby Wah Guitar Pedal", 55.30, 82.30);
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
    public void canAddInstrumentToStockList(){
        musicShop.addToStockList(acousticGuitar);
        assertEquals(1, musicShop.getStockCount());
    }

    @Test
    public void canAddAccessoryToStockList(){
        musicShop.addToStockList(pedal);
        assertEquals(1, musicShop.getStockCount());
    }

    @Test
    public void canRemoveStockFromStockList(){
        musicShop.addToStockList(acousticGuitar);
        musicShop.removeFromStockList();
        assertEquals(0, musicShop.getStockCount());
    }

    @Test
    public void canCalculateProfit(){
        musicShop.addToStockList(acousticGuitar);
        musicShop.addToStockList(pedal);
        assertEquals(626, musicShop.calculateProfit(musicShop.getStock()), 0.01);
    }

}
