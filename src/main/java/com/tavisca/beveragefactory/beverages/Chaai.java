package com.tavisca.beveragefactory.beverages;

import java.util.ArrayList;
import java.util.List;

import com.tavisca.beveragefactory.ingredients.Ingredients;
import com.tavisca.beveragefactory.ingredients.Milk;
import com.tavisca.beveragefactory.ingredients.Sugar;
import com.tavisca.beveragefactory.ingredients.Tea;
import com.tavisca.beveragefactory.ingredients.Water;

public class Chaai extends Beverage {
	
	static List<Ingredients> ingredientList = new ArrayList<>();
		
	static {
		
		ingredientList.add(new Tea());
		ingredientList.add(new Milk());
		ingredientList.add(new Sugar());
		ingredientList.add(new Water());		
	}
	
	public void exclude(List<String> excludedItemsList) {
		
		for(String item : excludedItemsList) {
			
			Beverage beverage = this.factory.create(item);
			
			if(beverage != null) {
				ingredientList.remove(beverage);
			}
			
		}
		
	}
	
	
	public Chaai() {
		this.beverageName = "Chaai"; 
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
		
		return "Chaai";
	}
	
	

}
