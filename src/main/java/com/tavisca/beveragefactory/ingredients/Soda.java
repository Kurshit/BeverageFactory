package com.tavisca.beveragefactory.ingredients;

public class Soda extends Ingredients {
	
	public Soda() {
		this.beverageName = "Soda";
	}
	
	@Override
	public double cost() {
		return 0.5;
	}

	@Override
	public String description() {
		return "Soda";
	}

}
