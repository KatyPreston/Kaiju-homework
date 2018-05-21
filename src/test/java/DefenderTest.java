import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DefenderTest {
    Defender defender;
    GiantLizard giantLizard;

    @Before
    public void before(){
        defender = new Defender("Defender", 60);
        giantLizard = new GiantLizard("Bowser", 40, 10);
    }

    @Test
    public void canGetType(){
        assertEquals("Defender", defender.getType());
    }

    @Test
    public void canGetHealthValue(){
        assertEquals(60, defender.getHealthValue());
    }

    @Test
    public void canGetAttacked(){
        defender.getsAttacked(giantLizard);
        assertEquals(50, defender.getHealthValue());
    }

    @Test
    public void canRam(){
        defender.ram(giantLizard);
        assertEquals(30, giantLizard.getHealthValue());
    }

    @Test
    public void canFireOn(){
        defender.fireOn(giantLizard);
        assertEquals(20, giantLizard.getHealthValue());
    }
}
