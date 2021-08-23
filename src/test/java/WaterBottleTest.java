import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class WaterBottleTest {

    WaterBottle bottle1;

    @Before
    public void before(){
        bottle1 = new WaterBottle();
    }

    @Test
    public void hasVolume(){
        assertEquals(100, bottle1.getVolume());
    }

    @Test
    public void drinkLowersVolume(){
        bottle1.takeDrink();
        assertEquals(90, bottle1.getVolume());
    }

    @Test
    public void twoDrinksLowersVolumeBy20(){
        bottle1.takeDrink();
        bottle1.takeDrink();
        assertEquals(80, bottle1.getVolume());
    }

    @Test
    public void volumeDropsToZeroWhenEmptied(){
        bottle1.emptyBottle();
        assertEquals(0, bottle1.getVolume());
    }

    @Test
    public void volumeRefillsTo100(){
        bottle1.takeDrink();
        bottle1.takeDrink();
        bottle1.refillBottle();
        assertEquals(100, bottle1.getVolume());
    }
}
