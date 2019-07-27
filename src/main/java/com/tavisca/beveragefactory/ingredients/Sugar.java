package com.tavisca.beveragefactory.ingredients;

public class Sugar extends Ingredients {
	
	public Sugar() {
		this.beverageName = "Sugar";
	}
	
	@Override
	public double cost() {
		return 0.5;
	}

	@Override
	public String description() {
		return "Sugar";
	}

}
