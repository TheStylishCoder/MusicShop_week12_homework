package accessoriesTests;

import org.junit.Before;
import org.junit.Test;
import stock.accessories.SheetMusic;

import static org.junit.Assert.assertEquals;

public class SheetMusicTest {

    SheetMusic sheetMusic;

    @Before
    public void before(){
        sheetMusic = new SheetMusic("Music Theory In Practice Grade 5", 4.50, 6.95);
    }

    @Test
    public void hasDescription(){
        assertEquals("Music Theory In Practice Grade 5", sheetMusic.getDescription());
    }

    @Test
    public void hasCostPrice(){
        assertEquals(4.50, sheetMusic.getCostPrice(), 0.01);
    }

    @Test
    public void hasSellingPrice(){
        assertEquals(6.95, sheetMusic.getSellingPrice(), 0.01);
    }

    @Test
    public void canCalculateMarkup(){
        assertEquals(2.45, sheetMusic.calculateMarkup(sheetMusic.getCostPrice(), sheetMusic.getSellingPrice()), 0.01);
    }

}
