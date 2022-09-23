package com.emre.game;

import java.util.Scanner;

public class Game {

	public static void main(String[] args) {
		boolean gameOverFlag = false;
		Scanner scanner = new Scanner(System.in);
		int choice=0;
		Player player = new Player();
		
		System.out.println("WELCOME TO GAME");
		
		boolean charSetFlag = true;
		while(!gameOverFlag) {
		while(charSetFlag) {
			
		System.out.println("Please select your character:Samurai[0]-Knight[1]-Archer[2]");
			choice = scanner.nextInt();
		
			switch(choice) {
			case 0:player.setCharacter(new Samurai());charSetFlag=false; break;
			case 1:player.setCharacter(new Knight());charSetFlag=false;break;
			case 2:player.setCharacter(new Archer());charSetFlag=false;break;
			default:System.out.println("Invalid choice!");;
		
			}
						
		}
		
		System.out.println("Hello " +player.getName());
		
		boolean locationFlag = true;
		Location location = null;
		
		while(locationFlag) {
			System.out.println("-----Player Infos-----");
			System.out.println("Health:" + player.getHealth() + " Damage:" + player.getDamage() + " Money:" + player.getMoney());
			System.out.println("Armor:" + player.getArmor().getName() + " Weapon:" + player.getWeapon().getName());
			System.out.println("-----Inventory-----");
			System.out.println("Water:" + player.getInventory().isWater());
			System.out.println("Food:" + player.getInventory().isFood());
			System.out.println("Firewood:" + player.getInventory().isFirewood());
			
			System.out.println("Where do you want to go:SafeHouse[0]-ToolStore[1]-River[2]-Forest[3]-Cave[4]");
			choice = scanner.nextInt();
			
			switch(choice) {
			
			case 0: location = new SafeHouse();location.setPlayer(player); break;
			case 1: location = new ToolStore();location.setPlayer(player);break;
			case 2: location = new River();location.setPlayer(player);break;
			case 3: location = new Forest();location.setPlayer(player);break;
			case 4: location = new Cave();location.setPlayer(player);break;
			default: locationFlag=true;System.out.println("Invalid Choice!");
			
			}
			gameOverFlag = location.start();
		}
		
		
	}
	}	
}
