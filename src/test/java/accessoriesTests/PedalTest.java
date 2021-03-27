package accessoriesTests;

import org.junit.Before;
import org.junit.Test;
import stock.accessories.Pedal;

import static org.junit.Assert.assertEquals;

public class PedalTest {

    Pedal pedal;

    @Before
    public void before(){
        pedal = new Pedal("CryBaby Wah Guitar Pedal", 55.30, 82.30);
    }

    @Test
    public void hasDescription(){
        assertEquals("CryBaby Wah Guitar Pedal", pedal.getDescription());
    }

    @Test
    public void hasCostPrice(){
        assertEquals(55.30, pedal.getCostPrice(), 0.01);
    }

    @Test
    public void hasSellingPrice(){
        assertEquals(82.30, pedal.getSellingPrice(), 0.01);
    }

    @Test
    public void canCalculateMarkup(){
        assertEquals(27, pedal.calculateMarkup(), 0.01);
    }

}


