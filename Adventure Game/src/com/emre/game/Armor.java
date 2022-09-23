package com.emre.game;

public abstract class Armor {

	private String name;
	private int id, defence, money;
	
	public Armor(String name, int id, int defence, int money) {
		this.name = name;
		this.id = id;
		this.defence = defence;
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
	public int getDefence() {
		return defence;
	}
	public void setDefence(int defence) {
		this.defence = defence;
	}
	public int getMoney() {
		return money;
	}
	public void setMoney(int money) {
		this.money = money;
	}

}
