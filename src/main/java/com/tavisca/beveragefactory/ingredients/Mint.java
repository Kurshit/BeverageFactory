package com.tavisca.beveragefactory.ingredients;

public class Mint extends Ingredients {
	
	public Mint() {
		this.beverageName = "Mint";
	}
	
	@Override
	public double cost() {
		return 0.5;
	}

	@Override
	public String description() {
		return "Mint";
	}

}
