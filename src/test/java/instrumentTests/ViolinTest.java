package instrumentTests;

import org.junit.Before;
import org.junit.Test;
import stock.instruments.InstrumentType;
import stock.instruments.Violin;

import static org.junit.Assert.assertEquals;

public class ViolinTest {

    Violin violin;

    @Before
    public void before(){
        violin = new Violin("Harlequin", 118, 146, "wood", "purple", InstrumentType.STRINGS, 4);

    }

    @Test
    public void hasADescription(){
        assertEquals("Harlequin", violin.getDescription());
    }

    @Test
    public void hasACostPrice(){
        assertEquals(118, violin.getCostPrice(), 0.01);
    }

    @Test
    public void hasASellingPrice(){
        assertEquals(146, violin.getSellingPrice(), 0.01);
    }

    @Test
    public void hasAMaterial(){
        assertEquals("wood", violin.getMaterial());
    }

    @Test
    public void hasColour(){
        assertEquals("purple", violin.getColour());
    }

    @Test
    public void hasInstrumentType(){
        assertEquals(InstrumentType.STRINGS, violin.getInstrumentType());
    }

    @Test
    public void hasNoOfStrings(){
        assertEquals(4, violin.getNoOfStrings());
    }

    @Test
    public void canPlay(){
        assertEquals("I sound like pling", violin.play("pling"));
    }

    @Test
    public void canCalculateMarkup(){
        assertEquals(28, violin.calculateMarkup(), 0.01);
    }
}
