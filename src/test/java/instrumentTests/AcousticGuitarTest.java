package instrumentTests;

import org.junit.Before;
import org.junit.Test;
import stock.instruments.AcousticGuitar;
import stock.instruments.InstrumentType;

import static org.junit.Assert.assertEquals;

public class AcousticGuitarTest {

    AcousticGuitar acousticGuitar;

    @Before
    public void before(){
        acousticGuitar = new AcousticGuitar("Gibson Songwriter", 1900, 2499, "rosewood", "brown", InstrumentType.GUITAR, 6);

    }

    @Test
    public void hasADescription(){
        assertEquals("Gibson Songwriter", acousticGuitar.getDescription());
    }

    @Test
    public void hasACostPrice(){
        assertEquals(1900, acousticGuitar.getCostPrice(), 0.01);
    }

    @Test
    public void hasASellingPrice(){
        assertEquals(2499, acousticGuitar.getSellingPrice(), 0.01);
    }

    @Test
    public void hasAMaterial(){
        assertEquals("rosewood", acousticGuitar.getMaterial());
    }

    @Test
    public void hasColour(){
        assertEquals("brown", acousticGuitar.getColour());
    }

    @Test
    public void hasInstrumentType(){
        assertEquals(InstrumentType.GUITAR, acousticGuitar.getInstrumentType());
    }

    @Test
    public void hasNoOfStrings(){
        assertEquals(6, acousticGuitar.getNoOfStrings());
    }

    @Test
    public void canPlay(){
        assertEquals("I sound like twanggg", acousticGuitar.play("twanggg"));
    }

    @Test
    public void canCalculateMarkup(){
        assertEquals(599, acousticGuitar.calculateMarkup(acousticGuitar.getCostPrice(), acousticGuitar.getSellingPrice()), 0.01);
    }




}
