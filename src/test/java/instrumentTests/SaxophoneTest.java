package instrumentTests;

import org.junit.Before;
import org.junit.Test;
import stock.instruments.InstrumentType;
import stock.instruments.Saxophone;

import static org.junit.Assert.assertEquals;

public class SaxophoneTest {

    Saxophone saxophone;

    @Before
    public void before(){
        saxophone = new Saxophone("Odyssey Premiere Eb Alto", 579, 749, "brass", "rose gold", InstrumentType.WOODWIND, "rubber");

    }

    @Test
    public void hasADescription(){
        assertEquals("Odyssey Premiere Eb Alto", saxophone .getDescription());
    }

    @Test
    public void hasACostPrice(){
        assertEquals(579, saxophone .getCostPrice(), 0.01);
    }

    @Test
    public void hasASellingPrice(){
        assertEquals(749, saxophone .getSellingPrice(), 0.01);
    }

    @Test
    public void hasAMaterial(){
        assertEquals("brass", saxophone .getMaterial());
    }

    @Test
    public void hasColour(){
        assertEquals("rose gold", saxophone .getColour());
    }

    @Test
    public void hasInstrumentType(){
        assertEquals(InstrumentType.WOODWIND, saxophone .getInstrumentType());
    }

    @Test
    public void hasMouthpieceMaterial(){
        assertEquals("rubber", saxophone .getMouthpieceMaterial());
    }

    @Test
    public void canPlay(){
        assertEquals("I sound like whaa", saxophone .play("whaa"));
    }

    @Test
    public void canCalculateMarkup(){
        assertEquals(170, saxophone .calculateMarkup(saxophone .getCostPrice(), saxophone .getSellingPrice()), 0.01);
    }
}
