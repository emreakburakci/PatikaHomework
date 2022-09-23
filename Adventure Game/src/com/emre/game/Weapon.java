package com.emre.game;

public abstract class Weapon {
	
	private String name;
	private int id, damage, money;
	
	public Weapon(String name, int id, int damage, int money) {
		this.name = name;
		this.id = id;
		this.damage = damage;
		this.money = money;
		
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getDamage() {
		return damage;
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

}
