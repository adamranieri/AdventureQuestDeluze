package dev.ranieri.app;

import java.util.ArrayList;
import java.util.List;

import dev.ranieri.characters.Enemy;
import dev.ranieri.characters.Hero;

public class Game {

	public static void main(String[] args) {
		
		Hero gandalf = new Hero("Gandalf", 1000, 5);
		Enemy orc = new Enemy("Orc", 50, 3);
		Enemy troll = new Enemy("Troll", 100,10);
		
		List<Enemy> enemies = new ArrayList<Enemy>();
		enemies.add(orc);
		enemies.add(troll);
		
			for(int i =0; i<enemies.size();i++) {			
				battle(gandalf, enemies.get(i));				
			}				

	}
	
	public static void battle(Hero hero, Enemy enemy) {
		
		while(hero.getHealth() >1 & enemy.getHealth() >1) {
			hero.attack(enemy);
			enemy.attack(hero);	
			healthAnalyzer(hero, enemy);
		}

	}
	
	public static void healthAnalyzer(Hero hero, Enemy enemy) {
		System.out.println(hero);
		System.out.println(enemy);
		
		if(hero.getHealth() <1) {
			gameOver();
		}
		
		if(enemy.getHealth() <1) {
			victory(enemy);
		}
		
	}
	
	public static void victory(Enemy enemy) {
		System.out.println("Congratulations you beat the "+ enemy.getName());
	}
	
	public static void gameOver() {
		System.out.println("You have died");
		System.exit(0);
	}

}
