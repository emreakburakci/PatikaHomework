package com.emre.game;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Cave extends BattleLoc {

	@Override
	public boolean start() {
		Scanner scanner = new Scanner(System.in);
		List<Zombie> zombies = new ArrayList<>();
		int random = (int)(Math.random()*2);
		for(int i = 0; i<=random;i++) {
			
			zombies.add(new Zombie());
			
		}
		System.out.println("There are" + zombies.size() + "zombies in there!!!");
		System.out.println("Do you want to fight!Y/N");
		String choice = scanner.next();
		
		if(choice.equalsIgnoreCase("y")) {
			
			while(getPlayer().getHealth() > 0 && zombies.size()!=0) {
				
				System.out.println(zombies.size() + "zombie remaining");
				int i = (int)Math.random()*zombies.size();
				
				
				if(getPlayer().getHealth() > 0 && zombies.size()>0) {
					
					getPlayer().hitByEnemy(zombies.get(i).getDamage());
					int enemyHealth = zombies.get(i).hitByPlayer(getPlayer().getDamage());
					if(enemyHealth<=0) {
						
						getPlayer().setMoney(getPlayer().getMoney()+zombies.get(i).getMoney());
						zombies.remove(i);
					}
				}
				if(zombies.size()==0) {
					getPlayer().getInventory().setFood(true);
					
				}
				if(getPlayer().getHealth() < 1) {
					System.out.println("GAME OVER!!!");
					return true;
				}
				
				
			}
		}
		return false;
	}

}
