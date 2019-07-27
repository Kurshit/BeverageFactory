package com.tavisca.beveragefactory.ingredients;

public class Lemon extends Ingredients {
	
	public Lemon() {
		this.beverageName = "Lemon";
	}
	
	@Override
	public double cost() {
		return 5.5;
	}

	@Override
	public String description() {
		return "Lemon";
	}

}
