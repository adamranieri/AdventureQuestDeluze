package dev.ranieri.characters;

public class Hero {
	
	private String name;

	private int health;
	private int strength;
	
	public Hero(String name, int health, int strength) {
		super();
		this.name = name;
		this.health = health;
		this.strength = strength;
	}
	
	public void attack(Enemy enemy) {
		
		int chance = (int) (Math.random() *100);
		chance = chance + strength;
		
		if(chance>=50) {
			System.out.println("You hit the " + enemy.getName() + " !!");
			int health = enemy.getHealth();
			health= health-10;
			enemy.setHealth(health);
		}else {
			System.out.println("You missed the " + enemy.getName() + " !!");
		}		
		
	}	

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getHealth() {
		return health;
	}

	public void setHealth(int health) {
		this.health = health;
	}

	public int getStrength() {
		return strength;
	}

	public void setStrength(int strength) {
		this.strength = strength;
	}

	@Override
	public String toString() {
		return "Hero [name=" + name + ", health=" + health + ", strength=" + strength + "]";
	}

	
}
