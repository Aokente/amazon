package angarg12.rpgcombatkata;

public class Character {
    private int health = 1000;
    private int level = 1;
    private boolean alive = true;

	public int getHealth() {
		return health;
	}

	public int getLevel() {
		return level;
	}

	public boolean isAlive() {
		return alive;
	}

	//function to deal damage to an opponent 
    public void damage(int damage){
    	//minuses health from opponent 
        health-= damage;
        if (health <= 0){
            alive=false;
        }
    }

    public void attack(Character opponent, int damage){
    	//makes sure the opponent is not the same person 
        if (opponent == this){
            return;
        } else if (opponent.isAlive() && damage <= opponent.getHealth()) {
            opponent.damage(damage);
        }
    }
}
