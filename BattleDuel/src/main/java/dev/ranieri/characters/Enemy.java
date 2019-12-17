package dev.ranieri.characters;

public class Enemy {
	
	private String name;

	private int health;
	private int strength;
	
	public Enemy(String name, int health, int strength) {
		super();
		this.name = name;
		this.health = health;
		this.strength = strength;
	}
	
	public void attack(Hero hero) {
		
		int chance = (int) (Math.random() *100);
		chance = chance + strength;
		
		if(chance >= 50) {
			System.out.println("the" + this.name + " has hit you!");
			hero.setHealth(hero.getHealth()-10);
		}else {
			System.out.println("the" + this.name + " has missed you!");
		}
		
	};

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
		return "Enemy [name=" + name + ", health=" + health + ", strength=" + strength + "]";
	}
	
	
	
	
}
