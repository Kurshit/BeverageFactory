package com.tavisca.beveragefactory.ingredients;

public class Banana extends Ingredients {
	
	public Banana() {
		this.beverageName = "Banana";
	}
	
	@Override
	public double cost() {
		return 4;
	}

	@Override
	public String description() {
		return "Banana";
	}

}
