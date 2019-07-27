package com.tavisca.beveragefactory.ingredients;

public class Water extends Ingredients {
	
	public Water() {
		this.beverageName = "Water";
	}
	
	@Override
	public double cost() {
		return 0.5;
	}

	@Override
	public String description() {
		return "Water";
	}

}
