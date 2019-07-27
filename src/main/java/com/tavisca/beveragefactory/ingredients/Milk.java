package com.tavisca.beveragefactory.ingredients;

public class Milk extends Ingredients {
	
	
	public Milk() {
		this.beverageName = "Milk";
	}

	@Override
	public double cost() {
		return 1;
	}

	@Override
	public String description() {
		return "Milk";
	}

}
