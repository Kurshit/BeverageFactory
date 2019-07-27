package com.tavisca.beveragefactory.ingredients;

public class Tea extends Ingredients {
	
	public Tea() {
		this.beverageName = "Tea";
	}
	
	@Override
	public double cost() {
		return 3;
	}

	@Override
	public String description() {
		return "Tea";
	}

}
