package com.emre.game;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ToolStore extends NormalLoc {

	public boolean start() {

		List<Weapon> weaponList = new ArrayList<>();
		weaponList.add(new Gun());
		weaponList.add(new Rifle());
		weaponList.add(new Sword());

		List<Armor> armorList = new ArrayList<>();
		armorList.add(new LightArmor());
		armorList.add(new MediumArmor());
		armorList.add(new HeavyArmor());

		Scanner scanner = new Scanner(System.in);

		System.out.println("Welcome to the ToolStore" + getPlayer().getName());
		System.out.println("You have " + getPlayer().getMoney() + "money");
		System.out.println("Which item do you want to buy?W for weapon A for Armor");

		String type = scanner.next();

		if (type.equalsIgnoreCase("w")) {

			System.out.println("-----WEAPONS-----");
			
			for (Weapon wp : weaponList) {
				System.out.println("id=" + wp.getId() + "Name=" + wp.getName() + "Damage=" + wp.getDamage() + "Money="
						+ wp.getMoney());
			}
			
			Weapon weapon = null;
			boolean weaponFlag = true;
			while (weaponFlag) {
				System.out.println("Enter the id of weapon.(to quit enter -1)");
				int choice = scanner.nextInt();
				switch (choice) {
				case -1:weaponFlag = false;break;
				case 1:
					weapon = new Gun();
					if (getPlayer().getMoney() >= weapon.getMoney()) {
						getPlayer().setWeapon(weapon);
						getPlayer().setMoney(getPlayer().getMoney() - weapon.getMoney());weaponFlag = false;
					}else {System.out.println("You don't have enogh money!");weaponFlag=true;}
					
					break;
				case 2:
					weapon = new Sword();
					if (getPlayer().getMoney() >= weapon.getMoney()) {
						getPlayer().setWeapon(weapon);
						getPlayer().setMoney(getPlayer().getMoney() - weapon.getMoney());weaponFlag = false;
					}else {System.out.println("You don't have enogh money!");weaponFlag=true;}
					
					break;
				case 3:
					weapon = new Rifle();
					if (getPlayer().getMoney() >= weapon.getMoney()) {
						getPlayer().setWeapon(weapon);
						getPlayer().setMoney(getPlayer().getMoney() - weapon.getMoney());weaponFlag = false;
					}else {System.out.println("You don't have enogh money!");weaponFlag=true;}
					
					break;

				default:
					System.out.println("Invalid Choice!Select again");

				}

			}

		}

		if (type.equalsIgnoreCase("a")) {

			System.out.println("-----ARMORS-----");
			
			for (Armor ar : armorList) {
				System.out.println("id=" + ar.getId() + "Name=" + ar.getName() + "Damage=" + ar.getDefence() + "Money="
						+ ar.getMoney());
			}
			
			Armor armor = null;
			boolean armorFlag = true;
			while (armorFlag) {
				System.out.println("Enter the id of armor:(to quit enter -1)");
				int choice = scanner.nextInt();
				switch (choice) {
				case -1:armorFlag = false;break;
				case 1:
					armor = new LightArmor();
					if (getPlayer().getMoney() >= armor.getMoney()) {
						getPlayer().setArmor(armor);
						getPlayer().setMoney(getPlayer().getMoney() - armor.getMoney());armorFlag = false;
					}else {System.out.println("You don't have enogh money!");armorFlag=true;}
					
					break;
				case 2:
					armor = new MediumArmor();
					if (getPlayer().getMoney() >= armor.getMoney()) {
						getPlayer().setArmor(armor);
						getPlayer().setMoney(getPlayer().getMoney() - armor.getMoney());armorFlag = false;
					}else {System.out.println("You don't have enogh money!");armorFlag=true;}
					
					break;
				case 3:
					armor = new HeavyArmor();
					if (getPlayer().getMoney() >= armor.getMoney()) {
						getPlayer().setArmor(armor);
						getPlayer().setMoney(getPlayer().getMoney() - armor.getMoney());
						armorFlag = false;
					}else {System.out.println("You don't have enogh money!");armorFlag=true;}
					
					break;

				default:
					System.out.println("Invalid Choice!Select again");

				}

			}

		}
	return true;
	}

}
