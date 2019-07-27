package com.tavisca.beveragefactory.ingredients;

public class Strawberries extends Ingredients {
	
	public Strawberries() {
		this.beverageName = "Strawberries";
	}
	
	@Override
	public double cost() {
		return 5;
	}

	@Override
	public String description() {
		return "Strawberries";
	}

}
