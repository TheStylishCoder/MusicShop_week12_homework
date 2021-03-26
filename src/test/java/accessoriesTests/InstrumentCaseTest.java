package accessoriesTests;

import org.junit.Before;
import org.junit.Test;
import stock.accessories.InstrumentCase;


import static org.junit.Assert.assertEquals;

public class InstrumentCaseTest {

    InstrumentCase instrumentCase;

    @Before
    public void before(){
        instrumentCase = new InstrumentCase("Hidersine Oblong Violin Case", 105, 135);
    }

    @Test
    public void hasDescription(){
        assertEquals("Hidersine Oblong Violin Case", instrumentCase.getDescription());
    }

    @Test
    public void hasCostPrice(){
        assertEquals(105, instrumentCase.getCostPrice(), 0.01);
    }

    @Test
    public void hasSellingPrice(){
        assertEquals(135, instrumentCase.getSellingPrice(), 0.01);
    }

    @Test
    public void canCalculateMarkup(){
        assertEquals(30, instrumentCase.calculateMarkup(instrumentCase.getCostPrice(), instrumentCase.getSellingPrice()), 0.01);
    }

}


