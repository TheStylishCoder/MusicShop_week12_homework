package instrumentTests;

import org.junit.Before;
import org.junit.Test;
import stock.instruments.AcousticGuitar;
import stock.instruments.InstrumentType;

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

}
