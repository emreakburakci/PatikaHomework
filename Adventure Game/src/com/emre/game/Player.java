package com.emre.game;

public class Player {
	
	private int health, damage, money;
	private String name;
	private Inventory inventory;
	private CharacterType charType;
	private Weapon weapon;
	private Armor armor;
	
	public Player() {
		weapon = new NonWeapon();
		armor = new NonArmor();
		inventory = new Inventory();
	}
	
	public int hitByEnemy(int damage) {
		if(damage>armor.getDefence()) {
		health = health-(damage-armor.getDefence());
		}
		return health;
	}
	public void fullHealth() {
		this.health=charType.getHealth();
	}
	
	public void setCharacter(CharacterType type) {
		this.charType = type;
		this.name = charType.getName();
		this.damage = charType.getDamage();
		this.health = charType.getHealth();
		this.money = charType.getMoney();
		
	}

	public int getHealth() {
		return health;
	}

	public void setHealth(int health) {
		this.health = health;
	}

	public int getDamage() {
		return damage+getWeapon().getDamage();
	}

	public void setDamage(int damage) {
		this.damage = damage;
	}

	public int getMoney() {
		return money;
	}

	public void setMoney(int money) {
		this.money = money;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Inventory getInventory() {
		return inventory;
	}

	public void setInventory(Inventory inventory) {
		this.inventory = inventory;
	}

	public Weapon getWeapon() {
		return weapon;
	}

	public void setWeapon(Weapon weapon) {
		this.weapon = weapon;
	}

	public Armor getArmor() {
		return armor;
	}

	public void setArmor(Armor armor) {
		this.armor = armor;
	}

	public CharacterType getCharType() {
		return charType;
	}
	

}
