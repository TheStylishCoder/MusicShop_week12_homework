package instrumentTests;

import org.junit.Before;
import org.junit.Test;
import stock.instruments.FrenchHorn;
import stock.instruments.InstrumentType;

import static org.junit.Assert.assertEquals;

public class FrenchHornTest {

    FrenchHorn frenchHorn;

    @Before
    public void before(){
        frenchHorn = new FrenchHorn("Odyssey Premiere OFH1750BF", 500, 829, "brass", "yellow", InstrumentType.BRASS, "double");

    }

    @Test
    public void hasADescription(){
        assertEquals("Odyssey Premiere OFH1750BF", frenchHorn.getDescription());
    }

    @Test
    public void hasACostPrice(){
        assertEquals(500, frenchHorn.getCostPrice(), 0.01);
    }

    @Test
    public void hasASellingPrice(){
        assertEquals(829, frenchHorn.getSellingPrice(), 0.01);
    }

    @Test
    public void hasAMaterial(){
        assertEquals("brass", frenchHorn.getMaterial());
    }

    @Test
    public void hasColour(){
        assertEquals("yellow", frenchHorn.getColour());
    }

    @Test
    public void hasInstrumentType(){
        assertEquals(InstrumentType.BRASS, frenchHorn.getInstrumentType());
    }

    @Test
    public void hasHornType(){
        assertEquals("double", frenchHorn.getHornType());
    }

    @Test
    public void canPlay(){
        assertEquals("I sound like: honk!!", frenchHorn.play("honk!!"));
    }

    @Test
    public void canCalculateMarkup(){
        assertEquals(329, frenchHorn.calculateMarkup(), 0.01);
    }
}
