package angarg12.rpgcombatkata;


import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class CharacterTest {

    @Test
    public void createdHealth1000() {
        Character c = new Character();
        assertEquals(c.getHealth(), 1000);
    }

    @Test
    public void createdLevel1() {
        Character c = new Character();
        assertEquals(c.getLevel(), 1);
    }

    @Test
    public void createdIsAlive() {
        Character c = new Character();
        assertTrue(c.isAlive());
    }

    @Test
    public void notAttackSelf(){
    	//creates a new character
        Character c = new Character();
        c.attack(c, 100);
        //makes sure we don't die
        assertTrue(c.getHealth() == 1000);
    }

    @Test
    public void rightDamageDealt(){
    	//creates a new character
        Character c = new Character();
        Character d = new Character();
        c.attack(d, 100);
        //makes sure the correct damage is dealt
        assertTrue(d.getHealth() == 900);
    }

    @Test
    public void isDead(){
    	//creates a new character
        Character c = new Character();
        Character d = new Character();
        c.attack(d, 1000);
        //makes sure the person dies
        assertTrue(!d.isAlive());
    }

}
