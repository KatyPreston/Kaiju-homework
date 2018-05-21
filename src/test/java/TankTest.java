import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TankTest {
    Tank tank;
    GiantLizard giantLizard;

    @Before
    public void before(){
        tank = new Tank("Tank", 100);
        giantLizard = new GiantLizard("Bowser", 40, 10);
    }

    @Test
    public void canGetType(){
        assertEquals("Tank", tank.getType());
    }

    @Test
    public void canGetHealthValue(){
        assertEquals(100, tank.getHealthValue());
    }

    @Test
    public void canGetAttacked(){
        tank.getsAttacked(giantLizard);
        assertEquals(90, tank.getHealthValue());
    }

    @Test
    public void canRam(){
        tank.ram(giantLizard);
        assertEquals(20, giantLizard.getHealthValue());
    }

    @Test
    public void canFireOn(){
        tank.fireOn(giantLizard);
        assertEquals(0, giantLizard.getHealthValue());
    }
}
