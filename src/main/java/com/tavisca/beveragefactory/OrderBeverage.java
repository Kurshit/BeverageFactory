package com.tavisca.beveragefactory;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import com.tavisca.beveragefactory.beverages.Beverage;
import com.tavisca.beveragefactory.factory.BeverageFactory;

public class OrderBeverage {
	
	BeverageFactory factory = new BeverageFactory();

	public static void main(String[] args) {
		
		String input1 = "Chaai,-Sugar,-Milk";
		
		OrderBeverage orderBeverage = new OrderBeverage();
		
		System.out.println(orderBeverage.totalBill(input1));		

	}
	
	
	public double totalBill(String orderInput) {
		
		HashMap<String, List<String>> orderMap = parseOrder(orderInput);
		
		double totalBill = 0;
				
		for(String item : orderMap.keySet()) {
			
			Beverage beverage = factory.create(item);
			
			beverage.exclude(orderMap.get(item));
			
			totalBill = totalBill + beverage.cost();			
			
		}
		
		return totalBill;
	}
	
	public HashMap<String, List<String>> parseOrder(String orderString) {
		
		HashMap<String, List<String>> orderMap = new HashMap<>();
		
		String[] orderStringArray = orderString.split(",");
		
		int i = 0;
		
		int lengthOfOrderString = orderStringArray.length;
		
		while(i < lengthOfOrderString) {
			
			
			if(!orderStringArray[i].startsWith("-")) {
				
				String beverage = orderStringArray[i];
				List<String> ingredientsList = new ArrayList<>();
				
				i++;
				
				while(i<lengthOfOrderString && orderStringArray[i].startsWith("-")) {
					ingredientsList.add(orderStringArray[i].substring(1));
					i++;
				}
				
				orderMap.put(beverage, ingredientsList);
			}
			
			//System.out.println(orderMap);
			
		}
		
		return orderMap;	
		
	}
	
	

}
