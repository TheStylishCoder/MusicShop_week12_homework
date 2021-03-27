package accessoriesTests;

import org.junit.Before;
import org.junit.Test;
import stock.accessories.StringsPack;

import static org.junit.Assert.assertEquals;

public class StringsPackTest {

    StringsPack stringsPack;

    @Before
    public void before(){
        stringsPack = new StringsPack("Ernie Ball 2223 Super Slinky Nickel Wound Electric Guitar Strings", 6.50, 7.60);
    }

    @Test
    public void hasDescription(){
        assertEquals("Ernie Ball 2223 Super Slinky Nickel Wound Electric Guitar Strings", stringsPack.getDescription());
    }

    @Test
    public void hasCostPrice(){
        assertEquals(6.50, stringsPack.getCostPrice(), 0.01);
    }

    @Test
    public void hasSellingPrice(){
        assertEquals(7.60, stringsPack.getSellingPrice(), 0.01);
    }

    @Test
    public void canCalculateMarkup(){
        assertEquals(1.10, stringsPack.calculateMarkup(), 0.01);
    }
}
