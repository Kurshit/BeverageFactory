package com.tavisca.beveragefactory.ingredients;

public class CoffeePowder extends Ingredients {
	
	public CoffeePowder() {
		this.beverageName = "CoffeePowder";
	}
	
	@Override
	public double cost() {
		return 3;
	}

	@Override
	public String description() {
		return "CoffeePowder";
	}

}
