package angarg12.rpgcombatkata;

import java.lang.Math.*;

public class Character {
    private int health = 1000;
    private int level = 1;
    private int exp = 0;
    private int stamina = 100;
    private boolean alive = true;

	public int getHealth() {
		return health;
	}

	public int getLevel() {
		return level;
	}
	
	public int getExperience() {
		return exp;
	}

	public boolean isAlive() {
		return alive;
	}
	
	public void expIncrease(int expGain) {
		//experience increase with formula
		exp += expGain;
		levelUp();
	}
	
	public void levelUp() {
		//makes sure level doesnt exceed the 100 cap
		if(level <=100)
		{
			//if they have enough exp they can level up
			if(exp > Math.pow(level,2)*10)
			{
				level++;
				exp=0;
			}
		}
		else {
			return;
		}
	}

	//function to deal damage to an opponent 
    public void damage(int damage){
    	//minuses health from opponent 
        health-= damage;
        if (health <= 0){
            alive=false;
        }
        System.out.println(getHealth());
    }

    public void attack(Character opponent, int damage){
    	//makes sure the opponent is not the same person
        if (stamina < 10){
            System.out.println("Unable to attack.");
            regainStamina(5);
            return;
        }
        if (opponent == this){
            return;
        } else if (opponent.isAlive() && damage <= opponent.getHealth()) {
            System.out.println("Attacked "+opponent);
            opponent.damage(damage);
            stamina -= 10;
        }
    }

    public void regainStamina (int stamIncrease){
        stamina += stamIncrease;
        if (stamina > 100){
            stamina = 100;
        }
    }


}
