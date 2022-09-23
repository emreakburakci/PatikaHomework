package com.emre.game;

import java.util.Scanner;

public class SafeHouse extends NormalLoc {

	@Override
	public boolean start() {
		
		boolean food = getPlayer().getInventory().isFood();
		boolean water = getPlayer().getInventory().isWater();
		boolean firewood = getPlayer().getInventory().isFirewood();
		
		if(food && water && firewood) {
			System.out.println("CONGRATULATIONS YOU WIN");
		}else {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Welcome to the Safe House. You need to collect all resources!!!. Your health is full now.");
		getPlayer().fullHealth();
		System.out.println("Enter any key to quit.");
		String choice = scanner.next();
		
	}
		return true;
	}
}
