package com.emre.game;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class River extends BattleLoc {

	@Override
	public boolean start() {
		Scanner scanner = new Scanner(System.in);
		List<Bear> bears = new ArrayList<>();
		int random = (int)(Math.random()*2);
		for(int i = 0; i<=random;i++) {
			
			bears.add(new Bear());
			
		}
		System.out.println("There are" + bears.size() + "zombies in there!!!");
		System.out.println("Do you want to fight!Y/N");
		String choice = scanner.next();
		
		if(choice.equalsIgnoreCase("y")) {
			
			while(getPlayer().getHealth() > 0 && bears.size()!=0) {
				
				System.out.println(bears.size() + "zombie remaining");
				int i = (int)Math.random()*bears.size();
				
				
				if(getPlayer().getHealth() > 0 && bears.size()>0) {
					
					getPlayer().hitByEnemy(bears.get(i).getDamage());
					int enemyHealth = bears.get(i).hitByPlayer(getPlayer().getDamage());
					if(enemyHealth<=0) {
						
						getPlayer().setMoney(getPlayer().getMoney()+bears.get(i).getMoney());
						bears.remove(i);
					}
				}
				if(bears.size()==0) {
					getPlayer().getInventory().setWater(true);
					
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
