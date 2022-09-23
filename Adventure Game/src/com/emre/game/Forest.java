package com.emre.game;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Forest extends BattleLoc {

	
	@Override
	public boolean start() {
		Scanner scanner = new Scanner(System.in);
		List<Vampire> vampires = new ArrayList<>();
		int random = (int)(Math.random()*2);
		for(int i = 0; i<=random;i++) {
			
			vampires.add(new Vampire());
			
		}
		System.out.println("There are" + vampires.size() + "zombies in there!!!");
		System.out.println("Do you want to fight!Y/N");
		String choice = scanner.next();
		
		if(choice.equalsIgnoreCase("y")) {
			
			while(getPlayer().getHealth() > 0 && vampires.size()!=0) {
				
				System.out.println(vampires.size() + "zombie remaining");
				int i = (int)Math.random()*vampires.size();
				
				
				if(getPlayer().getHealth() > 0 && vampires.size()>0) {
					
					getPlayer().hitByEnemy(vampires.get(i).getDamage());
					int enemyHealth = vampires.get(i).hitByPlayer(getPlayer().getDamage());
					if(enemyHealth<=0) {
						
						getPlayer().setMoney(getPlayer().getMoney()+vampires.get(i).getMoney());
						vampires.remove(i);
					}
				}
				if(vampires.size()==0) {
					getPlayer().getInventory().setFirewood(true);
					
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
