import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GiantLizardTest {
    GiantLizard giantLizard;
    Tank tank;

    @Before
    public void before(){
        giantLizard = new GiantLizard("Bowser", 40, 10);
        tank = new Tank("Tank", 100);
    }

    @Test
    public void canGetName(){
        assertEquals("Bowser", giantLizard.getName());
    }

    @Test
    public void canGetHealthValue(){
        assertEquals(40, giantLizard.getHealthValue());
    }

    @Test
    public void canGetAttackValue(){
        assertEquals(10, giantLizard.getAttackValue());
    }

    @Test
    public void canRoar(){
        assertEquals("Roooaaaaar", giantLizard.roar());
    }

    @Test
    public void canAttack(){
        giantLizard.attack(tank);
        assertEquals(90, tank.getHealthValue());
    }

    @Test
    public void canMove(){
        assertEquals("I will crush you!!", giantLizard.move());
    }
}
