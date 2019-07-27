package com.tavisca.beveragefactory.beverages;

import java.util.ArrayList;
import java.util.List;

import com.tavisca.beveragefactory.ingredients.Ingredients;
import com.tavisca.beveragefactory.ingredients.Lemon;
import com.tavisca.beveragefactory.ingredients.Mint;
import com.tavisca.beveragefactory.ingredients.Soda;
import com.tavisca.beveragefactory.ingredients.Soda;
import com.tavisca.beveragefactory.ingredients.Sugar;
import com.tavisca.beveragefactory.ingredients.Water;

public class Mojito extends Beverage {
	
	static List<Ingredients> ingredientList = new ArrayList<>();
		
	static {
		
		ingredientList.add(new Lemon());
		ingredientList.add(new Sugar());
		ingredientList.add(new Water());		
		ingredientList.add(new Soda());
		ingredientList.add(new Mint());
	}
	
	public void exclude(List<String> excludedItemsList) throws Exception {
		
		for(String item : excludedItemsList) {
			
			Beverage beverage = this.factory.create(item);
			
			if(beverage != null) {
				ingredientList.remove(beverage);
			}
			
		}
		
		if(ingredientList.isEmpty()) {
			throw new Exception("Can not exclude all ingredients");
		}
		
	}
	
	
	public Mojito() {
		this.beverageName = "Mojito"; 
	}
	
	@Override
	public double cost() {
		double totalCost = 0;
		for(Ingredients ingredient : ingredientList) {
			totalCost = totalCost + ingredient.cost();
		}
		
		return totalCost;
	}

	@Override
	public String description() {
		
		return "Mojito";
	}
	
	

}
