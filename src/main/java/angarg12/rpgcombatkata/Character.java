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

    public void damage(int damage){
        health-= damage;
        if (health <= 0){
            alive=false;
        }
    }

    public void attack(Character opponent, int damage){
        if (opponent == this){
            return;
        } else if (opponent.isAlive() && damage <= opponent.getHealth()) {
            opponent.damage(damage);
        }
    }

    public static void main(String[] args) {

    }
}
