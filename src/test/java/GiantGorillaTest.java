import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GiantGorillaTest {
    GiantGorilla giantGorilla;
    Tank tank;

    @Before
    public void before(){
        giantGorilla = new GiantGorilla("Joe", 70, 20);
        tank = new Tank("Tank", 100);
    }

    @Test
    public void canGetName(){
        assertEquals("Joe", giantGorilla.getName());
    }

    @Test
    public void canGetHealthValue(){
        assertEquals(70, giantGorilla.getHealthValue());
    }

    @Test
    public void canGetAttackValue(){
        assertEquals(20, giantGorilla.getAttackValue());
    }

    @Test
    public void canRoar(){
        assertEquals("OOOOAAARRRGH", giantGorilla.roar());
    }

    @Test
    public void canAttack(){
        giantGorilla.attack(tank);
        assertEquals(80, tank.getHealthValue());
    }

    @Test
    public void canMove(){
        assertEquals("I will destroy your city!!", giantGorilla.move());
    }


}
